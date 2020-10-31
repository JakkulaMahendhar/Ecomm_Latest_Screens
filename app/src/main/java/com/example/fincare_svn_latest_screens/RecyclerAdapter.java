package com.example.fincare_svn_latest_screens;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import org.json.JSONObject;

import java.util.List;

/**
 * Created by Administrator on 4/15/2019.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ProductList>  {

    //this context we will use to inflate the layout
    private Context mCtx;

    //we are storing all the products in a list
    private List<Product> productList;

    public boolean isopendialog = false;


    //getting the context and product list with constructor
    public RecyclerAdapter(Context mCtx, List<Product> productList) {
        this.mCtx = mCtx;
        this.productList = productList;
    }
    @Override
    public ProductList onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.custom_recycler, null);
        return new ProductList(view);
    }

    @Override
    public void onBindViewHolder(final ProductList holder, int position) {
        //getting the product of the specified position
        Product product = productList.get(position);

        //binding the data with the viewholder views
        holder.textViewTitle.setText(product.getTitle());
        holder.textViewPrice.setText(String.valueOf(product.getPrice()));
        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(product.getImage()));

    }

    @Override
    public int getItemCount() {
        return productList.size();
    }
    public class ProductList extends RecyclerView.ViewHolder {
        TextView textViewTitle, textViewShortDesc, textViewRating, textViewPrice;
        ImageView imageView,img_note;

        public ProductList(View itemView) {
            super(itemView);
            textViewTitle = itemView.findViewById(R.id.tv_title);
            textViewPrice = itemView.findViewById(R.id.tv_price);
            imageView = itemView.findViewById(R.id.img_product);


        }
    }
}
