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