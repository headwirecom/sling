package org.apache.sling.ide.io;

import java.io.InputStream;
import java.util.List;

/**
 * Created by schaefa on 11/9/15.
 */
public interface SlingResource {

    /** @Return Name of the Resource (including its extension) **/
    public String getName();

    /** @return The Project this resource is part of **/
    public SlingProject getProject();

    /** @return True if the Resource was modified in the IDE since the last deployment **/
    public boolean isModified();

    /** @return True if the Resource is a IDE local (team member private) only resource **/
    public boolean isLocalOnly();

    /** @return True if this is a folder **/
    public boolean isFolder();

    /** @return The absolute file path of the resource in the IDE in a OS specific format **/
    public String getLocalPath();

    /** @return The relative resource path in an OS independent format **/
    public String getResourcePath();

    /** @return The Input Stream to read the content from the resource if it is a file otherwise returns null **/
    public InputStream getContentStream();

    /** @return Parent of the Sling Resource or null if this is the sync directory **/
    public SlingResource getParent();

    /**
     * @param childFileName Name of the Child File
     *  @return Child Resource if this is a folder and if child is found by name
     *  **/
    public SlingResource findChild(String childFileName);

    /** @return List of all Sling Resource Children from IDE **/
    public List<SlingResource> getLocalChildren();

    /** @return True if the file or folder exists locally / IDE **/
    public boolean existsLocally();
}
