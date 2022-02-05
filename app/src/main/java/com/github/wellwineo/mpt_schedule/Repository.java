package com.github.wellwineo.mpt_schedule;

import com.github.wellwineo.mpt_schedule.Models.Day;
import com.github.wellwineo.mpt_schedule.Models.Lesson;

import java.util.ArrayList;
import java.util.Arrays;

public class Repository {
    public static ArrayList<Day> Schedule = new ArrayList<Day>(){
        {
            add(new Day("Понедельник", Arrays.asList(
                    new Lesson(2, "Системное программирование", "Копылов Х.З."),
                    new Lesson(3, "Разработка программных модулей", "Шимбирев Х.З."),
                    new Lesson(4, "Разработка мобильный приложений", "Лясников А.О."),
                    new Lesson(5, "Физическая культура", "Андрюков Х.З.")
                    )));
            add(new Day("Вторник", Arrays.asList(
                    new Lesson(1, "ПРАКТИКА", "-"),
                    new Lesson(2, "ПРАКТИКА", "-"),
                    new Lesson(3, "ПРАКТИКА", "-"),
                    new Lesson(4, "ПРАКТИКА", "-"),
                    new Lesson(5, "ПРАКТИКА", "-")
                    )));
            add(new Day("Среда", Arrays.asList(
                    new Lesson(1, "ПРАКТИКА", "-"),
                    new Lesson(2, "ПРАКТИКА", "-"),
                    new Lesson(3, "ПРАКТИКА", "-"),
                    new Lesson(4, "ПРАКТИКА", "-"),
                    new Lesson(5, "ПРАКТИКА", "-")
            )));
            add(new Day("Четверг", Arrays.asList(
                    new Lesson(1, "Инструментальные средства разработки ПО", "Севастьянов Х.З."),
                    new Lesson(2, "Технология разработки ПО", "Соколова Х.З."),
                    new Lesson(3, "Иностранный язык", "Дымова А.О."),
                    new Lesson(4, "Теория разработки и защиты БД", "Волкова Х.З.")
            )));
            add(new Day("Пятница", Arrays.asList(
                    new Lesson(2, "Системное программирование", "Копылов Х.З."),
                    new Lesson(3, "Разработка программных модулей", "Бушин Х.З."),
                    new Lesson(4, "Технология разработки ПО", "Соколова Х.З."),
                    new Lesson(5, "Разработка мобильный приложений", "Лясников А.О.")
            )));

        }
    };
}
