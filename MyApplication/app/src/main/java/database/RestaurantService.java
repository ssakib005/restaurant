package database;

import com.example.user.myapplication.R;
import models.Restaurant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RestaurantService {



    List<Restaurant> restaurants = Arrays.asList(

            new Restaurant(1, "Restaurant1", "Description1", "Address1", R.drawable.restaurant1),
            new Restaurant(2, "Restaurant2", "Description2", "Address2", R.drawable.restaurant2),
            new Restaurant(3, "Restaurant3", "Description3", "Address3", R.drawable.restaurant3),
            new Restaurant(4, "Restaurant4", "Description4", "Address4", R.drawable.restaurant4),
            new Restaurant(5, "Restaurant5", "Description5", "Address5", R.drawable.restaurant5),
            new Restaurant(6, "Restaurant6", "Description6", "Address6", R.drawable.restaurant6),
            new Restaurant(7, "Restaurant7", "Description7", "Address7", R.drawable.restaurant7),
            new Restaurant(8, "Restaurant8", "Description8", "Address8", R.drawable.restaurant8),
            new Restaurant(9, "Restaurant9", "Description9", "Address9", R.drawable.restaurant9),
            new Restaurant(10, "Restaurant10", "Description10", "Address10", R.drawable.restaurant10)
    );

    public List<Restaurant> getRestaurantService(){
        return restaurants;
    }

    public List<Restaurant> getRestaurantById(int id) {

        List<Restaurant> selectedRestaurant = new ArrayList<>();

        for (Restaurant res : restaurants) {

            if (res.getId() == id) {
                selectedRestaurant.add(res);
            }
        }
        return selectedRestaurant;
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(List<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }
}

