package jdawrapper.entity;

import io.github.bfox1.utils.ActionResult;

import java.util.List;

public interface IUser extends IGenericInterface
{

    String getName();

    String getDiscriminator();

    String getAvatarId();

    String getAsTag();

    boolean hasPrivateChannel();

    ActionResult<IPrivateChannel> openPrivateChannel();

    List<IGuild> getMutualGuilds();

    boolean isBot();
}
