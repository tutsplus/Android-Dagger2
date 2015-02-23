package com.androidheroes.tutsplusdagger;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.androidheroes.tutsplusdagger.component.Dagger_VehicleComponent;
import com.androidheroes.tutsplusdagger.component.VehicleComponent;
import com.androidheroes.tutsplusdagger.model.Vehicle;
import com.androidheroes.tutsplusdagger.module.VehicleModule;

public class MainActivity extends ActionBarActivity {

    Vehicle vehicle;

    TextView speedValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        speedValue = (TextView) findViewById(R.id.current_speed_value);

        VehicleComponent component = Dagger_VehicleComponent.builder().vehicleModule(new VehicleModule()).build();

        vehicle = component.provideVehicle();

        speedValue.setText(String.valueOf(vehicle.getSpeed()));
    }

    public void callBrake(View v){
        vehicle.stop();
        speedValue.setText(String.valueOf(vehicle.getSpeed()));
    }

    public void callIncrease(View v){
        vehicle.increaseSpeed(10);
        speedValue.setText(String.valueOf(vehicle.getSpeed()));
    }
}