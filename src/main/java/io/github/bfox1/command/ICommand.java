package io.github.bfox1.command;

import io.github.bfox1.event.IEvent;
import io.github.bfox1.utils.IActionResult;

import java.util.LinkedList;

/**
 * ICommand is to contain methods for creating a Command Class.
 * This Interface should NOT be interfaced with. Please use {@link Command} for extending.
 * Interfacing with ICommand will NOT work when Command gets executed.
 */
public interface ICommand
{

    /**
     * Returns the name of the command given.
     * @return commandName
     */
    String getName();

    /**
     * Assigns the name of the Command with the name of the Module.
     * This will be set automatically based on the name provided in the Module class.
     * @param s The name of the Module.
     */
    void setModuleName(String s);

    /**
     * Simple Method to return Module Name.
     * All commands need a Module Name.
     * Without one, Command will not be loaded.
     * @return The Module Name.
     */
    String getModuleName();
    /**
     * The node string for permissions.
     * @return The Permission node.
     */
    String getPermissionNode();

    /**
     * To check if the Command should fire in Twitch Chat.
     * @return boolean
     */
    boolean isTwitchChatEnabled();

    /**
     * To check if the Command should fire in Twitch DM.
     * @return Boolean
     */
    boolean isTwitchDMEnabled();

    /**
     * To check if the Command should fire in Discord Chat.
     * @return Boolean
     */
    boolean isDiscordChatEnabled();

    /**
     * To Check if the Command should fire in Discord PM.
     * @return Boolean
     */
    boolean isDiscordPMEnabled();

    /**
     * To Check if the Command should fire separately in another Messaging Avenue.
     * This will require the Command to have special checks to verify the source the Command came from.
     * @return Boolean
     */
    boolean isOtherEnabled();

    /**
     * Initializes the Command.
     */
    void init();

    /**
     * Execute gets called when the command has been processed. This includes Twitch Chat, Twitch Dm, Discord Channel Chat and Discord PM
     * @param event IEvent is a wrapper of all Chat Events. Please be sure to listen for the Right Chat Events as determine which one it is.
     * @param args The Arguments passed after the command was entered.
     * @return The Action Result.
     */
    IActionResult<String> execute(IEvent event, LinkedList<String> args);

    /**
     * Returns the description of the Command. Not required, but all commands should have one.
     * @return The String description
     */
    String getDescription();

    String helpSyntax();
}
