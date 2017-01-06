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