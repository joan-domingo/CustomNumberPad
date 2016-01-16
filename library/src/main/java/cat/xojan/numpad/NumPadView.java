package cat.xojan.numpad;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
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
    private TextView mCustomButton1;
    private TextView mCustomButton2;
    private Drawable mCustomButton1Background;
    private Drawable mCustomButton2Background;
    private String mCustomButton1Text;
    private String mCustomButton2Text;
    private Drawable mButton1Background;
    private Drawable mButton2Background;
    private Drawable mButton3Background;
    private Drawable mButton4Background;
    private Drawable mButton5Background;
    private Drawable mButton6Background;
    private Drawable mButton7Background;
    private Drawable mButton8Background;
    private Drawable mButton9Background;
    private Drawable mButton0Background;

    public NumPadView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setUpView(context);
        readAttributes(context, attrs);
        updateBackground();
        updateCustomButtonText();
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
        mCustomButton1 = (TextView) view.findViewById(R.id.button_custom1);
        mCustomButton2 = (TextView) view.findViewById(R.id.button_custom2);
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
            mButton1Background = a.getDrawable(R.styleable.NumPadView_button1_background);
            mButton2Background = a.getDrawable(R.styleable.NumPadView_button2_background);
            mButton3Background = a.getDrawable(R.styleable.NumPadView_button3_background);
            mButton4Background = a.getDrawable(R.styleable.NumPadView_button4_background);
            mButton5Background = a.getDrawable(R.styleable.NumPadView_button5_background);
            mButton6Background = a.getDrawable(R.styleable.NumPadView_button6_background);
            mButton7Background = a.getDrawable(R.styleable.NumPadView_button7_background);
            mButton8Background = a.getDrawable(R.styleable.NumPadView_button8_background);
            mButton9Background = a.getDrawable(R.styleable.NumPadView_button9_background);
            mButton0Background = a.getDrawable(R.styleable.NumPadView_button0_background);

            mCustomButton1Background =
                    a.getDrawable(R.styleable.NumPadView_custom_button1_background);
            mCustomButton2Background =
                    a.getDrawable(R.styleable.NumPadView_custom_button2_background);
            mCustomButton1Text =
                    a.getString(R.styleable.NumPadView_custom_button1_text);
            mCustomButton2Text =
                    a.getString(R.styleable.NumPadView_custom_button2_text);
        } finally {
            a.recycle();
        }
    }

    private void updateBackground() {
        mButton0.setBackground(mButton1Background);
        mButton1.setBackground(mButton2Background);
        mButton2.setBackground(mButton3Background);
        mButton3.setBackground(mButton4Background);
        mButton4.setBackground(mButton5Background);
        mButton5.setBackground(mButton6Background);
        mButton6.setBackground(mButton7Background);
        mButton7.setBackground(mButton8Background);
        mButton8.setBackground(mButton9Background);
        mButton9.setBackground(mButton0Background);
        mCustomButton1.setBackground(mCustomButton1Background);
        mCustomButton2.setBackground(mCustomButton2Background);
    }

    private void updateCustomButtonText() {
        mCustomButton1.setText(mCustomButton1Text);
        mCustomButton2.setText(mCustomButton2Text);
    }
}
