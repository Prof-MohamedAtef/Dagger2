package mo.atef.codingwithnerds.codingwithnerds;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Coffee coffee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CoffeeComponent coffeeComponent =DaggerCoffeeComponent.builder().coffeeModule(new CoffeeModule(4)).build();
        coffeeComponent.inject(this);

        Log.v("onCreate: AtefLogs:",coffee.getCoffeeCup());

    }
}