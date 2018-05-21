package com.telran.addressbook.model;

public class ContactData {
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final String nickname;
    private final String title;
    private final String company;
    private final String address;
    private final String home;
    private final String mobile;
    private final String work;
    private final String fax;
    private final String eMail;
    private final String eMail2;
    private final String eMail3;
    private final String homepage;
    private final String address1;
    private final String home1;
    private final String notes;

    public ContactData() {
        this.firstName = null;
        this.middleName = null;
        this.lastName = null;
        this.nickname = null;
        this.title = null;
        this.company = null;
        this.address = null;
        this.home = null;
        this.mobile = null;
        this.work = null;
        this.fax = null;
        this.eMail = null;
        this.eMail2 = null;
        this.eMail3 = null;
        this.homepage = null;
        this.address1 = null;
        this.home1 = null;
        this.notes = null;
    }

    public ContactData(String firstName, String middleName, String lastName, String nickname, String title, String company, String address, String home, String mobile, String work, String fax, String eMail, String eMail2, String eMail3, String homepage, String address1, String home1, String notes) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.nickname = nickname;
        this.title = title;
        this.company = company;
        this.address = address;
        this.home = home;
        this.mobile = mobile;
        this.work = work;
        this.fax = fax;
        this.eMail = eMail;
        this.eMail2 = eMail2;
        this.eMail3 = eMail3;
        this.homepage = homepage;
        this.address1 = address1;
        this.home1 = home1;
        this.notes = notes;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNickname() {
        return nickname;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String getHome() {
        return home;
    }

    public String getMobile() {
        return mobile;
    }

    public String getWork() {
        return work;
    }

    public String getFax() {
        return fax;
    }

    public String geteMail() {
        return eMail;
    }

    public String geteMail2() {
        return eMail2;
    }

    public String geteMail3() {
        return eMail3;
    }

    public String getHomepage() {
        return homepage;
    }

    public String getAddress1() {
        return address1;
    }

    public String getHome1() {
        return home1;
    }

    public String getNotes() {
        return notes;
    }
}
