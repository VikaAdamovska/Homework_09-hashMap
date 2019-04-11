package edu.hillel.map;

import java.util.Objects;

public class Phone {

    private int id;
    private String trademark;

    public Phone(int id, String trademark) {
        this.id = id;
        this.trademark = trademark;
    }

    public int getId() {
        return id;
    }

    public String getTrademark() {
        return trademark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return id == phone.id &&
                Objects.equals(trademark, phone.trademark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, trademark);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", trademark='" + trademark + '\'' +
                '}';
    }
}
