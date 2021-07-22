package io.github.bfox1.manager;

public interface IUserManager<T> extends IManager<T>
{
    void addUser(T user);

    void addUserByName(String name);

    void addUserByID(String id);

    void removeUser(T user);

    void removeUser(String name);

    void removeUserByID(String userID);


}
