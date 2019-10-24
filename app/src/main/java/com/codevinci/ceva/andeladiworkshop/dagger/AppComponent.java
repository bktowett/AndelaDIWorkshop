package com.codevinci.ceva.andeladiworkshop.dagger;

import com.codevinci.ceva.andeladiworkshop.model.Driver;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {

    Driver getDriver();
}
