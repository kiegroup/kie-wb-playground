/*
 * Copyright 2017 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package optacloud.optacloud;

@org.optaplanner.core.api.domain.solution.PlanningSolution(autoDiscoverMemberType = org.optaplanner.core.api.domain.autodiscover.AutoDiscoverMemberType.FIELD)
@javax.xml.bind.annotation.XmlRootElement
@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
public class CloudSolution implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    @org.kie.api.definition.type.Label("Computer list")
    @org.optaplanner.core.api.domain.valuerange.ValueRangeProvider(id = "computerRange")
    private java.util.List<optacloud.optacloud.Computer> computerList;
    @org.kie.api.definition.type.Label("Process list")
    @org.optaplanner.core.api.domain.solution.PlanningEntityCollectionProperty
    private java.util.List<optacloud.optacloud.Process> processList;

    @org.kie.api.definition.type.Label("Generated Planner score field")
    @javax.annotation.Generated({"org.optaplanner.workbench.screens.domaineditor.client.widgets.planner.PlannerDataObjectEditor"})
    @org.optaplanner.core.api.domain.solution.PlanningScore
    @javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter(org.optaplanner.persistence.jaxb.api.score.buildin.hardsoft.HardSoftScoreJaxbXmlAdapter.class)
    private org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore score;

    public CloudSolution() {
    }

    public java.util.List<optacloud.optacloud.Computer> getComputerList() {
        return this.computerList;
    }

    public void setComputerList(
            java.util.List<optacloud.optacloud.Computer> computerList) {
        this.computerList = computerList;
    }

    public java.util.List<optacloud.optacloud.Process> getProcessList() {
        return this.processList;
    }

    public void setProcessList(
            java.util.List<optacloud.optacloud.Process> processList) {
        this.processList = processList;
    }

    public org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore getScore() {
        return this.score;
    }

    public void setScore(
            org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore score) {
        this.score = score;
    }

    public CloudSolution(
            java.util.List<optacloud.optacloud.Computer> computerList,
            java.util.List<optacloud.optacloud.Process> processList,
            org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore score) {
        this.computerList = computerList;
        this.processList = processList;
        this.score = score;
    }

}