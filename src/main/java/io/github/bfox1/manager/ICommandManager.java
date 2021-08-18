package io.github.bfox1.manager;

import io.github.bfox1.module.IPlugin;
import io.github.bfox1.utils.IActionResult;
import io.github.bfox1.utils.ICommandResult;


public interface ICommandManager<T> extends IManager<T>
{
    /**
     * Add commands to Server.
     * @param id
     * @param command
     */
    void addCommand(String id, T command);

    /**
     * Removes the Command from Server
     * @param id
     * @param name
     */
    void removeCommand(String id, String name);

    /**
     * Removes the Command from Server using Command.
     * @param id
     * @param command
     */
    void removeCommand(String id, T command);

    /**
     * Removes the individual Module.
     * @param service The Service name
     * @param moduleName The Module Name
     */
    void removeModuleService(String service, String moduleName);

    /**
     * Will attempt to remove the Commands based on the module they came from.
     * @param module
     */
    @Deprecated
    void removePluginCommand(IPlugin module);

    void removeModuleFromService(String service, IPlugin module);

    void removeModuleFromAllServices(IPlugin module);

    /**
     * Checks if the Guild/Twitch Channel has no commands.
     * @param id
     * @return
     */
    boolean isServerEmpty(String id);

    /**
     * Parses the String Message and determines if its a Command. If not, the return will be null.
     * @param id
     * @param msg
     * @return
     */
    IActionResult<ICommandResult> hasCommand(String id, String msg);


    /**
     * Simply returns true or false if its a chat command.
     * @param message
     * @return
     */
    boolean isChatCommand(String message);

    IPluginCommandLoader getModuleCommandLoader(String id, String moduleID);

    IPluginCommandLoader createModuleCommandLoader(String id, String moduleID);




}
