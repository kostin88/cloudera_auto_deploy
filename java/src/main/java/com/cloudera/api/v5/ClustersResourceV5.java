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
package com.cloudera.api.v5;

import static com.cloudera.api.Parameters.CLUSTER_NAME;

import com.cloudera.api.v4.ClustersResourceV4;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * The root of the Cloudera API (v5). Provides access to all sub-resources
 * available in version 5 of the API.
 */
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON })
public interface ClustersResourceV5 extends ClustersResourceV4 {

  /**
   * @return the parcels resource handler.
   */
  @Override
  @Path("/{clusterName}/parcels")
  public ParcelsResourceV5 getParcelsResource(
      @PathParam(CLUSTER_NAME) String clusterName);
}
