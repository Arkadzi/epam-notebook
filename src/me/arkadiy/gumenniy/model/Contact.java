package me.arkadiy.gumenniy.model;

import java.util.HashMap;

/**
 * Created by Arkadiy on 20.05.2016.
 */
public class Contact {
    private Person person;
    private String nickname;
    private Group group;
    private String mail;
    private String skype;
    private String comment;
    private HashMap<PhoneNumberType, String> phoneNumbers;


    public Contact(Person person, String nickname, Group group,
                   String mail, String skype) {
        this.person = person;
        this.nickname = nickname;
        this.group = group;
        this.mail = mail;
        this.skype = skype;
        phoneNumbers = new HashMap<>();

    }

    public void addPhoneNumber(PhoneNumberType type, String number) {
        phoneNumbers.put(type, number);
    }

    public String getPhoneNumber(PhoneNumberType type) {
        return phoneNumbers.get(type);
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
