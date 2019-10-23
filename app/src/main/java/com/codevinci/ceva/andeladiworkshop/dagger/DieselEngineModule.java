package com.codevinci.ceva.andeladiworkshop.dagger;

import com.codevinci.ceva.andeladiworkshop.model.DieselEngine;
import com.codevinci.ceva.andeladiworkshop.model.Engine;
import com.codevinci.ceva.andeladiworkshop.model.PetrolEngine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {
    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    Engine provideEngine(){
        return new DieselEngine(horsePower);
    }
}
