package mapsExample;

import java.util.HashMap;
import java.util.Map;

public class MapExercise {

    // The main method is the entry point of your program
    public static void main(String[] args) {

        Map<String, Person> mapOfPeople = new HashMap<>(); // Using diamond operator for cleaner code

        Person mike = new Person("Mike", "mike@example");
        Person ashu = new Person("Ashu", "ashu@example");
        Person tanu = new Person("Tanu", "tanu@example");

        // Add people to the map using their email as the key
        addToMap(mapOfPeople, mike);
        addToMap(mapOfPeople, ashu);
        addToMap(mapOfPeople, tanu);

        System.out.println("--- Iterating through Keys (Emails) ---");
        for (String email : mapOfPeople.keySet()) {
            System.out.println("Key (Email): " + email);
        }

        System.out.println("\n--- Iterating through Values (Persons) ---");
        for (Person person : mapOfPeople.values()) {
            System.out.println("Person: " + person);
        }

        System.out.println("\n--- Getting a specific person ---");
        // Note: You used "mike@email.com" in your original code, but "mike@example"
        // is what you used when creating the Person object.
        System.out.println("Get Mike: " + mapOfPeople.get("mike@example"));
        System.out.println("Get Tanu: " + mapOfPeople.get("tanu@example"));

        // Example of trying to get a non-existent person
        System.out.println("Get Non-existent: " + mapOfPeople.get("nonexistent@example.com"));

    }

    // A helper method to add a Person to the Map using their email as the key
    public static void addToMap(Map<String, Person> map, Person person) {
        map.put(person.getEmail(), person);
    }
}