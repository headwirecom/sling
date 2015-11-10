package org.apache.sling.ide.io;

/**
 * Created by schaefa on 11/9/15.
 */
public interface PluginLogger {

    public void error(String message);

    public void error(String message, Object... parameters);

    public void warn(String message);

    public void warn(String message, Object... parameters);

    public void trace(String message);

    public void trace(String message, Object... parameters);
}
