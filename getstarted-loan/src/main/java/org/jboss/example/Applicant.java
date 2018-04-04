package org.jboss.example;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("Mortgage Applicant")
public class Applicant implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("Name")
   private java.lang.String name;
   @org.kie.api.definition.type.Label("Annual Income")
   private java.lang.Integer annualincome;
   @org.kie.api.definition.type.Label("Address")
   private java.lang.String address;
   @org.kie.api.definition.type.Label("SSN")
   private java.lang.Integer ssn;
   @org.kie.api.definition.type.Label("Credit Rating")
   private java.lang.Integer creditrating;

   public Applicant()
   {
   }

   public java.lang.String getName()
   {
      return this.name;
   }

   public void setName(java.lang.String name)
   {
      this.name = name;
   }

   public java.lang.Integer getAnnualincome()
   {
      return this.annualincome;
   }

   public void setAnnualincome(java.lang.Integer annualincome)
   {
      this.annualincome = annualincome;
   }

   public java.lang.String getAddress()
   {
      return this.address;
   }

   public void setAddress(java.lang.String address)
   {
      this.address = address;
   }

   public java.lang.Integer getSsn()
   {
      return this.ssn;
   }

   public void setSsn(java.lang.Integer ssn)
   {
      this.ssn = ssn;
   }

   public java.lang.Integer getCreditrating()
   {
      return this.creditrating;
   }

   public void setCreditrating(java.lang.Integer creditrating)
   {
      this.creditrating = creditrating;
   }

   public Applicant(java.lang.String name, java.lang.Integer annualincome,
         java.lang.String address, java.lang.Integer ssn,
         java.lang.Integer creditrating)
   {
      this.name = name;
      this.annualincome = annualincome;
      this.address = address;
      this.ssn = ssn;
      this.creditrating = creditrating;
   }
   public String toString()
	{
		return "Applicant [creditrating=" + creditrating + ", income=" + annualincome + ", name=" + name + ", ssn=" + ssn + "]";
	}

   

}
