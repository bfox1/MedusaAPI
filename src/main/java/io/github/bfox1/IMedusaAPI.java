package io.github.bfox1;

import io.github.bfox1.command.ICommand;
import io.github.bfox1.manager.ICommandManager;
import io.github.bfox1.manager.IEmbeddedManager;
import io.github.bfox1.manager.IUserManager;
import io.github.bfox1.module.IConfig;
import io.github.bfox1.user.IMedusaUser;
import io.github.bfox1.utils.IYamlLoader;

/**
 * The Medusa API Interface gets populated and used by the MedusaBot.
 * The Getters associated with this Interface allow for Plugins to utilize
 * Methods and other function within each Class.
 */
public interface IMedusaAPI
{

    /**
     * Simple Getter Method
     * @return {@link ICommandManager}
     */
    ICommandManager<ICommand> getCommandManager();
    /**
     * Simple Getter Method
     * @return {@link IUserManager}
     */
    IUserManager<IMedusaUser> getUserManager();
    /**
     * Simple Getter Method
     * @return {@link IEmbeddedManager}
     */
    IEmbeddedManager getEmbedManager();

    /**
     * A Simple Yaml Loader to save and load data.
     * Storing Data in here to keep it persistent when Module or Bot reloads.
     * @param name The name of the Yaml Config.
     * @return {@link IYamlLoader}
     */
    IYamlLoader createYamlLoader(String name);

    /**
     * Similar to the {@link IMedusaAPI#createYamlLoader(String)} This will create a special config for the Module.
     * Additional information may be stored here.
     *
     * Unlike the IYamlLoader for special use cases, this method has easy access Getters and setters for storing data.
     *
     * If the Config already exists, this method will simply load and return the config already present.
     * @param moduleName The name of the Module
     * @return a Config Object.
     */
    IConfig createConfig(String moduleName);

}
