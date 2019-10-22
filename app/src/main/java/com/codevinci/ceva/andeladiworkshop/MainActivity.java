package com.codevinci.ceva.andeladiworkshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.codevinci.ceva.andeladiworkshop.dagger.CarComponent;
import com.codevinci.ceva.andeladiworkshop.dagger.DaggerCarComponent;
import com.codevinci.ceva.andeladiworkshop.model.Car;

public class MainActivity extends AppCompatActivity {
    private Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent carComponent = DaggerCarComponent.create();

        car = carComponent.getCar();
        car.drive();
    }
}
