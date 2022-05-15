package ru.nsu.fit.g19202.ppopova1.threadpool;

public interface Task
{
    String getName();

    void performWork() throws InterruptedException;
}
