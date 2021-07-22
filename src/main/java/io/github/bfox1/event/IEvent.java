package io.github.bfox1.event;

import com.github.twitch4j.chat.events.channel.ChannelMessageEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.events.message.priv.PrivateMessageReceivedEvent;

/**
 * To pass Wrap ALL Events into this Interface.
 * All Classes Require the Discord JDA and Twitch API.
 *
 * These will eventually and Should be Wrappers of the Events. Dependency on the Medusa API should not
 * pass either Discord JDA or Twitch API.
 */
public interface IEvent
{
    MessageReceivedEvent getMessageReceivedEvent();

    MessageReceivedEvent getPrivateMessageReceivedEvent();

    ChannelMessageEvent getTwitchChannelEvent();

    Object getOtherEvent();

    EnumEvent getReceivedMessageType();


}
