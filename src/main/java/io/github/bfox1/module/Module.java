package io.github.bfox1.module;

import io.github.bfox1.IMedusaAPI;
import io.github.bfox1.utils.IYamlLoader;

public abstract class Module implements IPlugin
{
    private String name;
    private final int id;
    private static IMedusaAPI apiInstance;

    public Module(int id, IMedusaAPI api)
    {
        this.id = id;
        apiInstance = api;
        this.name = "";
    }
    /**
     * To get the name of the Module
     * @return The Name of the Module
     */
    @Override
    public final String getName()
    {return name;}

    @Override
    public final void setName(String s)
    {
        this.name = s;
    }


    /**
     * The Module will have a random ID to be associated with.
     * Currently not required but may be useful.
     * @return The ID
     */
    @Override
    public final int getId()
    {
        return id;
    }


    public static IMedusaAPI getApiInstance()
    {
        return apiInstance;
    }

    public final IYamlLoader getYamlLoader()
    {
        return apiInstance.createYamlLoader(getName());
    }
}
