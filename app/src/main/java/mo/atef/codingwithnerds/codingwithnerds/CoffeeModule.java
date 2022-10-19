package mo.atef.codingwithnerds.codingwithnerds;

import dagger.Module;
import dagger.Provides;

@Module
public class CoffeeModule {

    int sugar;

    public CoffeeModule(int sugar) {
        this.sugar = sugar;
    }

    @Provides
    River provideRiver(){
        return new River();
    }

    @Provides
    int provideSugar(){
        return sugar;
    }
}
