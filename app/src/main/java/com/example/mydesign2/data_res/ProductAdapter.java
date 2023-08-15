package com.example.mydesign2.data_res;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.mydesign2.R;
import com.example.mydesign2.data_res.ProdectList;

import java.util.ArrayList;
import java.util.List;

public class ProductAdapter extends ArrayAdapter<ProdectList> {


    public ProductAdapter(@NonNull Context context, ArrayList<ProdectList> productModelArrayList) {
        super(context, 0, productModelArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listitemView = convertView;
        if (listitemView == null) {
            // Layout Inflater inflates each item to be displayed in GridView.
            listitemView = LayoutInflater.from(getContext()).inflate(R.layout.product_view, parent, false);
        }

        ProdectList prodect = getItem(position);
        TextView productName = listitemView.findViewById(R.id.txt_id);
        TextView productPrice = listitemView.findViewById(R.id.txt2_id);
        ImageView productImg = listitemView.findViewById(R.id.img_id);


        productName.setText(prodect.getName());
        productPrice.setText(prodect.getPrice());
        productImg.setImageResource(prodect.getImage());

        return listitemView;
    }
}

