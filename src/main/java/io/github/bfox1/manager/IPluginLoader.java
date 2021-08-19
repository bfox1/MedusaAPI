package io.github.bfox1.manager;

import io.github.bfox1.command.ICommand;
import io.github.bfox1.event.EnumEvent;
import io.github.bfox1.event.IEventListener;
import io.github.bfox1.module.IPlugin;
import jdawrapper.entity.IGenericInterface;

public interface IPluginLoader
{
    <T extends EnumEvent, T1> void registerEventListener(IPlugin plugin, IEventListener<T, T1> eventListener);

    <T extends EnumEvent, T1> void unregisterEventListener(IPlugin plugin, IEventListener<T, T1> eventListener);

    <T extends IGenericInterface> void registerCommand(IPlugin plugin, ICommand<T> command);

    <T extends IGenericInterface> void unregisterCommand(IPlugin plugin, ICommand<T> command);
}
