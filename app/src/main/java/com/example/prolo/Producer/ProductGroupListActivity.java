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

public class ProductGroupListActivity extends AppCompatActivity {

    ArrayList<GroupData> groupList = new ArrayList<>();
    BaseAdapter groupListAdapter;
    private Context thisApp;

    public static final String GROUP_ID = "GroupId";
    public static final String GROUP_NAME = "GroupName";

    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_group_list);
        thisApp = this;

        // Populate product group list from database, hard coded now for prototype demo
        groupList.add(new GroupData("1", "Dairy and Egg Products"));
        groupList.add(new GroupData("2", "Spices and Herbs"));
        groupList.add(new GroupData("3", "Babyfoods"));
        groupList.add(new GroupData("4", "Fats and Oils"));
        groupList.add(new GroupData("5", "Poultry Products"));
        groupList.add(new GroupData("6", "Soups, Sauces and Gravies"));
        groupList.add(new GroupData("7", "Sausages and Luncheon meats"));
        groupList.add(new GroupData("8", "Breakfast cereals"));
        groupList.add(new GroupData("9", "Fruits and fruit juices"));
        groupList.add(new GroupData("10", "Pork Products"));
        groupList.add(new GroupData("11", "Vegetables and Vegetable Products"));
        groupList.add(new GroupData("12", "Nuts and Seeds"));
        groupList.add(new GroupData("13", "Beef Products"));
        groupList.add(new GroupData("14", "Beverages"));
        groupList.add(new GroupData("15", "Finfish and Shellfish Products"));
        groupList.add(new GroupData("16", "Legumes and Legume Products"));
        groupList.add(new GroupData("17", "Lamb, Veal and Game"));
        groupList.add(new GroupData("18", "Baked Products"));
        groupList.add(new GroupData("19", "Sweets"));
        groupList.add(new GroupData("20", "Cereals, Grains and Pastas"));
        groupList.add(new GroupData("21", "Fast Foods"));
        groupList.add(new GroupData("22", "Mixed Dishes"));
        groupList.add(new GroupData("23", "Reserved"));
        groupList.add(new GroupData("24", "Reserved"));
        groupList.add(new GroupData("25", "Snacks"));


        ListView groupListView = findViewById(R.id.listGroupList);
        groupListView.setAdapter(groupListAdapter = new GroupListAdapter());
        groupListAdapter.notifyDataSetChanged();

        groupListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Bundle dataToPass = new Bundle();
                dataToPass.putString(GROUP_ID, groupList.get(position).getGroupId());
                dataToPass.putString(GROUP_NAME, groupList.get(position).getGroupName());

                Intent nextActivity = new Intent(ProductGroupListActivity.this, ProductListActivity.class);
                nextActivity.putExtras(dataToPass);
                startActivity(nextActivity);
            }
        });

        Toolbar toolbar = findViewById(R.id.toolbarGroupList);
        setSupportActionBar(toolbar);
    }

    private class GroupListAdapter extends BaseAdapter {
        @Override
        public int getCount() { return groupList.size(); }

        @Override
        public Object getItem(int position) { return groupList.get(position); }

        @Override
        public long getItemId(int position) { return position; }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View selectedRow = convertView;
            TextView groupIdView;
            TextView groupNameView;

            GroupData selectedGroupData = (GroupData) getItem(position);

            selectedRow = getLayoutInflater().inflate(R.layout.product_group_item, null);
            groupIdView = selectedRow.findViewById(R.id.textViewGroupId);
            groupNameView = selectedRow.findViewById(R.id.textViewGroupName);

            groupIdView.setText(selectedGroupData.getGroupId());
            groupNameView.setText(selectedGroupData.getGroupName());

            return selectedRow;
        }
    }
}