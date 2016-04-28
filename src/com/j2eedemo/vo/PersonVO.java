package com.j2eedemo.vo;

import javax.persistence.*;

/**
 * Created by Administrator on 2016/4/28.
 */
@Entity
@Table(name = "Person", schema = "", catalog = "")
public class PersonVO {
    private int id;
    private String personName;
    private int personAge;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "PersonName")
    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    @Basic
    @Column(name = "PersonAge")
    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonVO personVO = (PersonVO) o;

        if (id != personVO.id) return false;
        if (personAge != personVO.personAge) return false;
        return personName != null ? personName.equals(personVO.personName) : personVO.personName == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (personName != null ? personName.hashCode() : 0);
        result = 31 * result + personAge;
        return result;
    }
}
