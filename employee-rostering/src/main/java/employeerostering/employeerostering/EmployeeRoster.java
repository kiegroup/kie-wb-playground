/**
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

package employeerostering.employeerostering;

import org.optaplanner.core.impl.domain.solution.AbstractSolution;
import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore;

@org.optaplanner.core.api.domain.solution.PlanningSolution
public class EmployeeRoster extends AbstractSolution<HardSoftScore> implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    @org.optaplanner.core.api.domain.valuerange.ValueRangeProvider(id = "employeeRange")
    private java.util.List<employeerostering.employeerostering.Employee> employeeList;
    private java.util.List<employeerostering.employeerostering.Shift> shiftList;
    private java.util.List<employeerostering.employeerostering.Skill> skillList;
    private java.util.List<employeerostering.employeerostering.Timeslot> timeslotList;
    private java.util.List<employeerostering.employeerostering.DayOffRequest> dayOffRequestList;
    @org.optaplanner.core.api.domain.solution.PlanningEntityCollectionProperty
    private java.util.List<employeerostering.employeerostering.ShiftAssignment> shiftAssignmentList;

    public EmployeeRoster() {
    }

    public java.util.List<employeerostering.employeerostering.Employee> getEmployeeList() {
        return this.employeeList;
    }

    public void setEmployeeList(
            java.util.List<employeerostering.employeerostering.Employee> employeeList ) {
        this.employeeList = employeeList;
    }

    public java.util.List<employeerostering.employeerostering.Shift> getShiftList() {
        return this.shiftList;
    }

    public void setShiftList(
            java.util.List<employeerostering.employeerostering.Shift> shiftList ) {
        this.shiftList = shiftList;
    }

    public java.util.List<employeerostering.employeerostering.Skill> getSkillList() {
        return this.skillList;
    }

    public void setSkillList(
            java.util.List<employeerostering.employeerostering.Skill> skillList ) {
        this.skillList = skillList;
    }

    public java.util.List<employeerostering.employeerostering.Timeslot> getTimeslotList() {
        return this.timeslotList;
    }

    public void setTimeslotList(
            java.util.List<employeerostering.employeerostering.Timeslot> timeslotList ) {
        this.timeslotList = timeslotList;
    }

    public java.util.List<employeerostering.employeerostering.ShiftAssignment> getShiftAssignmentList() {
        return this.shiftAssignmentList;
    }

    public void setShiftAssignmentList(
            java.util.List<employeerostering.employeerostering.ShiftAssignment> shiftAssignmentList ) {
        this.shiftAssignmentList = shiftAssignmentList;
    }

    public java.util.List<employeerostering.employeerostering.DayOffRequest> getDayOffRequestList() {
        return this.dayOffRequestList;
    }

    public void setDayOffRequestList(
            java.util.List<employeerostering.employeerostering.DayOffRequest> dayOffRequestList ) {
        this.dayOffRequestList = dayOffRequestList;
    }

    public EmployeeRoster(
            java.util.List<employeerostering.employeerostering.Employee> employeeList,
            java.util.List<employeerostering.employeerostering.Shift> shiftList,
            java.util.List<employeerostering.employeerostering.Skill> skillList,
            java.util.List<employeerostering.employeerostering.Timeslot> timeslotList,
            java.util.List<employeerostering.employeerostering.DayOffRequest> dayOffRequestList,
            java.util.List<employeerostering.employeerostering.ShiftAssignment> shiftAssignmentList ) {
        this.employeeList = employeeList;
        this.shiftList = shiftList;
        this.skillList = skillList;
        this.timeslotList = timeslotList;
        this.dayOffRequestList = dayOffRequestList;
        this.shiftAssignmentList = shiftAssignmentList;
    }

}