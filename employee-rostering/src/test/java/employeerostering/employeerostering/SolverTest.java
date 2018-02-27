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

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.optaplanner.core.api.solver.Solver;
import org.optaplanner.core.api.solver.SolverFactory;

public class SolverTest {

    @Test
    public void solve() {
        KieContainer kieContainer = KieServices.Factory.get().getKieClasspathContainer(SolverTest.class.getClassLoader());
        SolverFactory<EmployeeRoster> solverFactory =
                SolverFactory.createFromKieContainerXmlResource(kieContainer,
                                                                "employeerostering/employeerostering/testSolverConfig.xml");
        Solver<EmployeeRoster> solver = solverFactory.buildSolver();

        solver.solve(getSolution());
    }

    private EmployeeRoster getSolution() {
        Skill skill = new Skill("chess");
        Employee employee = new Employee("Matej",
                                         Arrays.asList(skill));
        Timeslot timeslot = new Timeslot(LocalDateTime.of(2017,
                                                          1,
                                                          1,
                                                          0,
                                                          0),
                                         LocalDateTime.of(2017,
                                                          1,
                                                          1,
                                                          1,
                                                          0));
        Shift shift = new Shift(timeslot,
                                skill);
        return new EmployeeRoster(Arrays.asList(employee),
                                  Arrays.asList(shift),
                                  Arrays.asList(skill),
                                  Arrays.asList(timeslot),
                                  Collections.emptyList(),
                                  Collections.emptyList(),
                                  null);
    }
}
