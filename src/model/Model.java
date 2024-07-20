package model;

import java.util.ArrayList;

public class Model {
    private ArrayList<Person> personList = new ArrayList<>();

    public void addPerson(Person person) {
        personList.add(person);
    }

    public void deletePerson(String name) {
        personList.removeIf(person -> person.getName().equalsIgnoreCase(name));
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }
}
