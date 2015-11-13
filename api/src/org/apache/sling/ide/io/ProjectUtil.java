package org.apache.sling.ide.io;

import org.apache.sling.ide.filter.Filter;

/**
 * Created by schaefa on 11/9/15.
 */
public interface ProjectUtil {

    public Filter loadFilter(SlingProject project);

    /**
     * Obtains the Sling Resource representing the Sync Directory
     * @param resource Any resource part of the a Sync Directory
     * @return The resources that is represents the Sync Directory
     */
    public SlingResource getSyncDirectory(SlingResource resource);

    /**
     * Creates a Sling Resource from a Local Path
     * @param resourcePath Local (IDE) path that points to a resource. The path can be OS dependent, even with mixed
     *                     folder separators.
     * @param syncDirectory If not null the Resource Path is a resource path relative to this Sync Directory
     * @return A local sling resource
     */
    public SlingResource getResourceFromPath(String resourcePath, SlingResource syncDirectory);
}
