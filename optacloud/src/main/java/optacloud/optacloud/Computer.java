package optacloud.optacloud;

public class Computer implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    @org.kie.api.definition.type.Label("CPU power")
    @org.kie.api.definition.type.Description("In gigahertz")
    private int cpuPower;
    @org.kie.api.definition.type.Label("Memory")
    @org.kie.api.definition.type.Description("In gigabyte RAM")
    private int memory;
    @org.kie.api.definition.type.Label("Network bandwidth")
    @org.kie.api.definition.type.Description("In gigabyte per hour")
    private int networkBandwidth;
    @org.kie.api.definition.type.Label("Hosting cost")
    @org.kie.api.definition.type.Description("In dollars per month")
    private int cost;

    public Computer() {
    }

    public int getCpuPower() {
        return this.cpuPower;
    }

    public void setCpuPower( int cpuPower ) {
        this.cpuPower = cpuPower;
    }

    public int getMemory() {
        return this.memory;
    }

    public void setMemory( int memory ) {
        this.memory = memory;
    }

    public int getNetworkBandwidth() {
        return this.networkBandwidth;
    }

    public void setNetworkBandwidth( int networkBandwidth ) {
        this.networkBandwidth = networkBandwidth;
    }

    public int getCost() {
        return this.cost;
    }

    public void setCost( int cost ) {
        this.cost = cost;
    }

    public Computer( int cpuPower, int memory, int networkBandwidth, int cost ) {
        this.cpuPower = cpuPower;
        this.memory = memory;
        this.networkBandwidth = networkBandwidth;
        this.cost = cost;
    }

}