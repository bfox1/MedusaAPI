package io.github.bfox1.utils;

import io.github.bfox1.command.ICommand;

import java.util.LinkedList;

public interface ICommandResult
{
    ICommand getCommand();
    LinkedList<String> getArgs();
}
