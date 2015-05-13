// Licensed to Cloudera, Inc. under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  Cloudera, Inc. licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package com.cloudera.api.v1;

import javax.ws.rs.Path;

/**
 * The root of the Cloudera API. Provides access to all sub-resources
 * available in version 1 of the API.
 */
public interface RootResourceV1 {

  /**
   * @return The Cloudera Manager resource handler.
   */
  @Path("/cm")
  public ClouderaManagerResource getClouderaManagerResource();

  /**
   * @return The clusters resource handler.
   */
  @Path("/clusters")
  public ClustersResource getClustersResource();

  /**
   * @return The commands resource handler.
   */
  @Path("/commands")
  public CommandsResource getCommandsResource();

  /**
   * @return The hosts resource handler.
   */
  @Path("/hosts")
  public HostsResource getHostsResource();

  /**
   * @return The tools resource handler.
   */
  @Path("/tools")
  public ToolsResource getToolsResource();

  /**
   * @return The users resource handler.
   */
  @Path("/users")
  public UsersResource getUsersResource();

  /**
   * Return the events resource handler.
   * <p/>
   *
   * @return The events resource handler.
   */
  @Path("/events")
  public EventsResource getEventsResource();

}
