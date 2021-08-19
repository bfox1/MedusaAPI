package io.github.bfox1.module;

import io.github.bfox1.manager.IEventListenerLoader;
import io.github.bfox1.manager.IPluginCommandLoader;
import io.github.bfox1.manager.IPluginLoader;
import io.github.bfox1.utils.IYamlLoader;

public interface IPlugin
{

    /**
     * To initialize anything during First stage of the Class
     */
    void init();

    /**
     * This method will be called after the Module has been initialized. To set the name of the Module.
     * @param name The name of the Module.
     */
    void setName(String name);

    /**
     * To get the name of the Module
     * @return The Name of the Module
     */
    String getName();

    /**
     * The Module will have a random ID to be associated with.
     * Currently not required but may be useful.
     * @return The ID
     */
    int getId();

    /**
     * This gets loaded during the InitCommands. This occurs at the final stage of the Module loading.
     */
    @Deprecated
    void loadCommands(IPluginCommandLoader commandLoader);

    @Deprecated
    void loadEventListeners(IEventListenerLoader listenerLoader);

    /**
     * This gets loaded during the onReadyEvent of Medusa.
     * @param loader
     */
    void onReadyEvent(IPluginLoader loader);

    /**
     * The Config is a Class Wrapper to store data. In this case about your Module.
     * Any persistent data you would like to store and have loaded should be passed into the Config.
     * @return The Config.
     */
    IConfig getConfig();


    IYamlLoader getYamlLoader();
}
