package io.github.bfox1.utils;

public interface IActionResult<T>
{
    /**
     * To return the success of the result.
     * @return A Boolean
     */
    boolean isSuccess();

    /**
     * The Returning Object. Can be Null if needed.
     * @return The Generic Object
     */
    T getResult();

    /**
     * The Message to be returned.
     * @return The String Message
     */
    String getMessage();
}
