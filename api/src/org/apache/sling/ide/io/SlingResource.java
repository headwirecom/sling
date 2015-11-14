/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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

    /** @return True if this is a file **/
    public boolean isFile();

    /** @return The absolute file path of the resource in the IDE in a OS specific format **/
    public String getLocalPath();

    /** @return The resource file (relative to the sync direectory) path of the resource in the IDE in a OS specific format **/
    public String getResourceLocalPath();

    /** @return The Sling Resource Path **/
    public String getResourcePath();

    /** @return The Input Stream to read the content from the resource if it is a file otherwise returns null **/
    public InputStream getContentStream();

    /** @return Parent of the Sling Resource or null if this is the sync directory **/
    public SlingResource getParent();

    /**
     * @param childFileName Name of the Child File
     * @return Child Resource if this is a folder and if child is found by name
     **/
    public SlingResource findChild(String childFileName);

    /**
     * @param childPath Path of the child relative to the
     * @return Child Resource if this is a folder and if child is found by name
     **/
    public SlingResource findChildByPath(String childPath);

    /** @return List of all Sling Resource Children from IDE **/
    public List<SlingResource> getLocalChildren();

    /** @return True if the file or folder exists locally / IDE **/
    public boolean existsLocally();

    /** @return True if the file or folder exists remotely / Sling **/
    public boolean existsRemotely();
}
