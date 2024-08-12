//this file covers some design principles
//Tight coupling~ when all the variables within a public class are declared as public the class is said to be tightly coupled as the variables are directly accessible by the user
//tight coupling has many issues like:-
//1.the developer cannot enforce a set of rules on the input values
//2.whenever the developer makes any changes to the data representation it may cause issues to the users
//to tackle this issue we use accessor methods and mutator methods
//also known as getter-setter methods


import java.util.Objects;

public class coupling {
    private String gender;

    // getter method/accessor method
    public String getGender() {
        return gender;
    }

    // setter method/mutator method
    public void setGender(String gender) {
        if (gender.equals("male") || gender.equals("female") ) {
            this.gender = gender;
        }
    }
}
