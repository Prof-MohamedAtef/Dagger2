package mo.atef.codingwithnerds.codingwithnerds;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = RiverModule.class)
public interface AppComponent {
    River getRiver();
    Farm getFarm();
}