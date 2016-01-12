package cat.xojan.numpad;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import cat.xojan.numberpad.R;

/**
 * Draw the number pad view.
 */
public class NumPadView extends LinearLayout {

    private TextView mButton0;
    private TextView mButton1;
    private TextView mButton2;
    private TextView mButton3;
    private TextView mButton4;
    private TextView mButton5;
    private TextView mButton6;
    private TextView mButton7;
    private TextView mButton8;
    private TextView mButton9;
    private RelativeLayout mCustomButton1;
    private RelativeLayout mCustomButton2;
    private Drawable mButtonBackground;
    private Drawable mCustomButton1Background;
    private Drawable mCustomButton2Background;

    public NumPadView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setUpView(context);
        readAttributes(context, attrs);
        updateBackground();
    }

    public void setNumberPadClickListener(OnNumPadClickListener onNumberPadClickListener) {
        setUpPadButtons(new NumPadClickListener(onNumberPadClickListener));
    }

    private void setUpView(Context context) {
        setOrientation(VERTICAL);
        View view = inflate(context, R.layout.view_number_pad, this);
        initButtons(view);
    }

    private void initButtons(View view) {
        mButton0 = (TextView) view.findViewById(R.id.button0);
        mButton1 = (TextView) view.findViewById(R.id.button1);
        mButton2 = (TextView) view.findViewById(R.id.button2);
        mButton3 = (TextView) view.findViewById(R.id.button3);
        mButton4 = (TextView) view.findViewById(R.id.button4);
        mButton5 = (TextView) view.findViewById(R.id.button5);
        mButton6 = (TextView) view.findViewById(R.id.button6);
        mButton7 = (TextView) view.findViewById(R.id.button7);
        mButton8 = (TextView) view.findViewById(R.id.button8);
        mButton9 = (TextView) view.findViewById(R.id.button9);
        mCustomButton1 = (RelativeLayout) view.findViewById(R.id.button_custom1);
        mCustomButton2 = (RelativeLayout) view.findViewById(R.id.button_custom2);
    }

    private void setUpPadButtons(NumPadClickListener numberPadClickListener) {
        mButton0.setOnClickListener(numberPadClickListener);
        mButton1.setOnClickListener(numberPadClickListener);
        mButton2.setOnClickListener(numberPadClickListener);
        mButton3.setOnClickListener(numberPadClickListener);
        mButton4.setOnClickListener(numberPadClickListener);
        mButton5.setOnClickListener(numberPadClickListener);
        mButton6.setOnClickListener(numberPadClickListener);
        mButton7.setOnClickListener(numberPadClickListener);
        mButton8.setOnClickListener(numberPadClickListener);
        mButton9.setOnClickListener(numberPadClickListener);
        mCustomButton1.setOnClickListener(numberPadClickListener);
        mCustomButton2.setOnClickListener(numberPadClickListener);
    }

    private void readAttributes(Context context, AttributeSet attrs) {
        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.NumPadView,
                0, 0);

        try {
            mButtonBackground = a.getDrawable(R.styleable.NumPadView_button_background);
            mCustomButton1Background = a.getDrawable(R.styleable.NumPadView_custom_button1_background);
            mCustomButton2Background = a.getDrawable(R.styleable.NumPadView_custom_button2_background);
        } finally {
            a.recycle();
        }
    }

    private void updateBackground() {
        mButton0.setBackground(mButtonBackground);
        mButton1.setBackground(mButtonBackground);
        mButton2.setBackground(mButtonBackground);
        mButton3.setBackground(mButtonBackground);
        mButton4.setBackground(mButtonBackground);
        mButton5.setBackground(mButtonBackground);
        mButton6.setBackground(mButtonBackground);
        mButton7.setBackground(mButtonBackground);
        mButton8.setBackground(mButtonBackground);
        mButton9.setBackground(mButtonBackground);
        mCustomButton1.setBackground(mCustomButton1Background);
        mCustomButton2.setBackground(mCustomButton2Background);
    }
}
