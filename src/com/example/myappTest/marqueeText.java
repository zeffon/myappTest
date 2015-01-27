package com.example.myappTest;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by phoony on 2015/1/27.
 */
public class marqueeText extends TextView{
    public marqueeText(Context context) {
        super(context);
    }

    public marqueeText(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public marqueeText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public boolean isFocused(){
        return true;
    }
}
