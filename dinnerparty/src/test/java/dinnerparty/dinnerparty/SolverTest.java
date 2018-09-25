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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.optaplanner.core.api.solver.Solver;
import org.optaplanner.core.api.solver.SolverFactory;

public class SolverTest {

    @Test
    public void solve() {
        KieContainer kieContainer = KieServices.Factory.get().getKieClasspathContainer(SolverTest.class.getClassLoader());
        SolverFactory<DinnerParty> solverFactory =
                SolverFactory.createFromKieContainerXmlResource(kieContainer,
                                                                "dinnerparty/dinnerparty/testSolverConfig.solver.xml");
        Solver<DinnerParty> solver = solverFactory.buildSolver();

        solver.solve(getSolution());
    }

    private DinnerParty getSolution() {
        JobType politician = new JobType("Politician",
                                         0l);
        JobType doctor = new JobType("Doctor",
                                     1l);
        JobType teacher = new JobType("Teacher",
                                      2l);
        JobType developer = new JobType("Developer",
                                        3l);
        List<JobType> jobTypeList = Arrays.asList(politician,
                                                  doctor,
                                                  teacher,
                                                  developer);

        Job jobDemocrat = new Job(politician,
                                  "Democrat",
                                  0l);
        Job jobRepublican = new Job(politician,
                                    "Republican",
                                    1l);
        Job jobNeutral = new Job(politician,
                                 "Neutral",
                                 2l);
        Job jobSurgeon = new Job(doctor,
                                 "Surgeon",
                                 3l);
        Job jobFrenchTeacher = new Job(teacher,
                                       "French",
                                       4l);
        Job jobPhysicist = new Job(teacher,
                                   "Physicist",
                                   5l);
        Job jobMath = new Job(teacher,
                              "Mathematician",
                              6l);
        Job jobWebDeveloper = new Job(developer,
                                      "WebDeveloper",
                                      7l);
        Job jobJavaDeveloper = new Job(developer,
                                       "JavaDeveloper",
                                       8l);
        Job jobRubyDeveloper = new Job(developer,
                                       "RubyDeveloper",
                                       9l);
        List<Job> jobList = Arrays.asList(jobDemocrat,
                                          jobRepublican,
                                          jobNeutral,
                                          jobSurgeon,
                                          jobFrenchTeacher,
                                          jobPhysicist,
                                          jobMath,
                                          jobWebDeveloper,
                                          jobJavaDeveloper,
                                          jobRubyDeveloper);

        Guest guestMatthew = new Guest("Matthew",
                                       jobDemocrat,
                                       "M",
                                       0l);
        Guest guestEllie = new Guest("Ellie",
                                     jobSurgeon,
                                     "F",
                                     1l);
        Guest guestEva = new Guest("Eva",
                                   jobWebDeveloper,
                                   "F",
                                   2l);
        Guest guestPeter = new Guest("Peter",
                                     jobJavaDeveloper,
                                     "M",
                                     3l);
        Guest guestSophia = new Guest("Sophia",
                                      jobPhysicist,
                                      "F",
                                      4l);
        Guest guestJohn = new Guest("John",
                                    jobRepublican,
                                    "M",
                                    5l);
        Guest guestIsabela = new Guest("Isabela",
                                       jobSurgeon,
                                       "F",
                                       6l);
        Guest guestIgor = new Guest("Igor",
                                    jobFrenchTeacher,
                                    "M",
                                    7l);
        Guest guestJoe = new Guest("Joe",
                                   jobSurgeon,
                                   "M",
                                   8l);
        Guest guestSusanne = new Guest("Susanne",
                                       jobRubyDeveloper,
                                       "F",
                                       9l);
        Guest guestIngrid = new Guest("Ingrid",
                                      jobNeutral,
                                      "F",
                                      10l);
        Guest guestMark = new Guest("Mark",
                                    jobMath,
                                    "M",
                                    11l);
        List<Guest> guestList = Arrays.asList(guestMatthew,
                                              guestEllie,
                                              guestEva,
                                              guestPeter,
                                              guestSophia,
                                              guestJohn,
                                              guestIsabela,
                                              guestIgor,
                                              guestJoe,
                                              guestSusanne,
                                              guestIngrid,
                                              guestMark);

        List<SeatDesignation> seatDesignationList = new ArrayList<>(guestList.size());
        for (int i = 0; i < guestList.size(); i++) {
            seatDesignationList.add(new SeatDesignation(guestList.get(i),
                                                        null,
                                                        (long) i));
        }

        final int tableCapacity = 4;
        final int tableCount = 3;

        List<Seat> seatList = new ArrayList<>(tableCount * tableCapacity);
        List<Table> tableList = new ArrayList<>(tableCount);
        for (int i = 0; i < tableCount; i++) {
            Table table = new Table();
            table.setId((long) i);
            table.setSeatList(createSeats(table,
                                          i * tableCapacity,
                                          tableCapacity));
            seatList.addAll(table.getSeatList());
        }

        return new DinnerParty(jobList,
                               guestList,
                               tableList,
                               seatList,
                               seatDesignationList,
                               null,
                               0l,
                               jobTypeList);
    }

    private static List<Seat> createSeats(Table table,
                                          int startIndex,
                                          int tableCapacity) {

        List<Seat> seatList = new ArrayList<>();
        for (int i = 0; i < tableCapacity; i++) {
            Seat seat = new Seat();
            seat.setId((long) (startIndex + i));
            seat.setTable(table);
            seat.setSeatIndexInTable(i);
            seatList.add(seat);
        }
        for (int i = 0; i < tableCapacity; i++) {
            Seat seat = seatList.get(i);
            seat.setRightSeat(seatList.get((i + 1) % tableCapacity));
            seat.setLeftSeat(seatList.get((i - 1 + tableCapacity) % tableCapacity));
        }

        return seatList;
    }
}
