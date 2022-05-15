package ru.nsu.fit.g19202.ppopova1.factory.items;

import ru.nsu.fit.g19202.ppopova1.factory.IdGenerator;

public class Motor implements Item
{
    private final String id = IdGenerator.nextId();

    @Override
    public String getId()
    {
        return id;
    }

    @Override
    public String toString()
    {
        return "Motor{" + "id='" + id + '\'' + '}';
    }
}
