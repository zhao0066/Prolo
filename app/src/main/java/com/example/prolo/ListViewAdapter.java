package com.example.prolo;

import android.content.Context;
import android.icu.util.ULocale;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ListViewAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    private List<Row> temp_dataset = null;
    private ArrayList<Row> arrayList;
    private ArrayList<Row> empty;

    public ListViewAdapter(Context context, List<Row> temp_dataset) {
        this.context = context;
        this.temp_dataset = temp_dataset;
        layoutInflater = LayoutInflater.from(context);
        this.arrayList = new ArrayList<Row>();
        this.arrayList.addAll(temp_dataset);
    }


    public void filter(String searchText) {


        searchText = searchText.toLowerCase(Locale.getDefault());
        temp_dataset.clear();

        if (searchText.length() == 0){

            //temp_dataset.addAll(arrayList);
        }else{
            for (Row result : arrayList){
                Log.d("Result Looked: ", "" + result);
                if(result.getProduct().toLowerCase(Locale.getDefault()).contains(searchText)){
                    Log.d("Result Found: ", "" + result.getProduct().toLowerCase(Locale.getDefault()));
                    temp_dataset.add(result);
                }
            }
        }
        notifyDataSetChanged();
    }


    @Override
    public int getCount() {
        return temp_dataset.size();
    }

    @Override
    public Object getItem(int i) {
        return temp_dataset.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final ViewHolder viewHolder;



        if(view == null){
            viewHolder = new ViewHolder();
            view = layoutInflater.inflate(R.layout.prolo_list_view_item, null);
            viewHolder.title = (TextView) view.findViewById(R.id.produce_title);
            view.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) view.getTag();
        }

        viewHolder.title.setText(temp_dataset.get(i).getProduct().toString());
        return view;
    }

    public class ViewHolder {
        TextView title;
    }
}
