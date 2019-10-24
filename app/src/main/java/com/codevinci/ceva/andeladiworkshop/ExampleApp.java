package com.codevinci.ceva.andeladiworkshop;

import android.app.Application;

import com.codevinci.ceva.andeladiworkshop.dagger.ActivityComponent;
import com.codevinci.ceva.andeladiworkshop.dagger.AppComponent;
import com.codevinci.ceva.andeladiworkshop.dagger.DaggerAppComponent;

public class ExampleApp extends Application {
    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerAppComponent.create();
    }

    public AppComponent getAppComponent(){
        return component;
    }
}
