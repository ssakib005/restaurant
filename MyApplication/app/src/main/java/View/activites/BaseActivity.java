package View.activites;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import View.adapter.RestaurantRecyclerAdapter;
import View.adapter.ViewPagerAdapter;
import View.fragment.HomeFragment;
import com.example.user.myapplication.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import database.RestaurantService;
import me.relex.circleindicator.CircleIndicator;
import models.Restaurant;

public class BaseActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private ActionBarDrawerToggle toggle;
    private RecyclerView recyclerView;
    private RestaurantService service = new RestaurantService();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarAction);         //Custom Toolbar
        setSupportActionBar(toolbar);


        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout_id);         //Drawer Layout
        NavigationView navigationView = (NavigationView) findViewById(R.id.navigationView_id);
        navigationView.setNavigationItemSelectedListener(this);


        toggle = new ActionBarDrawerToggle(this, drawerLayout,toolbar, R.string.open, R.string.close);
        drawerLayout.setDrawerListener(toggle);
        toggle.syncState();


        //View Pager
        final ViewPager pager = (ViewPager) findViewById(R.id.imagePager);
        final ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);
        pager.setAdapter(viewPagerAdapter);
        //Circle Indicator
        CircleIndicator indicator = (CircleIndicator) findViewById(R.id.imageCircle);
        indicator.setViewPager(pager);
        final Handler handler = new Handler();
        final Runnable runnable = new Runnable() {
            @Override
            public void run() {
                int i = pager.getCurrentItem();
                if (i == viewPagerAdapter.images.length - 1){
                    i = 0;
                    pager.setCurrentItem(i, true);
                }else {
                    i++;
                    pager.setCurrentItem(i, true);
                }
            }
        };
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(runnable);
            }
        }, 4000, 4000);


        recyclerView = (RecyclerView) findViewById(R.id.restaurantRecyclerViewId);

        List<Restaurant> restaurants = new ArrayList<>();

        for (Restaurant rt: service.getRestaurantService()){

            Restaurant restaurant = new Restaurant();

            restaurant.setId(rt.getId());
            restaurant.setAddress(rt.getAddress());
            restaurant.setDescription(rt.getDescription());
            restaurant.setImage(rt.getImage());
            restaurant.setName(rt.getName());

            restaurants.add(restaurant);
        }

        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new RestaurantRecyclerAdapter(this, restaurants));
    }
    //Create Option Menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_bar, menu);
        return true;
    }
    //Option Item Selected
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        switch (id){
            case R.id.search_id:
                Toast.makeText(this,"Search Bar", Toast.LENGTH_SHORT).show();
                break;
            case R.id.cart_id:
                Toast.makeText(this,"Cart", Toast.LENGTH_SHORT).show();
                break;
            case R.id.user_login:
                Intent i = new Intent(BaseActivity.this, LoginActivity.class);
                startActivity(i);
                break;
            default:
                return false;
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int id = menuItem.getItemId();
        menuItem.setChecked(true);
        switch (id){
            case R.id.log_out_id:
                Toast.makeText(this, "Log out", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}
