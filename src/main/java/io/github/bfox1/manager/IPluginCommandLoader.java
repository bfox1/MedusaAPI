package io.github.bfox1.manager;

import io.github.bfox1.command.ICommand;
import io.github.bfox1.module.IPlugin;
import jdawrapper.entity.IGenericInterface;

/**
 * This will be replaced with IPluginLoader
 */
@Deprecated(since = "0.1")
public interface IPluginCommandLoader
{
    /**
     * Registers the command with the Command Manager
     * @param command The Command.
     */
    <T extends IGenericInterface> void registerCommand(IPlugin module, ICommand<T> command);

    /**
     * Unregisters the Command with the Command Manager
     * @param module The Manager
     * @param command The Command
     */
    <T extends IGenericInterface>void unregisterCommand(IPlugin module, ICommand<T> command);
}
