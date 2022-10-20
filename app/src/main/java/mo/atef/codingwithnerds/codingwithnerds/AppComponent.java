package mo.atef.codingwithnerds.codingwithnerds;

import javax.inject.Singleton;

import dagger.Component;

/*
Mother/parent component
 */
@Singleton
@Component(modules = RiverModule.class)
public interface AppComponent {
    CoffeeComponent.Builder getCoffeeComponentBuilder();
}