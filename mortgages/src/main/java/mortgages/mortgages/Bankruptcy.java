package mortgages.mortgages;

public class Bankruptcy extends java.lang.Object implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    @org.kie.api.definition.type.Position(value = 0)
    private java.lang.Integer amountOwed;

    @org.kie.api.definition.type.Position(value = 1)
    private java.lang.Integer yearOfOccurrence;

    public Bankruptcy() {
    }

    public Bankruptcy( java.lang.Integer amountOwed, java.lang.Integer yearOfOccurrence ) {
        this.amountOwed = amountOwed;
        this.yearOfOccurrence = yearOfOccurrence;
    }

    public java.lang.Integer getAmountOwed() {
        return this.amountOwed;
    }

    public void setAmountOwed( java.lang.Integer amountOwed ) {
        this.amountOwed = amountOwed;
    }

    public java.lang.Integer getYearOfOccurrence() {
        return this.yearOfOccurrence;
    }

    public void setYearOfOccurrence( java.lang.Integer yearOfOccurrence ) {
        this.yearOfOccurrence = yearOfOccurrence;
    }
}
