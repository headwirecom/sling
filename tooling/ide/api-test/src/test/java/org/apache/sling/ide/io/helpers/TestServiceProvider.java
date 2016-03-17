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
package org.apache.sling.ide.io.helpers;

import org.apache.sling.ide.io.PluginLogger;
import org.apache.sling.ide.io.ServiceProvider;
import org.apache.sling.ide.serialization.SerializationManager;

import java.util.logging.Logger;

/**
 * Created by Andreas Schaefer (Headwire.com) on 1/25/16.
 */
public class TestServiceProvider
    implements ServiceProvider
{
    private static Logger LOGGER = Logger.getLogger(TestServiceProvider.class.getName());

    @Override
    public PluginLogger createPluginLogger() {
        return new SpyPluginLogger();
    }

    @Override
    public SerializationManager getSerializationManager() {
        return null;
    }

    public static class SpyPluginLogger
        implements PluginLogger
    {

        @Override
        public void error(String message) {
            LOGGER.severe(message);
        }

        @Override
        public void error(String message, Object... parameters) {
            LOGGER.severe(message + ", parameters: " + parameters);
        }

        @Override
        public void warn(String message) {
            LOGGER.warning(message);
        }

        @Override
        public void warn(String message, Object... parameters) {
            LOGGER.warning(message + ", parameters: " + parameters);
        }

        @Override
        public void trace(String message) {
            LOGGER.fine(message);
        }

        @Override
        public void trace(String message, Object... parameters) {
            LOGGER.fine(message + ", parameters: " + parameters);
        }
    }
}
