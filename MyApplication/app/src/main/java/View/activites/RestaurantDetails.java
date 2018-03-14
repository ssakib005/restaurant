package View.activites;

import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

import com.example.user.myapplication.R;

import View.adapter.RestaurantDetailsAdapter;
import View.fragment.HomeFragment;
import database.CategoryList;
import database.RestaurantService;
import models.Restaurant;
import models.RestaurantCategory;

import java.util.ArrayList;
import java.util.List;

public class RestaurantDetails extends AppCompatActivity implements HomeFragment.OnFragmentInteractionListener {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    private static List<Fragment> myFragmentList = new ArrayList<>();
    private static List<String> myFragmentTitleList = new ArrayList<>();
    private static List<String> categoryId  = new ArrayList<>();

    private static final RestaurantService service = new RestaurantService();
    private static CategoryList categoryList = new CategoryList();
    private static RestaurantCategory category = new RestaurantCategory();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_details);

        toolbar = (Toolbar) findViewById(R.id.toolbarAction);
        setSupportActionBar(toolbar);

        int id = getIntent().getExtras().getInt("id");
        viewPager = (ViewPager) findViewById(R.id.restaurantPagerView);
        tabLayout = (TabLayout) findViewById(R.id.restaurantCategoryTabView);
        ImageView iv = (ImageView) findViewById(R.id.restaurantImageId);

        for (Restaurant res: service.getRestaurantService()){
            if (res.getId() == id){
                iv.setImageResource(res.getImage());
            }
        }

        for (RestaurantCategory category: categoryList.getByRestaurantId(id)){
            tabLayout.addTab(tabLayout.newTab().setText(category.getName()));
            myFragmentTitleList.add(category.getName());
            myFragmentList.add(new HomeFragment());

        }
        RestaurantDetailsAdapter adapter = new RestaurantDetailsAdapter(this.getSupportFragmentManager(), myFragmentList, myFragmentTitleList);
        viewPager.setOffscreenPageLimit(0);
        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}