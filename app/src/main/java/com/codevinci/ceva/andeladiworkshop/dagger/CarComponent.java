package com.codevinci.ceva.andeladiworkshop.dagger;

import com.codevinci.ceva.andeladiworkshop.model.Car;

import dagger.Component;

@Component
public interface CarComponent {
    Car getCar();
}
