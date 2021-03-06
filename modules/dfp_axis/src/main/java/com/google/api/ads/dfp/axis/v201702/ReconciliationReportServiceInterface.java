// Copyright 2017 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * ReconciliationReportServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201702;

public interface ReconciliationReportServiceInterface extends java.rmi.Remote {

    /**
     * Gets an {@link ReconciliationReportPage} of {@link ReconciliationReport}
     * objects that satisfy
     *         the given {@link Statement#query}. The following fields are
     * supported for filtering.
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link ReconciliationReport#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link ReconciliationReport#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code startDate}</td>
     *         <td>{@link ReconciliationReport#startDate}</td>
     *         </tr>
     *         </table>
     *         
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter a set of reconciliation reports
     *         
     * @return the reconciliation reports that match the given filter
     */
    public com.google.api.ads.dfp.axis.v201702.ReconciliationReportPage getReconciliationReportsByStatement(com.google.api.ads.dfp.axis.v201702.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201702.ApiException;

    /**
     * Updates the specified {@link ReconciliationReport} objects.
     * 
     *         
     * @param reconciliationReports the reconciliation reports to update
     *         
     * @return the updated reconciliation reports
     *         
     * @throws ApiException
     */
    public com.google.api.ads.dfp.axis.v201702.ReconciliationReport[] updateReconciliationReports(com.google.api.ads.dfp.axis.v201702.ReconciliationReport[] reconciliationReports) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201702.ApiException;
}
