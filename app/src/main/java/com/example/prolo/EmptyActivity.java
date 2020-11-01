package com.example.prolo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class EmptyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.search_result_fragment);

        Row row = (Row) getIntent().getSerializableExtra("ROW");

        //Inflate the layout for this fragment


        TextView produce_title = findViewById(R.id.produce_title);
        produce_title.setText(row.getProduct());

        TextView address = findViewById(R.id.address);
        address.setText("Address: " + row.getCompanyName());

        TextView website = findViewById(R.id.website);
        website.setText("Website: " + row.getWebsite());
        //website.setText(Html.fromHtml("<a href='" + row.getWebsite() + "//'>" + "Website: " + row.getWebsite() + "</a>"));
        //website.setMovementMethod(LinkMovementMethod.getInstance());

        TextView companyName = findViewById(R.id.companyName);
        companyName.setText("Company: " + row.getCompanyName());

        TextView contact_names = findViewById(R.id.contacts);
        contact_names.setText("Contact(s): " + row.getContact_name());

        TextView email = findViewById(R.id.email);
        email.setText("Email: " + row.getEmail());

        TextView phone = findViewById(R.id.phone);
        phone.setText("Phone Number: " + row.getPhone());


//        ;
//        setTitle("View Product");
//        Bundle dataToPass = getIntent().getExtras();


//        Search_Result_Fragment dFragment = new Search_Result_Fragment(); //add a DetailFragment
//        dFragment.setArguments( dataToPass ); //pass it a bundle for information
//        dFragment.setTablet(true);  //tell the fragment if it's running on a tablet or not
//        getSupportFragmentManager()
//                .beginTransaction()
//                .add(R.id.fragmentLocation, dFragment) //Add the fragment in FrameLayout
//                .addToBackStack("AnyName") //make the back button undo the transaction
//                .commit(); //actually load the fragment.
    }



}
