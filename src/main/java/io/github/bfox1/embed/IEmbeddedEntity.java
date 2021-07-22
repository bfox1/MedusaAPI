package io.github.bfox1.embed;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Message;

import java.util.LinkedList;

@JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.PROPERTY, property="@class")
public interface IEmbeddedEntity
{

    String getName();

    String getId();

    String getTitle();

    String getReactive();

    String getAuthor();

    String getDescription();

    String getColor();

    LinkedList<IEmbeddedFieldEntity> getLinkedFieldList();

    Message applyEmotes(Message message);

    EmbedBuilder buildReactiveEmbed();
}
