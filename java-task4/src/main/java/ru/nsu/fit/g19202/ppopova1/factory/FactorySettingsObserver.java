package ru.nsu.fit.g19202.ppopova1.factory;

public interface FactorySettingsObserver
{
    void accessoryProduceTimeChanged(FactorySettings settings, int newValue);

    void bodyProduceTimeChanged(FactorySettings settings, int newValue);

    void motorProduceTimeChanged(FactorySettings settings, int newValue);

    void dealerDelayChanged(FactorySettings settings, int newValue);
}
