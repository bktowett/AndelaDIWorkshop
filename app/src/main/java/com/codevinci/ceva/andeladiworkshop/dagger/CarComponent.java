package com.codevinci.ceva.andeladiworkshop.dagger;

import com.codevinci.ceva.andeladiworkshop.MainActivity;
import com.codevinci.ceva.andeladiworkshop.model.Car;
import com.codevinci.ceva.andeladiworkshop.model.PetrolEngine;

import dagger.Component;

@Component(modules = {WheelsModule.class, DieselEngineModule.class})
public interface CarComponent {
    Car getCar();

    void inject(MainActivity mainActivity);
}
