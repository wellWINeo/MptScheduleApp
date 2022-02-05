package com.github.wellwineo.mpt_schedule;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

public class LessonListView extends ListView {

    public LessonListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public LessonListView(Context context) {
        super(context);
    }

    public LessonListView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,
                MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandSpec);
    }

}
