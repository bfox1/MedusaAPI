package io.github.bfox1;

import io.github.bfox1.command.ICommand;
import io.github.bfox1.manager.IActivityEventManager;
import io.github.bfox1.manager.ICommandManager;
import io.github.bfox1.manager.IEmbeddedManager;
import io.github.bfox1.manager.IUserManager;
import io.github.bfox1.module.IConfig;
import io.github.bfox1.user.IMedusaUser;
import io.github.bfox1.utils.IYamlLoader;

public interface IMedusaAPI
{
    ICommandManager<ICommand> getCommandManager();

    IUserManager<IMedusaUser> getUserManager();

    IEmbeddedManager getEmbedManager();

    IActivityEventManager getEventManager();

    IYamlLoader createYamlLoader(String name);

    IConfig createConfig(String moduleName);

}
