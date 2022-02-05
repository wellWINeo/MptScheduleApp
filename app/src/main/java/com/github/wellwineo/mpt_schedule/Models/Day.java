package com.github.wellwineo.mpt_schedule.Models;

import android.widget.ListView;

import java.util.List;

public class Day {
    public String DayName;
    public Address Address;
    public List<Lesson> Lessons;

    public Day(String dayName, Address address, List<Lesson> lessons) {
        this.DayName = dayName;
        this.Address = address;
        this.Lessons = lessons;
    }

    public Day(String dayName, List<Lesson> lessons) {
        this.DayName = dayName;
        this.Lessons = lessons;
        this.Address = Address.Nezh;
    }

    public String getDayName() {
        return DayName;
    }

    public void setDayName(String dayName) {
        DayName = dayName;
    }

    public com.github.wellwineo.mpt_schedule.Models.Address getAddress() {
        return Address;
    }

    public void setAddress(com.github.wellwineo.mpt_schedule.Models.Address address) {
        Address = address;
    }

    public List<Lesson> getLessons() {
        return Lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        Lessons = lessons;
    }
}
