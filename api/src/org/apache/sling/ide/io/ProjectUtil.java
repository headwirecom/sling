package org.apache.sling.ide.io;

import org.apache.sling.ide.filter.Filter;

/**
 * Created by schaefa on 11/9/15.
 */
public interface ProjectUtil {
    public Filter loadFilter(SlingProject project);

    public SlingResource getSyncDirectory(SlingResource resource);
}
