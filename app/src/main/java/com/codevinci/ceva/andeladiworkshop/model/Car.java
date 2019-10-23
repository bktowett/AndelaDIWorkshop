package com.codevinci.ceva.andeladiworkshop.model;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";
    private Driver driver;
    @Inject Engine engine; //field injection
    private Wheels wheels;

    @Inject //constructor injection
    public Car(Driver driver,Wheels wheels) {
        this.driver = driver;
        this.wheels = wheels;
    }

    @Inject //method injection - passing the injected object itself to the dependency
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }

    public void drive(){
        engine.start();//shows us which engine is set
        Log.d(TAG, driver+ " drives "+this);
    }
}
