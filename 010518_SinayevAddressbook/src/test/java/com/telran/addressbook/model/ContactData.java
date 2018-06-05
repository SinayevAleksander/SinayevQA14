package com.telran.addressbook.model;

import java.io.File;

public class ContactData {
    private String firstName;
    private String middleName;
    private String lastName;
    private String nickname;
    private String title;
    private String company;
    private String address;
    private String home;
    private String mobile;
    private String work;
    private String fax;
    private String eMail;
    private String eMail2;
    private String eMail3;
    private String homepage;
    private String address1;
    private String home1;
    private String notes;
    private File photo;
    private String group;

//        public ContactData() {
//        this.firstName = null;
//        this.middleName = null;
//        this.lastName = null;
//        this.nickname = null;
//        this.title = null;
//        this.company = null;
//        this.address = null;
//        this.home = null;
//        this.mobile = null;
//        this.work = null;
//        this.fax = null;
//        this.eMail = null;
//        this.eMail2 = null;
//        this.eMail3 = null;
//        this.homepage = null;
//        this.address1 = null;
//        this.home1 = null;
//        this.notes = null;
//    }

//    public ContactData(String firstName, String middleName, String lastName, String nickname, String title, String company, String address, String home, String mobile, String work, String fax, String eMail, String eMail2, String eMail3, String homepage, String address1, String home1, String notes) {
//        this.firstName = firstName;
//        this.middleName = middleName;
//        this.lastName = lastName;
//        this.nickname = nickname;
//        this.title = title;
//        this.company = company;
//        this.address = address;
//        this.home = home;
//        this.mobile = mobile;
//        this.work = work;
//        this.fax = fax;
//        this.eMail = eMail;
//        this.eMail2 = eMail2;
//        this.eMail3 = eMail3;
//        this.homepage = homepage;
//        this.address1 = address1;
//        this.home1 = home1;
//        this.notes = notes;
//    }

    public ContactData withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public ContactData withMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public ContactData withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public ContactData withNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public ContactData withTitle(String title) {
        this.title = title;
        return this;
    }

    public ContactData withCompany(String company) {
        this.company = company;
        return this;
    }

    public ContactData withAddress(String address) {
        this.address = address;
        return this;
    }

    public ContactData withHome(String home) {
        this.home = home;
        return this;
    }

    public ContactData withMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    public ContactData withWork(String work) {
        this.work = work;
        return this;
    }

    public ContactData withFax(String fax) {
        this.fax = fax;
        return this;
    }

    public ContactData withEMail(String eMail) {
        this.eMail = eMail;
        return this;
    }

    public ContactData withEMail2(String eMail2) {
        this.eMail2 = eMail2;
        return this;
    }

    public ContactData withEMail3(String eMail3) {
        this.eMail3 = eMail3;
        return this;
    }

    public ContactData withHomepage(String homepage) {
        this.homepage = homepage;
        return this;
    }

    public ContactData withAddress1(String address1) {
        this.address1 = address1;
        return this;
    }

    public ContactData withHome1(String home1) {
        this.home1 = home1;
        return this;
    }

    public ContactData withNotes(String notes) {
        this.notes = notes;
        return this;
    }

    public ContactData withPhoto(File photo) {
        this.photo = photo;
        return this;
    }

    public ContactData withGroup(String group) {
        this.group = group;
        return this;
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

    public File getPhoto() {
        return photo;
    }

    public String getGroup() {
        return group;
    }


}




