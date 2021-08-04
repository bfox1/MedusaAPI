package jdawrapper.event;

import jdawrapper.entity.*;

public interface IMessageReceivedEvent extends IGenericInterface
{
    IMessageChannel getChannel();

    String getMessageId();

    long getMessageIdLong();

    IGuild getGuild();

    IMessage getMessage();

    IUser getAuthor();

    IMember getMember();
}
