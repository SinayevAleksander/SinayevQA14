package com.telran.addressbook.model;

public class GroupDate {
    private  String nameGroup;
    private  String header;
    private  String footer;

//    public GroupDate(String nameGroup, String header, String footer) {
//        this.nameGroup = nameGroup;
//        this.header = header;
//        this.footer = footer;
//    }

    public String getNameGroup() {
        return nameGroup;
    }

    public String getHeader() {
        return header;
    }

    public String getFooter() {
        return footer;
    }

    public GroupDate  withName(String nameGroup) {
        this.nameGroup = nameGroup;
        return this;
    }

    public GroupDate withHeader(String header) {
        this.header = header;
        return this;
    }

    public GroupDate withFooter(String footer) {
        this.footer = footer;
        return this;
    }
}
