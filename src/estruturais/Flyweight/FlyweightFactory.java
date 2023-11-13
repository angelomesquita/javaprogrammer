package estruturais.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private Map<String, Flyweight> flyweights = new HashMap<>();


    public Flyweight getFlyweight(String key) {
        if (!flyweights.containsKey(key)) {
            Flyweight flyweight = new ConcreteFlyweight(key);
            flyweights.put(key, flyweight);
        }
        return flyweights.get(key);
    }
}
