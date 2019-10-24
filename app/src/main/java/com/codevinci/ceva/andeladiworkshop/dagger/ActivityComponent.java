package com.codevinci.ceva.andeladiworkshop.dagger;

import com.codevinci.ceva.andeladiworkshop.MainActivity;
import com.codevinci.ceva.andeladiworkshop.dagger.qualifiers.HorsePower;
import com.codevinci.ceva.andeladiworkshop.dagger.scopes.PerActivityScope;
import com.codevinci.ceva.andeladiworkshop.model.Car;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@PerActivityScope
@Component(dependencies = AppComponent.class, modules = {WheelsModule.class, PetrolEngineModule.class})
public interface ActivityComponent {
    Car getCar();

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder horsePower(@HorsePower int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("enginecapacity") int engineCapacity);

        Builder appComponent(AppComponent component);

        ActivityComponent build();
    }
}
