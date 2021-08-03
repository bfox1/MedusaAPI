package jdawrapper.entity;

import io.github.bfox1.utils.ActionResult;

public interface IPrivateChannel extends IMessageChannel
{
    IUser getUser();

    ActionResult<Void> close();
}
