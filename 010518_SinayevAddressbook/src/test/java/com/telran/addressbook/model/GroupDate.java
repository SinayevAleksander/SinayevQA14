package com.telran.addressbook.model;

public class GroupDate {
    private final String nameGroup;
    private final String header;
    private final String footer;

    public GroupDate(String nameGroup, String header, String footer) {
        this.nameGroup = nameGroup;
        this.header = header;
        this.footer = footer;
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public String getHeader() {
        return header;
    }

    public String getFooter() {
        return footer;
    }
}
