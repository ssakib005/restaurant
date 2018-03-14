package View.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.user.myapplication.R;

public class Recycler_ViewHolder extends RecyclerView.ViewHolder {


    public ImageView imageView;
    public TextView name;
    public TextView description;
    public TextView address, id;
    public LinearLayout linearLayout;

    public Recycler_ViewHolder(View itemView) {
        super(itemView);

    }
}
