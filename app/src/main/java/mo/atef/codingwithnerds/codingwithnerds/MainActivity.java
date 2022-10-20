package mo.atef.codingwithnerds.codingwithnerds;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Coffee coffee, coffee2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CoffeeComponent coffeeComponent =
                DaggerCoffeeComponent.builder().sugar(7).milk(9).build();
        coffeeComponent.inject(this);

        Log.v("onCreate: AtefLogs:",coffee.getCoffeeCup()+"\n farm of coffee 1 : "+coffee.farm + "\n farm of coffee 2 : "+coffee2.farm);
    }
}