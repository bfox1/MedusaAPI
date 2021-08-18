package io.github.bfox1.manager;

import io.github.bfox1.event.EnumEvent;
import io.github.bfox1.event.IEventListener;
import io.github.bfox1.module.IPlugin;

public interface IEventListenerLoader
{
    /**
     * Registers the command with the Command Manager
     * @param eventListener The Command.
     */
    <T extends EnumEvent, T1> void registerCommand(IPlugin module, IEventListener<T, T1> eventListener);

    /**
     * Unregisters the Command with the Command Manager
     * @param module The Manager
     * @param eventListener The Command
     */
    <T extends EnumEvent, T1> void  unregisterCommand(IPlugin module, IEventListener<T, T1> eventListener);
}
