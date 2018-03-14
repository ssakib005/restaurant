package View.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.example.user.myapplication.R;
import View.activites.RestaurantDetails;
import View.viewholder.RestaurantViewHolder;
import models.Restaurant;
import java.util.List;


public class RestaurantRecyclerAdapter extends RecyclerView.Adapter<RestaurantViewHolder> {

    private List<Restaurant> restaurants;
    private Context context;

    public RestaurantRecyclerAdapter(Context context, List<Restaurant> restaurants) {

        this.context = context;
        this.restaurants = restaurants;
    }


    @Override
    public RestaurantViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.restaurant_view_holder, parent, false);
        return new RestaurantViewHolder(view) ;
    }
    @Override
    public void onBindViewHolder(RestaurantViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        final Restaurant restaurant = restaurants.get(position);
        holder.id.setText(String.valueOf(restaurant.getId()));
        holder.name.setText(restaurant.getName());
        holder.imageView.setImageResource(restaurant.getImage());
        holder.location.setText(restaurant.getAddress());
        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, RestaurantDetails.class);
                intent.putExtra("id", restaurant.getId());
                context.startActivity(intent);
                Toast.makeText(context, "Item "+ position+ " Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    public int getItemCount() {
        return restaurants.size();
    }
}
