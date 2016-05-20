package me.arkadiy.gumenniy;

import me.arkadiy.gumenniy.model.*;
import me.arkadiy.gumenniy.view.View;

/**
 * Created by Arkadiy on 20.05.2016.
 */
public class Controller {
    private View view;

    public Controller(View view) {
        this.view = view;
    }

    public void start() {
        Notebook notebook = new Notebook();
        Contact contact = constructContact();
        notebook.addContact(contact);
    }

    private Contact constructContact() {
        Person person = constractPerson();
        String nickname = read("Index:", Pattern.SURNAME);
        String mail = read("City:", Pattern.NAME);
        String skype = read("Street:", Pattern.PATRONYMIC);
        Group group = readGroup();
        String homePhone = read("Home number:", Pattern.PHONE);
        String mobilePhone = read("Work number:", Pattern.PHONE);
        Contact contact = new Contact(person, nickname, group, mail, skype);
        contact.addPhoneNumber(PhoneNumberType.HOME, homePhone);
        contact.addPhoneNumber(PhoneNumberType.MOBILE, mobilePhone);

        return contact;
    }

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

    private Person constractPerson() {
        Address address = constructAddress();
        String surname = read("Index:", Pattern.SURNAME);
        String name = read("City:", Pattern.NAME);
        String patronymic = read("Street:", Pattern.PATRONYMIC);

        return new Person(surname, name, patronymic, address);
    }


    private Address constructAddress() {
        String index = read("Index:", Pattern.INDEX);
        String city = read("City:", Pattern.CITY);
        String street = read("Street:", Pattern.STREET);
        String house = read("House:", Pattern.HOUSE);
        String flat = read("Flat:", Pattern.FLAT);

        return new Address(index, city, street, house, flat);
    }

    private String read(String s, String regexp) {
        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(regexp);
        boolean matches;
        String input;
        do {
            view.print(s);
            input = view.read();
            matches = pattern.matcher(input).matches();
        } while (!matches);
        return input;
    }
}
