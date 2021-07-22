package io.github.bfox1.utils;

import io.github.bfox1.event.IEvent;

import java.util.LinkedList;

/**
 * A Simple Result class to be used when a Action was Successful or not.
 * Examples of ActionResults use, check out {@link io.github.bfox1.command.Command#execute(IEvent, LinkedList)}
 * @param <T> Any Object you want to be carried upon returning an Action Result.
 */
public class ActionResult<T> implements IActionResult<T>
{
    private final boolean flag;

    private final T t;

    private final String msg;

    /**
     * Creating an ActionResult with the Generic Object being passed in.
     * @param flag The success boolean
     * @param t The Generic Object to be passed
     * @param msg The Message to return
     */
    public ActionResult(boolean flag, T t, String msg)
    {
        this.flag = flag;

        this.t = t;

        this.msg = msg;
    }

    /**
     * Creating an ActionResult with no Object to return.
     * @see io.github.bfox1.command.Command#executeCommand(IEvent, LinkedList) as an Example of its usage.
     * This method will return a message only.
     * @param flag The Success boolean
     * @param msg The Message to return.
     */
    public ActionResult(boolean flag, String msg)
    {
        this.flag = flag;
        this.msg = msg;
        this.t = null;
    }

    /**
     * to check if the Result came back a Success.
     * @return boolean
     */
    @Override
    public boolean isSuccess()
    {
        return flag;
    }

    /**
     * Will return the Result Object. Will return null if nothing is present.
     * @return The Generic Object.
     */
    @Override
    public T getResult()
    {
        return t;
    }

    /**
     * Will return the Results Message.
     * @return The Message
     */
    @Override
    public String getMessage()
    {
        return msg;
    }

    /**
     * Static Methods for speeding up the prcesss.
     * @return ActionResult
     */
    public static ActionResult<String> DEFAULT()
    {
        return new ActionResult<String>(false, "Result Success is false. Lazily caught return message");
    }
    /**
     * Static Methods for speeding up the prcesss.
     * @return ActionResult
     */
    public static ActionResult<String> resultNoObject(boolean success, String message)
    {
        return new ActionResult<String>(success, message);
    }
    /**
     * Static Methods for speeding up the prcesss.
     * @return ActionResult
     */
    public static ActionResult<String> formatResultNoObject(boolean success, String formatMessage, Object... args)
    {
        return resultNoObject(success, String.format(formatMessage, args));
    }
}
