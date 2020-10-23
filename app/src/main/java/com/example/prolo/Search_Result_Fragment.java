package com.example.prolo;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class Search_Result_Fragment extends Fragment {
    private boolean isTablet;
    private Bundle dataFromActivity;

    public void setTablet(boolean tablet) {
        isTablet = tablet;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        dataFromActivity = getArguments();
        Row row = (Row) getArguments().getSerializable("row");


        //Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.search_result_fragment, container, false);

        TextView produce_title = view.findViewById(R.id.produce_title);
        produce_title.setText(row.getProduct());

        TextView address = view.findViewById(R.id.address);
        address.setText("Address: " + row.getCompanyName());

        TextView website = view.findViewById(R.id.website);
        website.setText("Website: " + row.getWebsite());
        //website.setText(Html.fromHtml("<a href='" + row.getWebsite() + "//'>" + "Website: " + row.getWebsite() + "</a>"));
        //website.setMovementMethod(LinkMovementMethod.getInstance());

        TextView companyName = view.findViewById(R.id.companyName);
        companyName.setText("Company: " + row.getCompanyName());

        TextView contact_names = view.findViewById(R.id.contacts);
        contact_names.setText("Contact(s): " + row.getContact_name());

        TextView email = view.findViewById(R.id.email);
        email.setText("Email: " + row.getEmail());

        TextView phone = view.findViewById(R.id.phone);
        phone.setText("Phone Number: " + row.getPhone());

        return view;
    }




}
