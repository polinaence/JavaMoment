package ru.nsu.fit.g19202.ppopova1.factory;

import ru.nsu.fit.g19202.ppopova1.factory.items.Item;

public interface StorageObserver<T extends Item>
{
    void itemAdded(Storage<T> storage, T item);

    void itemRemoved(Storage<T> storage, T item);
}
