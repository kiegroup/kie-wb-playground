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

@org.optaplanner.core.api.domain.entity.PlanningEntity
public class Process implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    @org.kie.api.definition.type.Label(value = "Required CPU power")
    private int requiredCpuPower;
    @org.kie.api.definition.type.Label(value = "Required memory")
    private int requiredMemory;
    @org.kie.api.definition.type.Label(value = "Required network bandwidth")
    private int requiredNetworkBandwidth;
    @org.kie.api.definition.type.Label(value = "Computer")
    @org.optaplanner.core.api.domain.variable.PlanningVariable(valueRangeProviderRefs = { "computerRange" })
    private optacloud.optacloud.Computer computer;

    public Process() {
    }

    public int getRequiredCpuPower() {
        return this.requiredCpuPower;
    }

    public void setRequiredCpuPower( int requiredCpuPower ) {
        this.requiredCpuPower = requiredCpuPower;
    }

    public int getRequiredMemory() {
        return this.requiredMemory;
    }

    public void setRequiredMemory( int requiredMemory ) {
        this.requiredMemory = requiredMemory;
    }

    public int getRequiredNetworkBandwidth() {
        return this.requiredNetworkBandwidth;
    }

    public void setRequiredNetworkBandwidth( int requiredNetworkBandwidth ) {
        this.requiredNetworkBandwidth = requiredNetworkBandwidth;
    }

    public optacloud.optacloud.Computer getComputer() {
        return this.computer;
    }

    public void setComputer( optacloud.optacloud.Computer computer ) {
        this.computer = computer;
    }

    public Process( int requiredCpuPower, int requiredMemory,
                    int requiredNetworkBandwidth, optacloud.optacloud.Computer computer ) {
        this.requiredCpuPower = requiredCpuPower;
        this.requiredMemory = requiredMemory;
        this.requiredNetworkBandwidth = requiredNetworkBandwidth;
        this.computer = computer;
    }

}