package jdawrapper.channel;

import jdawrapper.entity.IEmote;
import jdawrapper.entity.IMessage;
import jdawrapper.entity.IMessageEmbed;
import net.dv8tion.jda.api.entities.Emote;
import net.dv8tion.jda.api.requests.RestAction;
import net.dv8tion.jda.internal.utils.Checks;

import javax.annotation.CheckReturnValue;
import javax.annotation.Nonnull;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface IMessageChannel
{
    String getLatestMessageId();

    List<CompletableFuture> purgeMessagesById(List<String> messageIds);

    long getLatestMessageIdLong();

    boolean hasLatestMessage();

    String getName();

    void sendMessage(CharSequence text);

    void sendMessageFormat(String format, Object... args);

    void sendMessage(IMessageEmbed embed);

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

    default void addReactionById(@Nonnull String messageId, @Nonnull IEmote emote)
    {
        this.addReactionById(messageId, emote.getName() + ":" + emote.getId());
    }

    @Nonnull
    @CheckReturnValue
    default void addReactionById(long messageId, @Nonnull IEmote emote) {
        this.addReactionById(Long.toUnsignedString(messageId), emote);
    }
}
