package Information;

import java.util.ArrayList;

class Directory {
    private ArrayList<Person> persons;

    public Directory() {
        persons = new ArrayList<>();
    }

    public boolean addPerson(Person person) {
        for (Person p : persons) {
            if (p.getUniqueID().equals(person.getUniqueID())) {
                return false; 
            }
            if (p.getTelephone().equals(person.getTelephone()) && !p.getHeadOfFamily().equals(person.getHeadOfFamily())) {
                return false; 
            }
        }
        persons.add(person);
        return true;
    }

    public void displayAll() {
        if (persons.isEmpty()) {
            System.out.println("No entries found.");
        } else {
            for (Person person : persons) {
                System.out.println(person);
            }
        }
    }
}
