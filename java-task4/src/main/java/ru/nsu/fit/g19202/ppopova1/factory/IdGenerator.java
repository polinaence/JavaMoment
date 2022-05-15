package ru.nsu.fit.g19202.ppopova1.factory;

import java.util.UUID;

public class IdGenerator
{
    public static String nextId()
    {
        return UUID.randomUUID().toString();
    }
}
