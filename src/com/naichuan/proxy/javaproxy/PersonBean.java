package com.naichuan.proxy.javaproxy;

/**
 * @author Naichuan Zhang
 * @since 12/12/2021
 */
public interface PersonBean {
    String getName();
    String getGender();
    String getInterests();
    int getGeekRating();

    void setName(String name);
    void setGender(String gender);
    void setInterests(String interests);
    void setGeekRating(int rating);
}
