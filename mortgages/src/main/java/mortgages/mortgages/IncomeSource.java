package mortgages.mortgages;

public class IncomeSource extends java.lang.Object implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    @org.kie.api.definition.type.Position(value = 0)
    private java.lang.Integer amount;

    @org.kie.api.definition.type.Position(value = 1)
    private java.lang.String type;

    public IncomeSource() {
    }

    public IncomeSource( java.lang.Integer amount, java.lang.String type ) {
        this.amount = amount;
        this.type = type;
    }

    public java.lang.Integer getAmount() {
        return this.amount;
    }

    public void setAmount( java.lang.Integer amount ) {
        this.amount = amount;
    }

    public java.lang.String getType() {
        return this.type;
    }

    public void setType( java.lang.String type ) {
        this.type = type;
    }
}
