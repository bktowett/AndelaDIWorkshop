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
    Car car1, car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*CarComponent carComponent = DaggerCarComponent.create();*///cant use create when we need to pass arguments
        /*CarComponent carComponent = DaggerCarComponent.builder()
                .dieselEngineModule(new DieselEngineModule(150))
                .build();*/

        CarComponent carComponent = DaggerCarComponent.builder()
                .horsePower(150)
                .engineCapacity(2700)
                .build();
        carComponent.inject(this);
        //car = carComponent.getCar();
        car1.drive();
        car2.drive();

        //uncomment these lines to see how the app would react when provided with different components
        /*CarComponent carComponent1 = DaggerCarComponent.builder()
                .horsePower(150)
                .engineCapacity(2700)
                .build();
        carComponent1.inject(this);

        CarComponent carComponent2 = DaggerCarComponent.builder()
                .horsePower(150)
                .engineCapacity(2700)
                .build();
        carComponent1.inject(this);

        carComponent1.getCar().drive();
        carComponent2.getCar().drive();*/
    }
}
