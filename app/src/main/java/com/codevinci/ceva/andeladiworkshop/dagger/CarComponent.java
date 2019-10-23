package com.codevinci.ceva.andeladiworkshop.dagger;

import com.codevinci.ceva.andeladiworkshop.MainActivity;
import com.codevinci.ceva.andeladiworkshop.dagger.qualifiers.HorsePower;
import com.codevinci.ceva.andeladiworkshop.model.Car;
import com.codevinci.ceva.andeladiworkshop.model.PetrolEngine;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {
    Car getCar();

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder horsePower(@HorsePower int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("enginecapacity") int engineCapacity);

        CarComponent build();
    }
}
