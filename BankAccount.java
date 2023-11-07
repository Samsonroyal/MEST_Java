public class BankAccount {
    private String accountNumber = "2345234560";
    private String lastName = "AHEDOR";
    private String middleName = "KWAME";
    private String firstName = "BRIGHT";
    // private double balance = 1000.00;

    

// For get methods, we don't need to validate the data; we use the get methods to retrieve data, and thus the String data type is returned.
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getFirstName() {
        return firstName;
    }

    // for set methods, we need to validate the data; we use the set methods to set data, and thus the void data type is returned.
    public void setLastName(String lastName) {
        if(lastName.length() < 2)   {
            System.out.println("Last name must be at least 2 characters");
        }
        else {
            this.lastName = lastName;
        }
    }

    public void setMiddleName(String middleName) {
        if(middleName.length() < 2)   {
            System.out.println("Middle name must be at least 2 characters");
        }
        else {
            this.middleName = middleName;
        }
    }

    public void setFirstName(String firstName) {
        if(firstName.length() < 2)   {
            System.out.println("First name must be at least 2 characters");
        }
        else {
            this.firstName = firstName;
        }
    }

    public void setAccountNumber(String accountNumber) {
        if(accountNumber.length() != 10)   {
            System.out.println("Account number must be 10 digits");
        }
        else {
            this.accountNumber = accountNumber;
        }
    }




    
}
