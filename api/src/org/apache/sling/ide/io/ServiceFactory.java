package org.apache.sling.ide.io;

/**
 * This Factory class provides Service which implementation are IDE specific
 *
 * Created by schaefa on 11/9/15.
 */
public abstract class ServiceFactory {

    private static ServiceProvider serviceProvider;

    public static final PluginLogger getPluginLogger() {
        checkServiceProvider();
        return serviceProvider.createPluginLogger();
    }

    public static final ProjectUtil getProjectUtil() {
        checkServiceProvider();
        return serviceProvider.createProjectUtil();
    }

    private static void checkServiceProvider() {
        if(serviceProvider == null) {
            throw new IllegalArgumentException("Service Provider is not set yet");
        }
    }

    /** Set the Service Provider Implementation which must be done before the first usage **/
    public static void setServiceProvider(ServiceProvider aServiceProvider) {
        serviceProvider = aServiceProvider;
    }
}
