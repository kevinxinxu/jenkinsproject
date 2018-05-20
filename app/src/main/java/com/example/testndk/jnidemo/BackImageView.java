package com.example.testndk.jnidemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by huan on 18/5/17.
 */
public class BackImageView extends ImageView {

    public BackImageView(Context context, AttributeSet attrs){
        super(context, attrs);
//        AttributeSet attrs =
    }

    public BackImageView(Context context){
        super(context);
    }

    /**
     * 设置boolean值
     * @param isFalse
     */
    public void isFalse(boolean isFalse){
        setBackground(new Drawable() {
            @Override
            public void draw(Canvas canvas) {
//                canvas.drawARGB();
            }

            @Override
            public void setAlpha(int alpha) {

            }

            @Override
            public void setColorFilter(ColorFilter colorFilter) {
                ColorMatrix colorMatrix = new ColorMatrix();

            }

            @Override
            public int getOpacity() {
                return 0;
            }
        });
    }

    /**
     * 设置背景drawable
     * @param drawable
     */
    public void setImageBackground(Drawable drawable){

    }
}
