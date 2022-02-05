package com.github.wellwineo.mpt_schedule.Models;

public class Lesson {
    public int Number;
    public String Title;
    public String Lecturer;
    public String TimeAt;
    public Periodic Periodic;

    public Lesson(int number, String title, String lecturer, Periodic periodic){
        this.Number = number;
        this.Title = title;
        this.Lecturer = lecturer;
        this.Periodic = periodic;
        switch (number) {
            case 1:
                this.TimeAt = "8:30-10:00";
                break;
            case 2:
                this.TimeAt = "10:10-11:40";
                break;
            case 3:
                this.TimeAt = "12:00-13:30";
                break;
            case 4:
                this.TimeAt = "14:00-15:30";
                break;
            case 5:
                this.TimeAt = "15:40-17:10";
                break;
        }
    }

    public Lesson(int number, String title, String lecturer) {
        this.Number = number;
        this.Title = title;
        this.Lecturer = lecturer;
        this.Periodic = Periodic.Both;
        switch (number) {
            case 1:
                this.TimeAt = "8:30-10:00";
                break;
            case 2:
                this.TimeAt = "10:10-11:40";
                break;
            case 3:
                this.TimeAt = "12:00-13:30";
                break;
            case 4:
                this.TimeAt = "14:00-15:30";
                break;
            case 5:
                this.TimeAt = "15:40-17:10";
                break;
        }
    }

        public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getLecturer() {
        return Lecturer;
    }

    public void setLecturer(String lecturer) {
        Lecturer = lecturer;
    }

    public String getTimeAt() {
        return TimeAt;
    }

    public void setTimeAt(String timeAt) {
        TimeAt = timeAt;
    }
}
