package com.github.wellwineo.mpt_schedule;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.GradientDrawable;
import android.icu.util.LocaleData;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.github.wellwineo.mpt_schedule.Models.Day;
import com.github.wellwineo.mpt_schedule.Models.Lesson;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvSchedule;
    private TextView txtWeekNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar bar= getSupportActionBar();
        if (bar != null)
            bar.setTitle("Расписание МПТ");

        Calendar calendar = Calendar.getInstance();
        int weekNumber = (int) calendar.get(Calendar.DAY_OF_YEAR) / 7;

        rvSchedule = findViewById(R.id.rvSchedule);
        txtWeekNumber = findViewById(R.id.txtWeekNumber);

        GradientDrawable drawable = (GradientDrawable) txtWeekNumber.getBackground();
        if (weekNumber % 2 == 0) {
            txtWeekNumber.setText("Знаменатель");
            drawable.setColor(getResources().getColor(R.color.blue));
        } else {
            txtWeekNumber.setText("Числитель");
            drawable.setColor(getResources().getColor(R.color.red));
        }

        DayViewAdapter adapter = new DayViewAdapter(this, Repository.Schedule);
        rvSchedule.setLayoutManager(new LinearLayoutManager(this));

        rvSchedule.setAdapter(adapter);
    }
}