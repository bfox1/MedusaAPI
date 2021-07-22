package io.github.bfox1.manager;

import io.github.bfox1.module.IConfig;
import io.github.bfox1.utils.IActionResult;

public interface IManager<T>
{
    /**
     * To add a savable Object into the Manager map for storage. This does NOT persist data. Use the Config for storage.
     * @param id The ID is what identifies the first Map. IE: GuildID/Twitch Channel ID.
     * @param key The key to the data itself.
     * @param t The Data Object to add
     */
    void addDataObject(String id, String key, T t);

    void removeDataObject(String id, String key);

    IActionResult<T> hasDataObject(String id, String key);

    void init(String id);

    IConfig getConfig();
}
