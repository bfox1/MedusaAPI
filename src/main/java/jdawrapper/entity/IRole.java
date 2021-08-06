package jdawrapper.entity;

import java.awt.*;

public interface IRole  extends IGenericInterface
{
    int getPosition();

    int getPositionRaw();

    String getName();

    boolean isManaged();

    boolean isHoisted();

    boolean isMentionable();

    long getPermissionRaw();

    Color getColor();

    int getColorRaw();

    boolean isPublicRole();

    boolean canInteractWith(IRole role);

    IGuild getGuild();

    void delete();


}
