package io.github.bfox1.command;

import io.github.bfox1.event.IEvent;
import io.github.bfox1.utils.ActionResult;
import io.github.bfox1.utils.IActionResult;

import java.util.LinkedList;

public abstract class Command implements ICommand
{
    private final String name;
    private final String permNode;
    private String moduleName;

    public Command(String name, String permNode)
    {
        this.name = name;
        this.permNode = permNode;
        moduleName = "";
    }
    /**
     * This Execute gets called First. This method cannot be Overridden.
     *
     * Execute gets called when the command has been processed. This includes Twitch Chat, Twitch Dm, Discord Channel Chat and Discord PM
     * @param event IEvent is a wrapper of all Chat Events. Please be sure to listen for the Right Chat Events as determine which one it is.
     * @param args The Arguments passed after the command was entered.
     * @return The Action Result.
     */
    @Override
    public final IActionResult<String> execute(IEvent event, LinkedList<String> args)
    {
        if(args.size() != 0)
        {
            String first = args.get(0);

            if(first.equalsIgnoreCase("help"))
            {
                return new ActionResult<String>(true, helpSyntax());
            }
            else if(first.equalsIgnoreCase("perms") || first.equalsIgnoreCase("perm"))
            {
                return new ActionResult<String>(true, getPermissionNode());
            }
            else if(first.equalsIgnoreCase("desc") || first.equalsIgnoreCase("description"))
            {
                return new ActionResult<>(true, getDescription());
            }
        }
        return executeCommand(event, args);


    }
    /**
     * Execute gets called when the command has been processed. This includes Twitch Chat, Twitch Dm, Discord Channel Chat and Discord PM
     * @param event IEvent is a wrapper of all Chat Events. Please be sure to listen for the Right Chat Events as determine which one it is.
     * @param args The Arguments passed after the command was entered.
     * @return The Action Result.
     */
    public abstract IActionResult<String> executeCommand(IEvent event, LinkedList<String> args);

    /**
     * Returns the name of the command given.
     * @return commandName
     */
    @Override
    public final String getName()
    {
        return name;
    };
    /**
     * The node string for permissions.
     * @return The Permission node.
     */
    @Override
    public final String getPermissionNode() {
        return permNode;
    }
    /**
     * Simple Method to return Module Name.
     * All commands need a Module Name.
     * Without one, Command will not be loaded.
     * @return The Module Name.
     */
    @Override
    public final String getModuleName()
    {
        return moduleName;
    }
    /**
     * Assigns the name of the Command with the name of the Module.
     * This will be set automatically based on the name provided in the Module class.
     * @param s The name of the Module.
     */
    @Override
    public final void setModuleName(String s)
    {
        this.moduleName = s;
    }

}
