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

    private final List<Fragment> myFragmentList = new ArrayList<>();
    private final List<String> myFragmentTitleList = new ArrayList<>();
    private static List<String> categoryId  = new ArrayList<>();

    private static final RestaurantService service = new RestaurantService();
    private static CategoryList categoryList = new CategoryList();
    private static RestaurantCategory category = new RestaurantCategory();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_details);

        ImageView iv = (ImageView) findViewById(R.id.restaurantImageId); // For display restaurant image
        viewPager = (ViewPager) findViewById(R.id.restaurantPagerView);
        tabLayout = (TabLayout) findViewById(R.id.restaurantCategoryTabView);
        toolbar = (Toolbar) findViewById(R.id.toolbarAction); // For enable toolbar
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        int id = getIntent().getExtras().getInt("id"); // get Restaurant Id

        for (Restaurant res: service.getRestaurantService()){
            if (res.getId() == id){
                iv.setImageResource(res.getImage());
            }
        }



        for (RestaurantCategory category: categoryList.getByRestaurantId(id)){

            myFragmentTitleList.add(category.getName());
            myFragmentList.add(new HomeFragment());

        }

        final RestaurantDetailsAdapter adapter = new RestaurantDetailsAdapter(getSupportFragmentManager(), myFragmentList, myFragmentTitleList);
        viewPager.setAdapter(adapter);


        tabLayout.setupWithViewPager(viewPager);
        viewPager.setOffscreenPageLimit(myFragmentList.size());
        tabLayout.setTabsFromPagerAdapter(adapter);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
