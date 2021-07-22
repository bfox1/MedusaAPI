package io.github.bfox1.utils;

public class ActionResult<T> implements IActionResult<T>
{
    private final boolean flag;

    private final T t;

    private final String msg;

    public ActionResult(boolean flag, T t, String msg)
    {
        this.flag = flag;

        this.t = t;

        this.msg = msg;
    }

    public ActionResult(boolean flag, String msg)
    {
        this.flag = flag;
        this.msg = msg;
        this.t = null;
    }

    @Override
    public boolean isSuccess()
    {
        return flag;
    }

    @Override
    public T getResult()
    {
        return t;
    }

    @Override
    public String getMessage()
    {
        return msg;
    }


    public static ActionResult<String> DEFAULT()
    {
        return new ActionResult<String>(false, "Result Success is false. Lazily caught return message");
    }

    public static ActionResult<String> resultNoObject(boolean success, String message)
    {
        return new ActionResult<String>(success, message);
    }

    public static ActionResult<String> formatResultNoObject(boolean success, String formatMessage, Object... args)
    {
        return resultNoObject(success, String.format(formatMessage, args));
    }
}
