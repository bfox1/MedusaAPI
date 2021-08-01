package jdawrapper.channel;

import jdawrapper.entity.IEmote;
import jdawrapper.entity.IMember;
import jdawrapper.entity.IMessage;

import java.util.Collection;

public interface ITextChannel extends IMessageChannel
{
    String getTopic();

    boolean isNSFW();

    boolean isNews();

    int getSlowmode();

    void deleteMessages(Collection<IMessage> var1);

    void deleteMessagesByIds(Collection<String> var1);

    void clearReactionsById(long messageId);

    void clearReactionsById(long messageId, IEmote emote);

    boolean canTalk();

    boolean canTalkMember(IMember member);


}
