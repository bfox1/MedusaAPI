package jdawrapper.event;

import jdawrapper.entity.IActivity;
import jdawrapper.entity.IGuild;
import jdawrapper.entity.IMember;

public interface IUserActivityStart
{
    IActivity getNewActivity();

    IGuild getGuild();

    IMember getMember();
}
