package com.telran.addressbook.model;

import java.util.Objects;

public class GroupDate {


    private  int id;
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

    public int getId() {
        return id;
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

    public GroupDate withId(int id) {
        this.id = id;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupDate groupDate = (GroupDate) o;
        return id == groupDate.id &&
                Objects.equals(nameGroup, groupDate.nameGroup);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, nameGroup);
    }

    @Override
    public String toString() {
        return "GroupDate{" +
                "id=" + id +
                ", nameGroup='" + nameGroup + '\'' +
                '}';
    }
}
