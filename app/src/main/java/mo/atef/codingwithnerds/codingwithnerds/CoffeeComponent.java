package mo.atef.codingwithnerds.codingwithnerds;

import dagger.Component;

@Component
public interface CoffeeComponent {
    Coffee getCoffee();

    void inject(MainActivity mainActivity);

}
