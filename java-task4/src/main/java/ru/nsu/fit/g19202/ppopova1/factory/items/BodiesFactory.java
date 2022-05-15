package ru.nsu.fit.g19202.ppopova1.factory.items;

public class BodiesFactory implements ItemsFactory<Body>
{
    @Override
    public Body getNewItem()
    {
        return new Body();
    }
}
