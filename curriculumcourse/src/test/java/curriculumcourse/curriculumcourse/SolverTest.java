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

package curriculumcourse.curriculumcourse;

import java.util.Arrays;

import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.optaplanner.core.api.solver.Solver;
import org.optaplanner.core.api.solver.SolverFactory;

public class SolverTest {

    @Test
    public void solve() {
        KieContainer kieContainer = KieServices.Factory.get().getKieClasspathContainer(SolverTest.class.getClassLoader());
        SolverFactory<CourseSchedule> solverFactory =
                SolverFactory.createFromKieContainerXmlResource(kieContainer,
                                                                "curriculumcourse/curriculumcourse/testSolverConfig.xml");
        Solver<CourseSchedule> solver = solverFactory.buildSolver();

        solver.solve(getSolution());
    }

    private CourseSchedule getSolution() {
        Teacher teacher = new Teacher("Matej",
                                      0L);
        Curriculum curriculum = new Curriculum("scientific",
                                               0L);
        Timeslot timeslot = new Timeslot(0,
                                         0L);

        Period period = new Period();
        Day day = new Day(0,
                          Arrays.asList(period),
                          0L);
        period.setDay(day);
        period.setTimeslot(timeslot);
        period.setId(0L);
        Room room = new Room("small",
                             10,
                             0L);
        Course course = new Course("Math",
                                   teacher,
                                   1,
                                   1,
                                   Arrays.asList(curriculum),
                                   10,
                                   0L);
        Lecture lecture = new Lecture(course,
                                      0,
                                      false,
                                      null,
                                      null,
                                      0L);

        return new CourseSchedule(Arrays.asList(teacher),
                                  Arrays.asList(curriculum),
                                  Arrays.asList(day),
                                  Arrays.asList(timeslot),
                                  Arrays.asList(period),
                                  Arrays.asList(room),
                                  Arrays.asList(lecture),
                                  0L,
                                  "schedule",
                                  Arrays.asList(course),
                                  null);
    }
}
