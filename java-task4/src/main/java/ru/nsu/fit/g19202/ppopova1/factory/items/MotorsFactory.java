package ru.nsu.fit.g19202.ppopova1.factory.items;

public class MotorsFactory implements ItemsFactory<Motor>
{
    @Override
    public Motor getNewItem()
    {
        return new Motor();
    }
}
