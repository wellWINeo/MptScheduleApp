package com.github.wellwineo.mpt_schedule;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ListView;

import com.github.wellwineo.mpt_schedule.Models.Day;
import com.github.wellwineo.mpt_schedule.Models.Lesson;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvSchedule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        List<Day> days = Arrays.asList(
//                new Day("Понедельник", Arrays.asList(
//                        new Lesson(1, "Разработка мобильных приложений", "Лясников А.О."),
//                        new Lesson(1, "Разработка мобильных приложений", "Лясников А.О."),
//                        new Lesson(1, "Разработка мобильных приложений", "Лясников А.О.")
//                )),
//                new Day("Понедельник", Arrays.asList(
//                        new Lesson(1, "Разработка мобильных приложений", "Лясников А.О."),
//                        new Lesson(1, "Разработка мобильных приложений", "Лясников А.О."),
//                        new Lesson(1, "Разработка мобильных приложений", "Лясников А.О.")
//                )),
//                new Day("Понедельник", Arrays.asList(
//                        new Lesson(1, "Разработка мобильных приложений", "Лясников А.О."),
//                        new Lesson(1, "Разработка мобильных приложений", "Лясников А.О."),
//                        new Lesson(1, "Разработка мобильных приложений", "Лясников А.О.")
//                ))
//        );

        rvSchedule = findViewById(R.id.rvSchedule);

        DayViewAdapter adapter = new DayViewAdapter(this, Repository.Schedule);
        rvSchedule.setLayoutManager(new LinearLayoutManager(this));

        rvSchedule.setAdapter(adapter);
    }
}