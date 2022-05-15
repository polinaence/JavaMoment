package ru.nsu.fit.g19202.ppopova1.factory.items;

public class AccessoriesFactory implements ItemsFactory<Accessory>
{
    @Override
    public Accessory getNewItem()
    {
        return new Accessory();
    }
}
