package ru.nsu.fit.g19202.ppopova1.factory.items;

public interface ItemsFactory<T extends Item>
{
    T getNewItem();
}
