package mo.atef.codingwithnerds.codingwithnerds;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Farm farm=new Farm();
        River river=new River();

        // manual Dependency Injection
        Coffee coffee=new Coffee(farm, river);



    }
}