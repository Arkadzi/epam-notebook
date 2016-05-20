package me.arkadiy.gumenniy;

import me.arkadiy.gumenniy.model.*;
import me.arkadiy.gumenniy.view.View;

/**
 * controller for constructing contacts and working with notebook
 *
 * @see Notebook
 */
public class Controller {
    /**
     * user interface
     */
    private View view;

    public Controller(View view) {
        this.view = view;
    }

    /**
     * starts constructing
     */
    public void start() {
        Notebook notebook = new Notebook();
        Contact contact = constructContact();
        notebook.addContact(contact);
    }

    /**
     * constructs contact
     *
     * @return constructed contact
     */
    private Contact constructContact() {
        Person person = constractPerson();
        String nickname = read("Index:", Pattern.NICKNAME);
        String mail = read("City:", Pattern.EMAIL);
        String skype = read("Street:", Pattern.SKYPE);
        Group group = readGroup();
        String homePhone = read("Home number:", Pattern.PHONE);
        String mobilePhone = read("Work number:", Pattern.PHONE);
        Contact contact = new Contact(person, nickname, group, mail, skype);
        contact.addPhoneNumber(PhoneNumberType.HOME, homePhone);
        contact.addPhoneNumber(PhoneNumberType.MOBILE, mobilePhone);

        return contact;
    }

    /**
     * constructs contact's group type
     *
     * @return constructed group
     */
    private Group readGroup() {
        String group = read("Group:", Pattern.GROUP);
        Group result;
        switch (group) {
            case "family":
                result = Group.FAMILY;
                break;
            case "friends":
                result = Group.FRIENDS;
                break;
            default:
                result = Group.OTHER;
        }
        return result;
    }

    /**
     * constructs new person
     *
     * @return new person
     */
    private Person constractPerson() {
        Address address = constructAddress();
        String surname = read("Index:", Pattern.SURNAME);
        String name = read("City:", Pattern.NAME);
        String patronymic = read("Street:", Pattern.PATRONYMIC);

        return new Person(surname, name, patronymic, address);
    }

    /**
     * constructs new addres
     *
     * @return new address
     */
    private Address constructAddress() {
        String index = read("Index:", Pattern.INDEX);
        String city = read("City:", Pattern.CITY);
        String street = read("Street:", Pattern.STREET);
        String house = read("House:", Pattern.HOUSE);
        String flat = read("Flat:", Pattern.FLAT);

        return new Address(index, city, street, house, flat);
    }

    /**
     * reads string which satisfies regular expression
     *
     * @param userMessage - message which invites user tu input string
     * @param regexp      - regular expression
     * @return satisfying string
     */
    private String read(String userMessage, String regexp) {
        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(regexp);
        boolean matches;
        String input;
        do {
            view.print(userMessage);
            input = view.read();
            matches = pattern.matcher(input).matches();
        } while (!matches);
        return input;
    }
}
