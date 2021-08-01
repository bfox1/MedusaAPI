package jdawrapper.event;

import jdawrapper.channel.IMessageChannel;
import jdawrapper.entity.IGuild;
import jdawrapper.entity.IMember;
import jdawrapper.entity.IMessage;
import jdawrapper.entity.IUser;

public interface IMessageReceivedEvent
{
    IMessageChannel getChannel();

    String getMessageId();

    long getMessageIdLong();

    IGuild getGuild();

    IMessage getMessage();

    IUser getAuthor();

    IMember getMember();
}
