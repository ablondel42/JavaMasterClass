package Section_10.Exercice_44;

import java.util.ArrayList;
import java.util.Objects;

public class MobilePhone {

    private final ArrayList<Contact> myContacts;
    private String myNumber;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contactToAdd) {
        for (Contact contact : myContacts) {
            if (Objects.equals(contact.getName(), contactToAdd.getName())) {
                return false;
            }
        }
        myContacts.add(contactToAdd);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        if (myContacts.remove(oldContact)) {
            return addNewContact(newContact);
        }
        return false;
    }

    public boolean removeContact(Contact contactToRemove) {
        return myContacts.remove(contactToRemove);
    }

    private int findContact(Contact contactToFind) {
        return myContacts.indexOf(contactToFind);
    }

    private int findContact(String nameToFind) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (Objects.equals(myContacts.get(i).getName(), nameToFind)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String nameToFind) {
        int found = findContact(nameToFind);

        if (found >= 0) {
            return myContacts.get(found);
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println((i + 1) +
                    ". " +
                    myContacts.get(i).getName() +
                    " -> " +
                    myContacts.get(i).getPhoneNumber()
            );
        }
    }
}
