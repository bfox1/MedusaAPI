package io.github.bfox1.module;

public interface IConfig
{
    /**
     * To initialize the Config.
     */
    void init();

    /**
     * Useful for saving any data you wish and have it persist on.
     * @param name The name of the object
     * @param obj The kind of object.
     */
    void addSavableObject(String name, Object obj);

    /**
     * To retrieve the object.
     * @param name The Name of the object.
     * @return The returned Object.
     */
    Object getSavableObject(String name);

    /**
     * Will check if it has the Object or not.
     * @param name The name of the object.
     * @return a boolean.
     */
    boolean hasSaveableObject(String name);


}
