package com.example.customview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/**
 * @author wur
 * @description 可拖动的缩放矩形
 */
public class Draggable_Scaled_Rectangle extends View {
    public Draggable_Scaled_Rectangle(Context context) {
        super(context);
    }

    public Draggable_Scaled_Rectangle(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Draggable_Scaled_Rectangle(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public Draggable_Scaled_Rectangle(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
