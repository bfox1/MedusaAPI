package io.github.bfox1.manager;

import io.github.bfox1.command.Command;
import io.github.bfox1.command.ICommand;
import io.github.bfox1.module.IModule;
import io.github.bfox1.utils.IActionResult;
import io.github.bfox1.utils.ICommandResult;

/**
 * The Command Manager handles and maintains all the Commands for Medusa.
 * @param <T> In this case, the Generic class is a @see {@link Command}
 */
public interface ICommandManager<T> extends IManager<T>
{
    /**
     * Add commands to Server.
     * @param id The id from the Source.
     * @param command The Command Object. {@link Command}
     */
    void addCommand(String id, T command);

    /**
     * Removes the Command from Server
     * @param id The id from the Source.
     * @param name The Commands name.
     */
    void removeCommand(String id, String name);

    /**
     * Removes the Command from Server using Command.
     * @param id The Id from the Source.
     * @param command The Command Object.
     */
    void removeCommand(String id, T command);

    /**
     * Removes the individual Module.
     * This is very useful for when you want to remove ALL Commands from a Module(Plugin)
     * @param service The Service name
     * @param moduleName The Module Name
     */
    void removeModuleService(String service, String moduleName);

    /**
     * Will attempt to remove the Commands based on the module they came from.
     * @param module The Module Object.
     */
    @Deprecated
    void removePluginCommand(IModule module);

    /**
     * Will attempt to remove the Commands based on the module they came from.
     * @param service The Source in which the Module was Loaded in.
     * @param module The Module Object.
     */
    void removeModuleFromService(String service, IModule module);

    /**
     * Will remove the Commands from the Module from ALL Services. This should only be used
     * under strict circumstances. Will be deprecated later.
     * @param module The Module to remove.
     */
    void removeModuleFromAllServices(IModule module);

    /**
     * Checks if the Guild/Twitch Channel has no commands.
     * @param id The Source ID
     * @return Boolean
     */
    boolean isServerEmpty(String id);

    /**
     * Parses the String Message and determines if its a Command. If not, the return will be null.
     * @see IActionResult To Learn about ActionResults
     * @see ICommandResult To Learn about ICommandResults
     * @param id The Source ID
     * @param msg The Raw Message.
     * @return an Action result with the result.
     */
    IActionResult<ICommandResult> hasCommand(String id, String msg);


    /**
     * Simply returns true or false if its a chat command.
     * @param message The Raw Message.
     * @return Boolean
     */
    boolean isChatCommand(String message);

    /**
     * Returns the Module Loader. More Doc to Come
     * @param id
     * @param moduleID
     * @return
     */
    IModuleCommandLoader getModuleCommandLoader(String id, String moduleID);

    /**
     *
     * @param id
     * @param moduleID
     * @return
     */
    IModuleCommandLoader createModuleCommandLoader(String id, String moduleID);




}
