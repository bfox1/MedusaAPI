package io.github.bfox1.event;

import io.github.bfox1.utils.IActionResult;

import java.util.LinkedList;

public abstract class EventListener<T1> implements IEventListener<EnumEvent, T1>
{
    private final EnumEvent type;

    private final String name;

    private final String moduleName;

    public EventListener(EnumEvent event, String name, String moduleName)
    {
        this.type = event;
        this.name = name;
        this.moduleName = moduleName;
    }
    @Override
    public final void executeEvent(T1 t)
    {
        executeCommand(t);
    }

    public abstract void executeCommand(T1 t1);

    @Override
    public EnumEvent getType() {
        return type;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getModuleName() {
        return moduleName;
    }
}
