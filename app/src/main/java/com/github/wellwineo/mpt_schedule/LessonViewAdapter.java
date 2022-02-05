package com.github.wellwineo.mpt_schedule;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.github.wellwineo.mpt_schedule.Models.Lesson;
import com.github.wellwineo.mpt_schedule.R;

import java.util.List;
import java.util.zip.Inflater;

public class LessonViewAdapter extends ArrayAdapter<Lesson> {

    private  int resourceLayout;
    private Context mContext;

    public LessonViewAdapter(Context context, int resource, List<Lesson> items) {
        super(context, resource, items);
        this.resourceLayout = resource;
        this.mContext = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(mContext);
            convertView = inflater.inflate(resourceLayout, null);
        }

        Lesson lesson = getItem(position);

        if (lesson != null) {
            // get fucking elements
            TextView txtNumber = convertView.findViewById(R.id.txtNumberFirst);
            TextView txtTitle = convertView.findViewById(R.id.txtTitleFirst);
            TextView txtLecturer = convertView.findViewById(R.id.txtLecturerFirst);
            TextView txtTimeAt = convertView.findViewById(R.id.txtTimeAtFirst);

            // setting values
            // java: bindings? who is it? idk...
            txtNumber.setText(String.valueOf(lesson.getNumber()));
            txtTitle.setText(lesson.getTitle());
            txtLecturer.setText(lesson.getLecturer());
            txtTimeAt.setText(lesson.getTimeAt());
        }

        return convertView;
    }
}
