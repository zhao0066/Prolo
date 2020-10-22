package com.example.prolo.Producer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.prolo.R;

import java.util.ArrayList;

public class ProductListActivity extends AppCompatActivity {
    ArrayList<ProductData> productList = new ArrayList<>();
    BaseAdapter productListAdapter;
    private Context thisApp;

    public static final String GROUP_ID = "GroupId";
    public static final String PRODUCT_ID = "ProductId";
    public static final String PRODUCT_DESCRIPTION = "ProductDescription";

    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_list);
        thisApp = this;

        // Populate product product list from database, hard coded now for prototype demo
        productList.add(new ProductData("1", "16", "Butter, whipped", ""));
        productList.add(new ProductData("1", "19", "Cheese, brick", ""));
        productList.add(new ProductData("1", "66", "Milk, dry whole", ""));
        productList.add(new ProductData("1", "87", "Egg, chicken, yolk, dried", ""));

        ListView productListView = findViewById(R.id.listProductList);
        productListView.setAdapter(productListAdapter = new ProductListAdapter());
        productListAdapter.notifyDataSetChanged();

        productListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Bundle dataToPass = new Bundle();
                dataToPass.putString(GROUP_ID, productList.get(position).getGroupId());
                dataToPass.putString(PRODUCT_ID, productList.get(position).getProductId());
                dataToPass.putString(PRODUCT_DESCRIPTION, productList.get(position).getProductId());

                Intent nextActivity = new Intent(ProductListActivity.this, ProductListActivity.class);
                nextActivity.putExtras(dataToPass);
                startActivity(nextActivity);
            }
        });

        Toolbar toolbar = findViewById(R.id.toolbarProductList);
        setSupportActionBar(toolbar);
    }

    private class ProductListAdapter extends BaseAdapter {
        @Override
        public int getCount() { return productList.size(); }

        @Override
        public Object getItem(int position) { return productList.get(position); }

        @Override
        public long getItemId(int position) { return position; }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View selectedRow = convertView;
            TextView groupIdView;
            TextView productIdView;
            TextView productDescriptionView;

            ProductData selectedProductData = (ProductData) getItem(position);

            selectedRow = getLayoutInflater().inflate(R.layout.product_item, null);

            groupIdView = selectedRow.findViewById(R.id.textViewGroupId2);
            productIdView = selectedRow.findViewById(R.id.textViewProductId);
            productDescriptionView = selectedRow.findViewById(R.id.textViewProductDescription);

            groupIdView.setText(selectedProductData.getGroupId());
            productIdView.setText(selectedProductData.getProductId());
            productDescriptionView.setText(selectedProductData.getProductDescription());

            return selectedRow;
        }
    }

}
