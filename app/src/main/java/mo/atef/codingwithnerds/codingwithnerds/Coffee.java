package mo.atef.codingwithnerds.codingwithnerds;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

@ActivityScope
public class Coffee {


    @Inject
    Farm farm;

    River river;

    int sugar;

    int milk;


    @Inject
    public Coffee(River river, @Sugar int sugar, @Milk int milk) {
        this.river=river;
        this.sugar=sugar;
        this.milk=milk;
    }

    public String getCoffeeCup(){
        return farm.getBeans()+" + "+ river.getWater()+ " + sugar: "+sugar+ " + milk: "+milk;
    }

    @Inject
    public void connectElectricity(){
        Log.v("AtefLogs", "connecting electricity ...");
    }
}
