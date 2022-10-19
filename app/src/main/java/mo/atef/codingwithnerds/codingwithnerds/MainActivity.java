package mo.atef.codingwithnerds.codingwithnerds;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CoffeeComponent coffeeComponent =DaggerCoffeeComponent.create();
        Log.v("onCreate: LogCoffee:",coffeeComponent.getCoffee().getCoffeeCup());

    }
}