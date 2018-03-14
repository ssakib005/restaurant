package View.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.user.myapplication.R;


public class RestaurantViewHolder extends RecyclerView.ViewHolder {

    public ImageView imageView;
    public TextView rating, id, name, location;
    public LinearLayout layout;


    public RestaurantViewHolder(View itemView) {
        super(itemView);

        id = (TextView) itemView.findViewById(R.id.restaurantId);
        imageView = (ImageView) itemView.findViewById(R.id.restaurantImages);
        name = (TextView) itemView.findViewById(R.id.restaurantName);
        location = (TextView) itemView.findViewById(R.id.restaurantLocation);
        rating = (TextView) itemView.findViewById(R.id.restaurantRating);
        layout = (LinearLayout) itemView.findViewById(R.id.restaurantViewHolder);

    }
}
