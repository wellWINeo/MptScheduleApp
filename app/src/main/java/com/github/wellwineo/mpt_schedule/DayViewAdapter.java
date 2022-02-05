package com.github.wellwineo.mpt_schedule;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.github.wellwineo.mpt_schedule.Models.Address;
import com.github.wellwineo.mpt_schedule.Models.Day;
import com.github.wellwineo.mpt_schedule.Models.Lesson;

import org.w3c.dom.Text;

import java.util.List;

public class DayViewAdapter extends RecyclerView.Adapter<DayViewAdapter.DayViewHolder> {

    private List<Day> data;
    private Context mContext;

    public DayViewAdapter(Context context, List<Day> days) {
        this.data = days;
        this.mContext = context;
    }

    @NonNull
    @Override
    public DayViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.day_view, parent, false);
        return  new DayViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DayViewHolder holder, int position) {
        Day day = getItem(position);

        holder.dayName.setText(day.getDayName());
        holder.address.setText(day.getAddress() == Address.Nahim ?
                "Нахимовский"
                : "Нежинская");
        LessonViewAdapter adapter = new LessonViewAdapter(mContext,
                R.layout.lesson_view, day.getLessons());
        holder.lessons.setAdapter(adapter);
    }

    private Day getItem(int id) {
        return data.get(id);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class DayViewHolder extends RecyclerView.ViewHolder {
        TextView dayName;
        TextView address;
        ListView lessons;


        public DayViewHolder(@NonNull View itemView) {
            super(itemView);

            dayName = itemView.findViewById(R.id.txtDayName);
            address = itemView.findViewById(R.id.txtAddress);
            lessons = itemView.findViewById(R.id.lvLessons);
        }
    }
}
