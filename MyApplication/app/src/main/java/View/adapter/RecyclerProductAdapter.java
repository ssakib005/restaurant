package View.adapter;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.user.myapplication.R;

import java.util.List;

import View.viewholder.RestaurantProductViewHolder;
import models.RestaurantProduct;

public class RecyclerProductAdapter extends RecyclerView.Adapter<RestaurantProductViewHolder> {


    private Context context;
    private List<RestaurantProduct> restaurantProducts;

    public RecyclerProductAdapter(Context context, List<RestaurantProduct> restaurantProducts) {
        this.context = context;
        this.restaurantProducts = restaurantProducts;
    }

    @Override
    public RestaurantProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_product_list, parent, false);
        return new RestaurantProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final RestaurantProductViewHolder holder, int position) {

        final RestaurantProduct product = restaurantProducts.get(position);

        holder.id.setText(String.valueOf(product.getId()));
        holder.nameTv.setText(product.getName());
        holder.priceTv.setText(String.valueOf(product.getPrice()));
        holder.totalQtyTv.setText(String.valueOf(product.getQuantity()));
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {

            int counter = 0;
            @Override
            public void onClick(View view) {
                holder.userQtyTv.setVisibility(View.VISIBLE);
                holder.userQtyTv.setText(String.valueOf(counter++));
            }
        });
    }

    @Override
    public int getItemCount() {
        return restaurantProducts.size();
    }
}
