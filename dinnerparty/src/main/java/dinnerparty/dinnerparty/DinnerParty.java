/*
 * Copyright 2017 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dinnerparty.dinnerparty;

import org.optaplanner.core.api.score.buildin.simple.SimpleScore;

@org.optaplanner.core.api.domain.solution.PlanningSolution(autoDiscoverMemberType = org.optaplanner.core.api.domain.autodiscover.AutoDiscoverMemberType.FIELD)
@javax.xml.bind.annotation.XmlRootElement
@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
public class DinnerParty implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    private java.util.List<dinnerparty.dinnerparty.Job> jobList;
    private java.util.List<dinnerparty.dinnerparty.Guest> guestList;
    private java.util.List<dinnerparty.dinnerparty.Table> tableList;
    @org.optaplanner.core.api.domain.valuerange.ValueRangeProvider(id = "seatRange")
    private java.util.List<dinnerparty.dinnerparty.Seat> seatList;
    private java.util.List<dinnerparty.dinnerparty.SeatDesignation> seatDesignationList;

    @org.kie.api.definition.type.Label("Generated Planner score field")
    @javax.annotation.Generated({"org.optaplanner.workbench.screens.domaineditor.client.widgets.planner.PlannerDataObjectEditor"})
    @org.optaplanner.core.api.domain.solution.PlanningScore
    @javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter(org.optaplanner.persistence.jaxb.api.score.buildin.simple.SimpleScoreJaxbXmlAdapter.class)
    private SimpleScore score;

    private java.lang.Long id;

    private java.util.List<dinnerparty.dinnerparty.JobType> jobTypeList;

    public DinnerParty() {
    }

    public java.util.List<dinnerparty.dinnerparty.Job> getJobList() {
        return this.jobList;
    }

    public void setJobList(java.util.List<dinnerparty.dinnerparty.Job> jobList) {
        this.jobList = jobList;
    }

    public java.util.List<dinnerparty.dinnerparty.Guest> getGuestList() {
        return this.guestList;
    }

    public void setGuestList(
            java.util.List<dinnerparty.dinnerparty.Guest> guestList) {
        this.guestList = guestList;
    }

    public java.util.List<dinnerparty.dinnerparty.Table> getTableList() {
        return this.tableList;
    }

    public void setTableList(
            java.util.List<dinnerparty.dinnerparty.Table> tableList) {
        this.tableList = tableList;
    }

    public java.util.List<dinnerparty.dinnerparty.Seat> getSeatList() {
        return this.seatList;
    }

    public void setSeatList(
            java.util.List<dinnerparty.dinnerparty.Seat> seatList) {
        this.seatList = seatList;
    }

    public java.util.List<dinnerparty.dinnerparty.SeatDesignation> getSeatDesignationList() {
        return this.seatDesignationList;
    }

    public void setSeatDesignationList(
            java.util.List<dinnerparty.dinnerparty.SeatDesignation> seatDesignationList) {
        this.seatDesignationList = seatDesignationList;
    }

    public org.optaplanner.core.api.score.buildin.simple.SimpleScore getScore() {
        return this.score;
    }

    public void setScore(
            org.optaplanner.core.api.score.buildin.simple.SimpleScore score) {
        this.score = score;
    }

    public java.lang.Long getId() {
        return this.id;
    }

    public void setId(java.lang.Long id) {
        this.id = id;
    }

    public java.util.List<dinnerparty.dinnerparty.JobType> getJobTypeList() {
        return this.jobTypeList;
    }

    public void setJobTypeList(
            java.util.List<dinnerparty.dinnerparty.JobType> jobTypeList) {
        this.jobTypeList = jobTypeList;
    }

    public DinnerParty(
            java.util.List<dinnerparty.dinnerparty.Job> jobList,
            java.util.List<dinnerparty.dinnerparty.Guest> guestList,
            java.util.List<dinnerparty.dinnerparty.Table> tableList,
            java.util.List<dinnerparty.dinnerparty.Seat> seatList,
            java.util.List<dinnerparty.dinnerparty.SeatDesignation> seatDesignationList,
            org.optaplanner.core.api.score.buildin.simple.SimpleScore score,
            java.lang.Long id,
            java.util.List<dinnerparty.dinnerparty.JobType> jobTypeList) {
        this.jobList = jobList;
        this.guestList = guestList;
        this.tableList = tableList;
        this.seatList = seatList;
        this.seatDesignationList = seatDesignationList;
        this.score = score;
        this.id = id;
        this.jobTypeList = jobTypeList;
    }
}