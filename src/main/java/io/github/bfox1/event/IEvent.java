package io.github.bfox1.event;

import com.github.twitch4j.chat.events.channel.ChannelMessageEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.events.message.priv.PrivateMessageReceivedEvent;

public interface IEvent
{
    MessageReceivedEvent getMessageReceivedEvent();

    MessageReceivedEvent getPrivateMessageReceivedEvent();

    ChannelMessageEvent getTwitchChannelEvent();

    Object getOtherEvent();

    EnumEvent getReceivedMessageType();


}
