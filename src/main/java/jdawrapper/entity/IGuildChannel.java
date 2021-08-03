package jdawrapper.entity;

import io.github.bfox1.utils.ActionResult;

import java.util.List;

public interface IGuildChannel
{

    String getName();

    IGuild getGuild();

    ICategory getParent();

    List<IMember> getMembers();

    int getPosition();

    ActionResult<Void> delete();


}
