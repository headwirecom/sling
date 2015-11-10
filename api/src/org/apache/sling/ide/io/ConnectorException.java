package org.apache.sling.ide.io;

/**
 * Created by schaefa on 11/8/15.
 */
public class ConnectorException
    extends Exception
{
    public ConnectorException(String message) {
        super(message);
    }

    public ConnectorException(String message, Throwable cause) {
        super(message, cause);
    }
}
