package com.codevinci.ceva.andeladiworkshop.model;

import android.util.Log;

import com.codevinci.ceva.andeladiworkshop.dagger.qualifiers.HorsePower;

import javax.inject.Inject;
import javax.inject.Named;

public class PetrolEngine implements Engine {
    private static final String TAG = "Car";

    private int horsePower;
    private int engineCapacity;

    @Inject
    public PetrolEngine(@HorsePower int horsePower, @Named("enginecapacity") int engineCapacity) {
        this.horsePower = horsePower;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void start() {
        Log.d(TAG, "Petrol engine started.\nHorsepower: "+horsePower+"\nEngine Capacity: "+engineCapacity);
    }
}
