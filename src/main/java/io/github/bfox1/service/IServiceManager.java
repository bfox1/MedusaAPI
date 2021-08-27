package io.github.bfox1.service;

/**
 * The Service Manager will act as the Main Containing class for Guilds/Servers and Other Chat Mediums.
 * The Service Manager will contain various containers to Store Information about each individual Service.
 */
public interface IServiceManager
{
    /**
     * Returns the CommandContainer which stores all the Commands for the Service.
     * @return ICommandManager
     */
    ICommandContainer getCommandContainer();

    /**
     * Returns the EventContainer which will store all the Events to be executed.
     * @return IEventContainer
     */
    IEventContainer getEventContainer();

    /**
     * Returns the GuildId/ServiceId
     * @return String
     */
    String getServiceId();
}
