package com.example.customview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/**
 * @author wur
 * @description 可拖动的缩放矩形
 */
public class Draggable_Scaled_Rectangle extends View {
    float downX;
    float downY;
    float currentX;
    float currentY;
    boolean isFirst;

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

    void initData(){
        isFirst = true;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                event.getX();
                break;
            case MotionEvent.ACTION_MOVE:
                break;
            case MotionEvent.ACTION_UP:
                break;
                default:
                    break;

        }

        return true;
    }
}
