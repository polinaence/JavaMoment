package ru.nsu.fit.g19202.ppopova1.task2.calc.exceptions;

public class CommandNotFoundException extends StackCalculatorException
{
    public CommandNotFoundException(String msg)
    {
        super(msg);
    }
}
