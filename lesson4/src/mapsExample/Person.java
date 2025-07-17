package mapsExample;

// Person class definition
class Person {

    // Private fields for name and email
    private final String name;
    private final String email;

    // Constructor to initialize name and email
    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Getter method for email
    public String getEmail() {
        return email;
    }

    // Override toString method to provide a string representation of the object
    @Override
    public String toString() {
        return name + " " + email;
    }
}
