package cat.xojan.numpad;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Draw the number pad view.
 */
public class NumPadView extends LinearLayout {

    private static final String DEFAULT_FONT_FAMILY = "sans-serif";
    private static final int DEFAULT_TYPEFACE = Typeface.NORMAL;

    private TextView mButton0, mButton1, mButton2, mButton3, mButton4, mButton5, mButton6,
            mButton7, mButton8, mButton9;
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
    private float mTextSize;
    private int mTextColor;
    private boolean mTextBold;
    private String mFontFamily;

    public NumPadView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setUpView(context);
        readAttributes(context, attrs);
        updateBackground();
        updateCustomButtonText();
        updateTextSize();
        updateTextColor();
        updateFontFamily();
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
            mTextSize = a.getDimension(R.styleable.NumPadView_textSize, 24);
            mTextColor = a.getColor(R.styleable.NumPadView_textColor,
                    getResources().getColor(R.color.grey));
            mTextBold = a.getBoolean(R.styleable.NumPadView_textBold, false);
            mFontFamily = a.getString(R.styleable.NumPadView_fontFamily);

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
        mButton0.setBackground(mButton0Background);
        mButton1.setBackground(mButton1Background);
        mButton2.setBackground(mButton2Background);
        mButton3.setBackground(mButton3Background);
        mButton4.setBackground(mButton4Background);
        mButton5.setBackground(mButton5Background);
        mButton6.setBackground(mButton6Background);
        mButton7.setBackground(mButton7Background);
        mButton8.setBackground(mButton8Background);
        mButton9.setBackground(mButton9Background);
        mCustomButton1.setBackground(mCustomButton1Background);
        mCustomButton2.setBackground(mCustomButton2Background);
    }

    private void updateCustomButtonText() {
        mCustomButton1.setText(mCustomButton1Text);
        mCustomButton2.setText(mCustomButton2Text);
    }

    private void updateTextSize() {
        mButton0.setTextSize(mTextSize);
        mButton1.setTextSize(mTextSize);
        mButton2.setTextSize(mTextSize);
        mButton3.setTextSize(mTextSize);
        mButton4.setTextSize(mTextSize);
        mButton5.setTextSize(mTextSize);
        mButton6.setTextSize(mTextSize);
        mButton7.setTextSize(mTextSize);
        mButton8.setTextSize(mTextSize);
        mButton9.setTextSize(mTextSize);
        mCustomButton1.setTextSize(mTextSize);
        mCustomButton2.setTextSize(mTextSize);
    }
    private void updateTextColor() {
        mButton0.setTextColor(mTextColor);
        mButton1.setTextColor(mTextColor);
        mButton2.setTextColor(mTextColor);
        mButton3.setTextColor(mTextColor);
        mButton4.setTextColor(mTextColor);
        mButton5.setTextColor(mTextColor);
        mButton6.setTextColor(mTextColor);
        mButton7.setTextColor(mTextColor);
        mButton8.setTextColor(mTextColor);
        mButton9.setTextColor(mTextColor);
        mCustomButton1.setTextColor(mTextColor);
        mCustomButton2.setTextColor(mTextColor);
    }

    private void updateFontFamily() {
        String fontFamily = mFontFamily != null ? mFontFamily : DEFAULT_FONT_FAMILY;
        int typeface = mTextBold ? Typeface.BOLD : DEFAULT_TYPEFACE;
        Typeface fontStyle = Typeface.create(fontFamily, typeface);
        mButton0.setTypeface(fontStyle);
        mButton1.setTypeface(fontStyle);
        mButton2.setTypeface(fontStyle);
        mButton3.setTypeface(fontStyle);
        mButton4.setTypeface(fontStyle);
        mButton5.setTypeface(fontStyle);
        mButton6.setTypeface(fontStyle);
        mButton7.setTypeface(fontStyle);
        mButton8.setTypeface(fontStyle);
        mButton9.setTypeface(fontStyle);
        mCustomButton1.setTypeface(fontStyle);
        mCustomButton2.setTypeface(fontStyle);
    }
}
