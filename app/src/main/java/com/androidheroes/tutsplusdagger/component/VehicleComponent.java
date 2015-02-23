package com.androidheroes.tutsplusdagger.component;

import com.androidheroes.tutsplusdagger.model.Vehicle;
import com.androidheroes.tutsplusdagger.module.VehicleModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by kerry on 14/02/15.
 */

@Singleton

//Step 1
@Component(modules = {VehicleModule.class})
public interface VehicleComponent {

    //Step 2
    Vehicle provideVehicle();

}