package io.github.bfox1.event;

public enum EnumEvent
{
    TWITCHCHAT("Twitch Chat"),
    TWITCHDM("Twitch DM"),
    DISCORDCHAT("Discord Chat"),
    DISCORDPM("Discord PM"),
    OTHEREVENT("Other");

    private final String name;

    EnumEvent(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
}
