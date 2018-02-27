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

package optacloud.optacloud;

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
        SolverFactory<CloudSolution> solverFactory =
                SolverFactory.createFromKieContainerXmlResource(kieContainer,
                                                                "optacloud/optacloud/testSolverConfig.xml");
        Solver<CloudSolution> solver = solverFactory.buildSolver();

        solver.solve(getSolution());
    }

    private CloudSolution getSolution() {
        Computer computer = new Computer(1000,
                                         1000,
                                         1000,
                                         1000);
        Process process = new Process(1000,
                                      1000,
                                      1000,
                                      null);

        return new CloudSolution(Arrays.asList(computer),
                                 Arrays.asList(process),
                                 null);
    }
}
