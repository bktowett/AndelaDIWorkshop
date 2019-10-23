package com.codevinci.ceva.andeladiworkshop.dagger;

import com.codevinci.ceva.andeladiworkshop.model.DieselEngine;
import com.codevinci.ceva.andeladiworkshop.model.Engine;
import com.codevinci.ceva.andeladiworkshop.model.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {
    @Binds
    abstract Engine bindEngine(DieselEngine engine);
}
