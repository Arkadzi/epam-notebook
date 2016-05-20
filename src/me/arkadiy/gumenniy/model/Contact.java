package me.arkadiy.gumenniy.model;

import java.util.HashMap;

/**
 * Class that stores data about contact in notebook
 *
 * @see Notebook
 */
public class Contact {
    /**
     * owner of contact info
     */
    private Person person;
    /**
     * persons nickname
     */
    private String nickname;
    /**
     * group of contact
     */
    private Group group;
    /**
     * person's email
     */
    private String mail;
    /**
     * person's skype
     */
    private String skype;
    /**
     * contact comments
     */
    private String comment;
    /**
     * map of phone numbers by types.
     *
     * @see PhoneNumberType
     */
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

    /**
     * adds phone number by appropriate phone number type
     *
     * @param type   - type of phone number
     * @param number - phone number
     */
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
