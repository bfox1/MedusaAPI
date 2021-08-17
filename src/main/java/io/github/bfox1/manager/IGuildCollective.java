package io.github.bfox1.manager;

import io.github.bfox1.utils.ActionResult;
import jdawrapper.entity.IGuild;

public interface IGuildCollective
{
    IGuild createNewGuild(long id);

    IGuild createNewGuild(String id);

    ActionResult<String> deleteGuild(long id);

    ActionResult<String> deleteGuild(String id);


}
