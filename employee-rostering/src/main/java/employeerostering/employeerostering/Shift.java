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

package employeerostering.employeerostering;

public class Shift implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    private employeerostering.employeerostering.Timeslot timeslot;

    private employeerostering.employeerostering.Skill requiredSkill;

    public Shift() {
    }

    public employeerostering.employeerostering.Timeslot getTimeslot() {
        return this.timeslot;
    }

    public void setTimeslot( employeerostering.employeerostering.Timeslot timeslot ) {
        this.timeslot = timeslot;
    }

    public employeerostering.employeerostering.Skill getRequiredSkill() {
        return this.requiredSkill;
    }

    public void setRequiredSkill(
            employeerostering.employeerostering.Skill requiredSkill ) {
        this.requiredSkill = requiredSkill;
    }

    public Shift( employeerostering.employeerostering.Timeslot timeslot,
                  employeerostering.employeerostering.Skill requiredSkill ) {
        this.timeslot = timeslot;
        this.requiredSkill = requiredSkill;
    }

}