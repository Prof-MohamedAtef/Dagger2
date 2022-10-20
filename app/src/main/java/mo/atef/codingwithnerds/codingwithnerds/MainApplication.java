package mo.atef.codingwithnerds.codingwithnerds;

import android.app.Application;

public class MainApplication extends Application {
    private CoffeeComponent coffeeComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        coffeeComponent =
                DaggerCoffeeComponent.builder().sugar(7).milk(9).build();
    }

    public CoffeeComponent getCoffeeComponent() {
        return coffeeComponent;
    }
}
