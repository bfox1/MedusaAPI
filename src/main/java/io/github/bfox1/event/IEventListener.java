package io.github.bfox1.event;

import jdawrapper.entity.IGenericInterface;

public interface IEventListener<T extends EnumEvent, T1>
{
    void executeEvent(T1 t);

    T getType();

    String getModuleName();

    String getName();
}
