package com.text.textviewwithimage;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

/**
 * Created by sarath on 24/10/16.
 */

public class FloatTextView extends TextView {
    public FloatTextView(Context context) {
        super(context);
    }

    public FloatTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void addText(String text){

    }

    public void addDivider(View view){

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
