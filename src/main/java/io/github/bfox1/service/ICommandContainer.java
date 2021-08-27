package io.github.bfox1.service;

import io.github.bfox1.command.ICommand;
import io.github.bfox1.utils.ActionResult;

public interface ICommandContainer
{
    boolean hasCommand(String name);

    ActionResult<ICommand<?>> getCommand(String commandName);

}
