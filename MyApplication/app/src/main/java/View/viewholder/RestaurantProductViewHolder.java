package View.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.user.myapplication.R;


public class RestaurantProductViewHolder extends RecyclerView.ViewHolder {

    public ImageView iv;
    public TextView nameTv, userQtyTv, priceTv, totalQtyTv, id;
    public LinearLayout linearLayout;


    public RestaurantProductViewHolder(View itemView) {
        super(itemView);

        id = (TextView) itemView.findViewById(R.id.productId);
        iv = (ImageView) itemView.findViewById(R.id.productImageId);
        nameTv = (TextView) itemView.findViewById(R.id.productNameId);
        userQtyTv = (TextView) itemView.findViewById(R.id.itemQtyByUser);
        priceTv = (TextView) itemView.findViewById(R.id.productPriceId);
        totalQtyTv = (TextView) itemView.findViewById(R.id.productQtyId);
        linearLayout = (LinearLayout) itemView.findViewById(R.id.productLayoutId);

    }
}
