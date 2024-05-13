package Section_10.Exercice_44;

public class Main {
    public static void main(String[] args) {
        MobilePhone m = new MobilePhone("42424242");
        m.addNewContact(new Contact("Bob", "31415926"));
        m.addNewContact(new Contact("Alice", "16180339"));
        m.addNewContact(new Contact("Tom", "11235813"));
        m.addNewContact(new Contact("Jane", "23571113"));

        m.printContacts();
    }
}
