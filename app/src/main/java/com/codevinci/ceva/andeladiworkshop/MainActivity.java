package com.codevinci.ceva.andeladiworkshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.codevinci.ceva.andeladiworkshop.dagger.ActivityComponent;
import com.codevinci.ceva.andeladiworkshop.dagger.DaggerActivityComponent;
import com.codevinci.ceva.andeladiworkshop.model.Car;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject //field injection - we cant make the member private
    Car car1, car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*ActivityComponent activityComponent = DaggerActivityComponent.create();*///cant use create when we need to pass arguments
        /*ActivityComponent activityComponent = DaggerActivityComponent.builder()
                .dieselEngineModule(new DieselEngineModule(150))
                .build();*/

        //uncomment these lines to see how the app would react when provided with different components
        /*ActivityComponent carComponent1 = DaggerActivityComponent.builder()
                .horsePower(150)
                .engineCapacity(2700)
                .build();
        carComponent1.inject(this);

        ActivityComponent carComponent2 = DaggerActivityComponent.builder()
                .horsePower(150)
                .engineCapacity(2700)
                .build();
        carComponent1.inject(this);

        carComponent1.getCar().drive();
        carComponent2.getCar().drive();*/

        /*ActivityComponent activityComponent = ((ExampleApp)getApplication()).getAppComponent();
        activityComponent.inject(this);*/
        ActivityComponent component = DaggerActivityComponent.builder()
                .engineCapacity(150)
                .horsePower(4000)
                .appComponent(((ExampleApp)getApplication()).getAppComponent())
                .build();
        component.inject(this);
        //car = activityComponent.getCar();
        car1.drive();
        car2.drive();
    }
}
