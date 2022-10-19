package mo.atef.codingwithnerds.codingwithnerds;

import android.util.Log;

import javax.inject.Inject;

public class Coffee {

    @Inject
    Farm farm;

    @Inject
    River river;

    @Inject
    public Coffee() {
    }

    public String getCoffeeCup(){
        return farm.getBeans()+" + "+ river.getWater();
    }

    @Inject
    public void connectElectricity(){
        Log.v("AtefLogs", "connecting electricity ...");
    }
}
