public class Person {
    // Fields
    private String firstName;
    private String lastName;
    private int age;

    // Main method
    public static void main(String[] args) {
        //  local method Calling
        detaPerson();
    }

    // Local method
    private static void detaPerson() {
        // Create a new Person object
        Person person = new Person();

        // Set first name and last name as empty strings, age as 10
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);

        // Display full name and teen status
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());

        // Set first name as "John" and age as 18
        person.setFirstName("John");
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());

        // Set last name as "Smith"
        person.setLastName("Smith");
        System.out.println("fullName= " + person.getFullName());
    }

    // Getter methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    // Setter methods
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    // Method to check if person is a teen
    public boolean isTeen() {
        return age > 12 && age < 20;
    }

    // Method to get full name
    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        } else if (firstName.isEmpty()) {
            return lastName;
        } else if (lastName.isEmpty()) {
            return firstName;
        } else {
            return firstName + " " + lastName;
        }
    }
}




