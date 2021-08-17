package io.github.bfox1.event;

import com.github.twitch4j.chat.events.channel.ChannelMessageEvent;
import jdawrapper.entity.IGenericInterface;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.events.message.priv.PrivateMessageReceivedEvent;

public interface IEvent<T2 extends IGenericInterface>
{

    T2 getEventWrapper();

}
