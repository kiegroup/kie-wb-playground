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

import org.optaplanner.core.impl.domain.solution.AbstractSolution;
import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore;

@org.optaplanner.core.api.domain.solution.PlanningSolution
public class CloudSolution extends AbstractSolution<HardSoftScore> implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    @org.kie.api.definition.type.Label(value = "Computer list")
    @org.optaplanner.core.api.domain.valuerange.ValueRangeProvider(id = "computerRange")
    private java.util.List<optacloud.optacloud.Computer> computerList;
    @org.kie.api.definition.type.Label(value = "Process list")
    @org.optaplanner.core.api.domain.solution.PlanningEntityCollectionProperty
    private java.util.List<optacloud.optacloud.Process> processList;

    public CloudSolution() {
    }

    public java.util.List<optacloud.optacloud.Computer> getComputerList() {
        return this.computerList;
    }

    public void setComputerList(
            java.util.List<optacloud.optacloud.Computer> computerList ) {
        this.computerList = computerList;
    }

    public java.util.List<optacloud.optacloud.Process> getProcessList() {
        return this.processList;
    }

    public void setProcessList(
            java.util.List<optacloud.optacloud.Process> processList ) {
        this.processList = processList;
    }

    public CloudSolution( java.util.List<optacloud.optacloud.Computer> computerList,
                          java.util.List<optacloud.optacloud.Process> processList ) {
        this.computerList = computerList;
        this.processList = processList;
    }

}