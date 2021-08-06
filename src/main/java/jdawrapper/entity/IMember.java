package jdawrapper.entity;

import io.github.bfox1.utils.ActionResult;

import java.awt.*;
import java.time.OffsetDateTime;
import java.util.List;

public interface IMember extends IGenericInterface
{

    IUser getUser();

    IGuild getGuild();

    OffsetDateTime getTimedJoined();

    boolean hasTimedJoined();

    OffsetDateTime getTimeBoosted();

    List<IActivity> getActivities();

    IOnlineStatus getOnlineStatus();

    String getNickname();

    String getEffectiveName();

    List<IRole> getRoles();

    Color getColor();

    int getColorRaw();

    boolean canInteract(IMember member);

    boolean canInteract(IRole role);

    boolean canInteract(IEmote emote);

    boolean isOwner();

    ITextChannel getDefaultChannel();

    ActionResult<Void> ban(int delDays);

    ActionResult<Void> ban(int delDays, String reason);

    ActionResult<Void> kick();

    ActionResult<Void> modifyNickname(String nickname);
}
