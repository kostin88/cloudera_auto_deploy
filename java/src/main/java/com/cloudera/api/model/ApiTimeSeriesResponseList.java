//Licensed to Cloudera, Inc. under one
//or more contributor license agreements.  See the NOTICE file
//distributed with this work for additional information
//regarding copyright ownership.  Cloudera, Inc. licenses this file
//to you under the Apache License, Version 2.0 (the
//"License"); you may not use this file except in compliance
//with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
//Unless required by applicable law or agreed to in writing, software
//distributed under the License is distributed on an "AS IS" BASIS,
//WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//See the License for the specific language governing permissions and
//limitations under the License.

package com.cloudera.api.model;

import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.cloudera.api.CsvElementWrapper;

import java.util.List;

@XmlRootElement(name = "timeSeriesResponseList")
public class ApiTimeSeriesResponseList extends ApiListBase<ApiTimeSeriesResponse> {

  private List<ApiTimeSeriesRow> timeSeriesRows;

  public ApiTimeSeriesResponseList() {
  }

  public ApiTimeSeriesResponseList(
      final List<ApiTimeSeriesResponse> responses,
      final List<ApiTimeSeriesRow> rows) {
    super(responses);
    this.timeSeriesRows = rows;
  }

  /** The list of responses for this query response list. */
  @XmlElementWrapper(name = ApiListBase.ITEMS_ATTR)
  public List<ApiTimeSeriesResponse> getResponses() {
    return values;
  }

  public void setResponses(List<ApiTimeSeriesResponse> responses) {
    this.values = responses;
  }

  @CsvElementWrapper(rowtype = ApiTimeSeriesRow.class,
                     dateTimeFormat = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
  @XmlTransient
  public List<ApiTimeSeriesRow> getTimeSeriesRows() {
    return timeSeriesRows;
  }

  public void setTimeSeriesRows(List<ApiTimeSeriesRow> rows) {
    this.timeSeriesRows = rows;
  }
}