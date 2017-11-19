package com.polstech.kotlinsamples._4_classes;

/**
 * Created by prashantspol on 11/10/2017.
 */

public class JavaUser {
    private String name;
    private String country;

    public JavaUser(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public int hashCode() {
        int hash = 41;
        hash += hash * 13 + name.hashCode();
        hash += hash * 13 + country.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof JavaUser) {
            JavaUser anotherUser = (JavaUser) obj;
            return name.equals(anotherUser.name) && country.equals(anotherUser.country);
        }

        return false;
    }
}