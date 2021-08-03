package jdawrapper.entity;

import java.util.Collection;

public interface ITextChannel extends IMessageChannel, IGuildChannel
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
