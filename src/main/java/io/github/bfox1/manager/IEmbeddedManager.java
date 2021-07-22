package io.github.bfox1.manager;

import io.github.bfox1.embed.IEmbeddedEntity;

public interface IEmbeddedManager extends IManager<IEmbeddedEntity>
{

    void addReactionListener(String serviceId, String msgId, IEmbeddedEntity entity);

    void removeReactionListener(String serviceId, String msgId);

    void removeAllReactionListeners(String serviceId);

    boolean hasMessageId(String serviceId, String msgid);

    IEmbeddedEntity getEmbeddedEntity(String serviceId, String msgId);

    int getListSize(String serviceId);


}
