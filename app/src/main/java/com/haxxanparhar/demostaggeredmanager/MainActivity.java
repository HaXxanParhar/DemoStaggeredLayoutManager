package com.haxxanparhar.demostaggeredmanager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.rv_sponsor_logo);

        List<SponsorLogo> list = new ArrayList<>();
        list.add(new SponsorLogo(R.drawable.sponsor_one));
        list.add(new SponsorLogo(R.drawable.sponsor_four));
        list.add(new SponsorLogo(R.drawable.sponsor_two));
        list.add(new SponsorLogo(R.drawable.sponsor_three));
        list.add(new SponsorLogo(R.drawable.sponsor_one));
        list.add(new SponsorLogo(R.drawable.sponsor_two));
        list.add(new SponsorLogo(R.drawable.sponsor_four));
        list.add(new SponsorLogo(R.drawable.sponsor_two));
        list.add(new SponsorLogo(R.drawable.sponsor_three));
        list.add(new SponsorLogo(R.drawable.sponsor_one));
        list.add(new SponsorLogo(R.drawable.sponsor_two));
        list.add(new SponsorLogo(R.drawable.sponsor_four));
        list.add(new SponsorLogo(R.drawable.sponsor_three));
        list.add(new SponsorLogo(R.drawable.sponsor_two));
        list.add(new SponsorLogo(R.drawable.sponsor_four));
        list.add(new SponsorLogo(R.drawable.sponsor_two));
        list.add(new SponsorLogo(R.drawable.sponsor_three));
        list.add(new SponsorLogo(R.drawable.sponsor_one));
        list.add(new SponsorLogo(R.drawable.sponsor_two));
        list.add(new SponsorLogo(R.drawable.sponsor_four));
        list.add(new SponsorLogo(R.drawable.sponsor_three));

        SponsorLogoAdapter adapter = new SponsorLogoAdapter(this, list);

        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.HORIZONTAL));
        recyclerView.setAdapter(adapter);
    }
}