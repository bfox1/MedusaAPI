package jdawrapper.entity;


import io.github.bfox1.utils.ActionResult;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface IMessageChannel
{
    String getLatestMessageId();

    List<CompletableFuture> purgeMessagesById(List<String> messageIds);

    long getLatestMessageIdLong();

    boolean hasLatestMessage();

    String getName();

    ActionResult<Void> sendMessage(CharSequence text);

    ActionResult<Void> sendMessageFormat(String format, Object... args);

    ActionResult<Void> sendMessage(IMessageEmbed embed);

    IMessage retrieveMessageById(String messageId);

    default IMessage retrieveMessageById(long messageId)
    {
        return this.retrieveMessageById(Long.toUnsignedString(messageId));
    }

    void deleteMessageById(String messageId);

    default void deleteMessageById(long messageId)
    {
        this.deleteMessageById(Long.toUnsignedString(messageId));
    }

    void sendTyping();

    void addReactionById(String messageId, String unicode);

    default void addReactionById(long messageId, String unicode)
    {
        this.addReactionById(Long.toUnsignedString(messageId), unicode);
    }

    default void addReactionById(String messageId, IEmote emote)
    {
        this.addReactionById(messageId, emote.getName() + ":" + emote.getId());
    }


    default void addReactionById(long messageId, IEmote emote) {
        this.addReactionById(Long.toUnsignedString(messageId), emote);
    }
}
