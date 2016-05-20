package me.arkadiy.gumenniy;

/**
 * Created by Arkadiy on 20.05.2016.
 */
public interface Pattern {
    String EMAIL = "/^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$/";
    String NICKNAME = "/^[a-z0-9_-]{3,16}$/";
    String SKYPE = "/^[a-z0-9_-]{3,16}$/";
    String NAME = "/^[A-Z][a-z]{0,30}$/";
    String SURNAME = "/^[A-Z][a-z]{0,30}$/";
    String PATRONYMIC = "/^[A-Z][a-z]{0,30}$/";
    String CITY = "/^[A-Z][a-z]{0,30}$/";
    String STREET = "/^[A-Z][a-z]{0,40}$/";
    String HOUSE = "/^[0-9]{1,4}[A-Z]$/";
    String FLAT = "/^[0-9]{1,5}[A-Z]$/";
    String INDEX = "/^[0-9]{5,10}[A-Z]{0,3}$/";
    String PHONE = "/^[0-9\\+]{1,}[0-9\\-]{3,15}$/";
    String GROUP = "/^family|friends|other$/";
}
