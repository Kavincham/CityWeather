package com.example.cityweather;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText citytext;
    private TextView currenttime, geotlocation, weatherinfo;
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        citytext = findViewById(R.id.citytext);
        currenttime = findViewById(R.id.currenttime);
        geotlocation = findViewById(R.id.geotlocation);
        weatherinfo = findViewById(R.id.weatherinfo);
        Button fetchButton = findViewById(R.id.fetchbutton);

        sharedPreferences = getSharedPreferences("WeatherApp", MODE_PRIVATE);
        citytext.setText(sharedPreferences.getString("lastCity", ""));

        fetchButton.setOnClickListener(v -> fetchWeatherData());




    }

    private void fetchWeatherData() {
String cityName = citytext.getText().toString();
if(cityName.isEmpty()){
    Toast.makeText(this, "Please enter a city name", Toast.LENGTH_SHORT).show();

return;
    }


}
}