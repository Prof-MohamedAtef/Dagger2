package mo.atef.codingwithnerds.codingwithnerds;

import android.util.Log;

import javax.inject.Inject;

public class Coffee {


    @Inject
    Farm farm;

    River river;

    @Inject
    int sugar;

    @Inject
    public Coffee(River river, int sugar) {
        this.river=river;
        this.sugar=sugar;
    }

    public String getCoffeeCup(){
        return farm.getBeans()+" + "+ river.getWater()+ "sugar: "+sugar;
    }

    @Inject
    public void connectElectricity(){
        Log.v("AtefLogs", "connecting electricity ...");
    }
}
