
  [when]When the credit rating is {rating:ENUM:Applicant.creditRating} = applicant:Applicant(creditRating=="{rating}")
    [then]Approve the loan = applicant.setApproved(true)
    
    [when]When the applicant dates is after {dos:DATE:default} = applicant:Applicant(applicationDate>"{dos}")
    
    [when]When the applicant approval is {bool:BOOLEAN:checked} = applicant:Applicant(approved=={bool})
    
    [when]When the ages is less than {num:1?[0-9]?[0-9]} = applicant:Applicant(age<{num})
  