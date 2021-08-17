package io.github.bfox1.manager;

import io.github.bfox1.utils.ActionResult;
import jdawrapper.entity.IGenericInterface;

public interface IGuildManager
{

    <T> ActionResult<String> addProperty(PropertyType type, T t);

    ActionResult<String> removeProperty(String propertyName);

    <T extends IManager<?>> ActionResult<T> getProperty(String name);

    enum PropertyType
    {
        COMMAND,
        COMMANDPM,
        ACTIVITY,
        EMBEDED,
        MODULE;
    }
}
