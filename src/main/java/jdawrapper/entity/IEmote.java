package jdawrapper.entity;

import java.util.List;

public interface IEmote
{
    IGuild getGuild();

    List<IRole> getRoles();

    boolean canProvideRoles();

    String getName();

    boolean isManaged();

    boolean isAvailable();

    String getId();

    void delete();

    boolean isAnimated();

    String getImageUrl();

    String getAsMention();

    boolean canInteract(IMember member);
}
