package Section_7.Exercice_31;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int value) {
        if (value < 0 || value > 100) {
            this.age = 0;
        } else {
            this.age = value;
        }
    }

    public boolean isTeen() {
        return age > 12 && age < 20;
    }

    public String getFullName() {
        String fName = (firstName.isEmpty() ? "": firstName);
        String lName = (lastName.isEmpty() ? "": lastName);
        String fullName = "";
        if (!fName.isEmpty() && !lName.isEmpty()) {
            fullName = fName + " " + lName;
        } else if (fName.isEmpty()) {
            fullName = lName;
        } else {
            fullName = fName;
        }
        return fullName;
    }
}
