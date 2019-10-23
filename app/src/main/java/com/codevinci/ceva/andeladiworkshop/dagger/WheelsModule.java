package com.codevinci.ceva.andeladiworkshop.dagger;

import com.codevinci.ceva.andeladiworkshop.model.Rims;
import com.codevinci.ceva.andeladiworkshop.model.Tyres;
import com.codevinci.ceva.andeladiworkshop.model.Wheels;

import dagger.Module;
import dagger.Provides;

@Module //classes that contribute to the object graph over methods
public class WheelsModule {

    //we tell dagger how it can provide rims
    @Provides
    Rims provideRims() {
        return new Rims();
    }

    @Provides
    Tyres provideTyres() {
        //we can use these provides methods to do config on objects before returning them
        Tyres tyres = new Tyres();
        tyres.inflate();
        return tyres;
    }

    @Provides
    Wheels provideWheels(Rims rims, Tyres tyres) {
        return new Wheels(rims, tyres);
    }
}
