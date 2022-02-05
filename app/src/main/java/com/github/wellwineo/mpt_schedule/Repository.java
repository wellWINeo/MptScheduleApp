package com.github.wellwineo.mpt_schedule;

import com.github.wellwineo.mpt_schedule.Models.Address;
import com.github.wellwineo.mpt_schedule.Models.Day;
import com.github.wellwineo.mpt_schedule.Models.Lesson;
import com.github.wellwineo.mpt_schedule.Models.Periodic;

import java.util.ArrayList;
import java.util.Arrays;

public class Repository {
    public static ArrayList<Day> Schedule = new ArrayList<Day>(){
        {
            add(new Day("Понедельник", Address.Nahim, Arrays.asList(
                    new Lesson(2, "Системное программирование", "Копылов О.В.", Periodic.Numerator),
                    new Lesson(2, "Теория разработки и защиты БД", "Волкова Г.Ю.", Periodic.Denominator),
                    new Lesson(3, "Разработка программных модулей", "Шимбирев А.А."),
                    new Lesson(4, "Разработка мобильный приложений", "Лясников А.О.", Periodic.Numerator),
                    new Lesson(4, "Разработка программных модулей", "Бушин А.Ю.", Periodic.Denominator),
                    new Lesson(5, "Физическая культура", "Андрюков А.В.")
                    )));
            add(new Day("Вторник", Address.None, Arrays.asList(
                    new Lesson(1, "ПРАКТИКА", "-"),
                    new Lesson(2, "ПРАКТИКА", "-"),
                    new Lesson(3, "ПРАКТИКА", "-"),
                    new Lesson(4, "ПРАКТИКА", "-"),
                    new Lesson(5, "ПРАКТИКА", "-")
                    )));
            add(new Day("Среда", Address.None, Arrays.asList(
                    new Lesson(1, "ПРАКТИКА", "-"),
                    new Lesson(2, "ПРАКТИКА", "-"),
                    new Lesson(3, "ПРАКТИКА", "-"),
                    new Lesson(4, "ПРАКТИКА", "-"),
                    new Lesson(5, "ПРАКТИКА", "-")
            )));
            add(new Day("Четверг", Address.Nezh, Arrays.asList(
                    new Lesson(1, "Инструментальные средства разработки ПО", "Севастьянов Ю.В."),
                    new Lesson(2, "Технология разработки ПО", "Соколова Л.А."),
                    new Lesson(3, "Иностранный язык", "Завьялова А.Д., Дымская А.Ю."),
                    new Lesson(4, "Теория разработки и защиты БД", "Волкова Г.Ю.")
            )));
            add(new Day("Пятница", Address.Nahim, Arrays.asList(
                    new Lesson(2, "Системное программирование", "Копылов О.В."),
                    new Lesson(3, "Разработка программных модулей", "Бушин А.Ю."),
                    new Lesson(4, "Технология разработки ПО", "Соколова Л.А.", Periodic.Numerator),
                    new Lesson(4, "Инструментальные средства разработки ПО", "Севастьянов Ю.В.", Periodic.Denominator),
                    new Lesson(5, "Разработка мобильный приложений", "Лясников А.О.")
            )));

        }
    };
}
