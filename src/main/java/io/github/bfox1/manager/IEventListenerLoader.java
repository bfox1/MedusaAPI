package io.github.bfox1.manager;

import io.github.bfox1.command.ICommand;
import io.github.bfox1.event.EnumEvent;
import io.github.bfox1.event.IEventListener;
import io.github.bfox1.module.IModule;

public interface IEventListenerLoader
{
    /**
     * Registers the command with the Command Manager
     * @param eventListener The Command.
     */
    <T extends EnumEvent, T1> void registerCommand(IModule module, IEventListener<T, T1> eventListener);

    /**
     * Unregisters the Command with the Command Manager
     * @param module The Manager
     * @param eventListener The Command
     */
    <T extends EnumEvent, T1> void  unregisterCommand(IModule module, IEventListener<T, T1> eventListener);
}
