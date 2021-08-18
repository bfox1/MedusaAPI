package io.github.bfox1.manager;

import io.github.bfox1.command.ICommand;
import io.github.bfox1.module.IPlugin;

public interface IPluginCommandLoader
{
    /**
     * Registers the command with the Command Manager
     * @param command The Command.
     */
    void registerCommand(IPlugin module, ICommand command);

    /**
     * Unregisters the Command with the Command Manager
     * @param module The Manager
     * @param command The Command
     */
    void unregisterCommand(IPlugin module, ICommand command);
}
