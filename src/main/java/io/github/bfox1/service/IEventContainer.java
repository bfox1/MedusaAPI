package io.github.bfox1.service;

import io.github.bfox1.event.IEventListener;
import io.github.bfox1.utils.ActionResult;

public interface IEventContainer
{

    boolean hasEventListener(String eventName);

    ActionResult<IEventListener<?,?>> getEventListener(String eventName);
}
