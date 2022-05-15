package ru.nsu.fit.g19202.ppopova1.factory;

import ru.nsu.fit.g19202.ppopova1.factory.items.Accessory;
import ru.nsu.fit.g19202.ppopova1.factory.items.Body;
import ru.nsu.fit.g19202.ppopova1.factory.items.Car;
import ru.nsu.fit.g19202.ppopova1.factory.items.Motor;

public interface CarFactoryObserver
{
    void bodyAdded(CarFactory carFactory, Body body);

    void bodyRemoved(CarFactory carFactory, Body body);

    void motorAdded(CarFactory carFactory, Motor motor);

    void motorRemoved(CarFactory carFactory, Motor motor);

    void accessoryAdded(CarFactory carFactory, Accessory accessory);

    void accessoryRemoved(CarFactory carFactory, Accessory accessory);

    void carAdded(CarFactory carFactory, Car car);

    void carRemoved(CarFactory carFactory, Car car);
}
