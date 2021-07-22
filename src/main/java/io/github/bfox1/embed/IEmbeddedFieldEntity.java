package io.github.bfox1.embed;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.PROPERTY, property="@class")
public interface IEmbeddedFieldEntity
{
    String getTitle();

    String getContext();

    String getInline();

    String getEmote();

    String getRole();
}
