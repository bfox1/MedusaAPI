package jdawrapper.entity;

import jdawrapper.entity.IGuild;
import jdawrapper.entity.IMember;
import jdawrapper.entity.IRole;

import java.util.List;

public interface IEmote extends IGenericInterface
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
