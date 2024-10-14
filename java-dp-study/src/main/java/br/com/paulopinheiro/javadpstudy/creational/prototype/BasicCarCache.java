package br.com.paulopinheiro.javadpstudy.creational.prototype;

import br.com.paulopinheiro.javadpstudy.creational.prototype.cars.BasicCar;
import br.com.paulopinheiro.javadpstudy.creational.prototype.cars.FordCar;
import br.com.paulopinheiro.javadpstudy.creational.prototype.cars.NanoCar;
import java.util.HashMap;

public class BasicCarCache {
    private static final HashMap<Integer,BasicCar> carCache = new HashMap<>();

    public BasicCarCache() {
        loadCache();
    }
    
    public static BasicCar getCar(Integer carId) {
        BasicCar car = carCache.get(carId);
        return (BasicCar) car.clone();
    }

    public static void loadCache() {
        FordCar ford1 = new FordCar();
        ford1.setId(1);
        ford1.setColor("Green");
        addCar(ford1);

        NanoCar nano1 = new NanoCar();
        nano1.setId(2);
        nano1.setColor("Orange");
        addCar(nano1);

        FordCar ford2 = new FordCar();
        ford2.setId(3);
        ford2.setColor("Red");
        addCar(ford2);
    }

    private static void addCar(BasicCar car) {
        carCache.put(car.getId(), car);
    }
}