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

        AppComponent appComponent =((MainApplication)getApplication()).getAppComponent();

        CoffeeComponent coffeeComponent=DaggerCoffeeComponent.builder().milk(4).sugar(8).appComponent(appComponent).build();
        coffeeComponent.inject(this);

        Log.v("onCreate: AtefLogs:",coffee.getCoffeeCup()+
                "\ncoffee 1 : "+coffee+
                "\ncoffee 2 : "+coffee2
                +"\n river of coffee 1 : "+coffee.river
                + "\n river of coffee 2 : "+coffee2.river);
    }
}