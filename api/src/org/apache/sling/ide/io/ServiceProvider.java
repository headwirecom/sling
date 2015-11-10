package org.apache.sling.ide.io;

/**
 * This class is the prototype of the Provider for all IDE specific services
 *
 * Created by schaefa on 11/9/15.
 */
public interface ServiceProvider {
    public PluginLogger createPluginLogger();
    public ProjectUtil createProjectUtil();
}
