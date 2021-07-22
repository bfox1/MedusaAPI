package io.github.bfox1.utils;

import io.github.bfox1.command.ICommand;

import java.util.LinkedList;

/**
 * A Wrapper to be used with ActionResult to pass in extra data.
 * @see io.github.bfox1.manager.ICommandManager#hasCommand(String, String) For an Example of usage
 */
public interface ICommandResult
{
    /**
     * The Command to be returned.
     * @return The Command.
     */
    ICommand getCommand();

    /**
     * The List of Arguments for the Command
     * @return LinkedLIst
     */
    LinkedList<String> getArgs();
}
