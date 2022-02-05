package com.github.wellwineo.mpt_schedule;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.GravityInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.github.wellwineo.mpt_schedule.Models.Lesson;
import com.github.wellwineo.mpt_schedule.Models.Periodic;
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
            TextView txtNumberFirst = convertView.findViewById(R.id.txtNumberFirst);
            TextView txtTitleFirst = convertView.findViewById(R.id.txtTitleFirst);
            TextView txtLecturerFirst = convertView.findViewById(R.id.txtLecturerFirst);
            TextView txtTimeAtFirst = convertView.findViewById(R.id.txtTimeAtFirst);

            // setting values
            // java: bindings? who is it? idk...
            txtNumberFirst.setText(String.valueOf(lesson.getNumber()));
            txtTitleFirst.setText(lesson.getTitle());
            txtLecturerFirst.setText(lesson.getLecturer());
            txtTimeAtFirst.setText(lesson.getTimeAt());

            GradientDrawable shape = (GradientDrawable) convertView.getBackground();
            if (lesson.Periodic == Periodic.Numerator)
                shape.setColor(
                        mContext.getResources().getColor(R.color.red)
                );
            else if (lesson.Periodic == Periodic.Denominator)
                shape.setColor(
                        mContext.getResources().getColor(R.color.blue)
                );
            else
                shape.setColor(
                        mContext.getResources().getColor(R.color.white)
                );
        }

        return convertView;
    }
}
