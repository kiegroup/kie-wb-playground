package mortgages.mortgages;

public class LoanApplication extends java.lang.Object implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    @org.kie.api.definition.type.Position(value = 0)
    private java.lang.Integer amount;

    @org.kie.api.definition.type.Position(value = 1)
    private java.lang.Boolean approved;

    @org.kie.api.definition.type.Position(value = 3)
    private java.lang.Integer approvedRate;

    @org.kie.api.definition.type.Position(value = 2)
    private java.lang.Integer deposit;

    @org.kie.api.definition.type.Position(value = 5)
    private java.lang.String explanation;

    @org.kie.api.definition.type.Position(value = 6)
    private java.lang.Integer insuranceCost;

    @org.kie.api.definition.type.Position(value = 4)
    private java.lang.Integer lengthYears;

    public LoanApplication() {
    }

    public LoanApplication( java.lang.Integer amount, java.lang.Boolean approved, java.lang.Integer deposit, java.lang.Integer approvedRate, java.lang.Integer lengthYears, java.lang.String explanation, java.lang.Integer insuranceCost ) {
        this.amount = amount;
        this.approved = approved;
        this.deposit = deposit;
        this.approvedRate = approvedRate;
        this.lengthYears = lengthYears;
        this.explanation = explanation;
        this.insuranceCost = insuranceCost;
    }

    public java.lang.Integer getAmount() {
        return this.amount;
    }

    public void setAmount( java.lang.Integer amount ) {
        this.amount = amount;
    }

    public java.lang.Boolean getApproved() {
        return this.approved;
    }

    public void setApproved( java.lang.Boolean approved ) {
        this.approved = approved;
    }

    public java.lang.Integer getApprovedRate() {
        return this.approvedRate;
    }

    public void setApprovedRate( java.lang.Integer approvedRate ) {
        this.approvedRate = approvedRate;
    }

    public java.lang.Integer getDeposit() {
        return this.deposit;
    }

    public void setDeposit( java.lang.Integer deposit ) {
        this.deposit = deposit;
    }

    public java.lang.String getExplanation() {
        return this.explanation;
    }

    public void setExplanation( java.lang.String explanation ) {
        this.explanation = explanation;
    }

    public java.lang.Integer getInsuranceCost() {
        return this.insuranceCost;
    }

    public void setInsuranceCost( java.lang.Integer insuranceCost ) {
        this.insuranceCost = insuranceCost;
    }

    public java.lang.Integer getLengthYears() {
        return this.lengthYears;
    }

    public void setLengthYears( java.lang.Integer lengthYears ) {
        this.lengthYears = lengthYears;
    }
}
