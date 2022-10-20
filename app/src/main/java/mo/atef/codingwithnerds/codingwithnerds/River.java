package mo.atef.codingwithnerds.codingwithnerds;

import android.util.Log;

import javax.inject.Inject;

public class River {
    @Inject
    public River() {
        Log.v("AtefLogs","River constructor is Injected!");
    }

    public String getWater(){
        return "water";
    }
}
