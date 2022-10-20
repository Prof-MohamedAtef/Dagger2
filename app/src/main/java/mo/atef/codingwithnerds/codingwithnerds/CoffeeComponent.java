package mo.atef.codingwithnerds.codingwithnerds;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

/*
subComponent
 */

@ActivityScope
@Subcomponent()
public interface CoffeeComponent {
    Coffee getCoffee();

    void inject(MainActivity mainActivity);

    @Subcomponent.Builder
    interface Builder{
        @BindsInstance
        Builder sugar(@Sugar int sugar);

        @BindsInstance
        Builder milk(@Milk int milk);

        CoffeeComponent build();
    }

}