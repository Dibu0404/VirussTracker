package com.example.virusstracker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class CountryDetail extends AppCompatActivity {

    TextView tvCountry, tvCases, tvRecovered, tvCritical, tvActive, tvTodayCases, tvTotalDeaths, tvTodayDeaths;
    private int positionCountry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailactivity);

        Intent intent = getIntent();
        positionCountry = intent.getIntExtra("position", 0);

        getSupportActionBar().setTitle("Details of " + CountryData.countryModelList.get(positionCountry).getCountry());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        tvCountry = findViewById(R.id.tvCountry);
        tvCases = findViewById(R.id.tvCases);
        tvRecovered = findViewById(R.id.tvRecovered);
        tvCritical = findViewById(R.id.tvCritical);
        tvActive = findViewById(R.id.tvActive);
        tvTodayCases = findViewById(R.id.tvTodayCases);
        tvTotalDeaths = findViewById(R.id.tvDeaths);
        tvTodayDeaths = findViewById(R.id.tvTodayDeaths);

        tvCountry.setText(CountryData.countryModelList.get(positionCountry).getCountry());
        tvCases.setText(CountryData.countryModelList.get(positionCountry).getCases());
        tvRecovered.setText(CountryData.countryModelList.get(positionCountry).getRecoverd());
        tvCritical.setText(CountryData.countryModelList.get(positionCountry).getCritical());
        tvActive.setText(CountryData.countryModelList.get(positionCountry).getActive());
        tvTodayCases.setText(CountryData.countryModelList.get(positionCountry).getTodayCases());
        tvTodayDeaths.setText(CountryData.countryModelList.get(positionCountry).getTodayDeadths());
        tvTotalDeaths.setText(CountryData.countryModelList.get(positionCountry).getDeaths());

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}