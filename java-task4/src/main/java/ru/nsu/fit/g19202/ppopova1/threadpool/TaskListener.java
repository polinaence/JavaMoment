package ru.nsu.fit.g19202.ppopova1.threadpool;

public interface TaskListener
{
    void taskStarted(Task task);

    void taskInterrupted(Task task);

    void taskFinished(Task task);
}
