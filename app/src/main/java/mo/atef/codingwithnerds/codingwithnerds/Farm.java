package mo.atef.codingwithnerds.codingwithnerds;

import android.util.Log;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Farm {
    @Inject
    public Farm() {
        Log.v("AtefLogs","Farm constructor is Injected by Field Injection!");
    }

    public String getBeans(){
        return "Beans";
    }
}
