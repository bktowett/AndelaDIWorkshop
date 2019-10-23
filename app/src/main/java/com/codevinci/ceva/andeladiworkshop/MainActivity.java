package com.codevinci.ceva.andeladiworkshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.codevinci.ceva.andeladiworkshop.dagger.CarComponent;
import com.codevinci.ceva.andeladiworkshop.dagger.DaggerCarComponent;
import com.codevinci.ceva.andeladiworkshop.dagger.DieselEngineModule;
import com.codevinci.ceva.andeladiworkshop.model.Car;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject //field injection - we cant make the member private
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*CarComponent carComponent = DaggerCarComponent.create();*///cant use create when we need to pass arguments
        CarComponent carComponent = DaggerCarComponent.builder()
                .dieselEngineModule(new DieselEngineModule(150))
                .build();

        carComponent.inject(this);

        /*car = carComponent.getCar();*/
        car.drive();
    }
}
