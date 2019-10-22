package com.codevinci.ceva.andeladiworkshop.model;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";
    @Inject Engine engine; //field injection
    private Wheels wheels;

    @Inject //constructor injection
    public Car(Wheels wheels) {
        this.wheels = wheels;
    }

    @Inject //method injection - passing the injected object itself to the dependency
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }
    public void drive(){
        Log.d(TAG, "driving...");
    }
}
