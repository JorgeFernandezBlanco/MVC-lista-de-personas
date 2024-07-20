package controller;

import model.Model;
import model.Person;
import view.View;

import java.util.ArrayList;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void start() {
        int option = 0;
        while (option != 3) {
            option = view.showMenu();
            switch (option) {
                case 0:
                    addPerson();
                    break;
                case 1:
                    deletePerson();
                    break;
                case 2:
                    showList();
                    break;
                case 3:
                    view.showMessage("Exiting program...");
                    break;
                default:
                    view.showMessage("Invalid option. Select a valid option from 1 to 4.");
            }
        }
    }

    private void addPerson() {
        String name = view.showInputDialog("Enter the name:");
        String phone = view.showInputDialog("Enter the phone:");

        model.addPerson(new Person(name, phone));
        view.showMessage("Person added successfully.");
    }

    private void deletePerson() {
        String name = view.showInputDialog("Enter the name of the person you want to delete:");

        model.deletePerson(name);
        view.showMessage("Person deleted successfully.");
    }

    private void showList() {
        ArrayList<String> list = new ArrayList<>();
        for (Person person : model.getPersonList()) {
            list.add(person.getName() + " - Tel: " + person.getPhone());
        }
        view.showList(list);
    }
}
