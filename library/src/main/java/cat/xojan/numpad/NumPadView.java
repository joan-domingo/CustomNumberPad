package cat.xojan.numpad;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

import cat.xojan.numberpad.R;

/**
 * Draw the number pad view.
 */
public class NumPadView extends LinearLayout {

    private View mRootView;

    public NumPadView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setUpView(context);
    }

    public void setNumberPadClickListener(OnNumPadClickListener onNumberPadClickListener) {
        setUpPadButtons(new NumPadClickListener(onNumberPadClickListener));
    }

    private void setUpView(Context context) {
        setOrientation(VERTICAL);
        mRootView = inflate(context, R.layout.view_number_pad, this);
    }

    private void setUpPadButtons(NumPadClickListener numberPadClickListener) {
        (mRootView.findViewById(R.id.button0)).setOnClickListener(numberPadClickListener);
        (mRootView.findViewById(R.id.button1)).setOnClickListener(numberPadClickListener);
        (mRootView.findViewById(R.id.button2)).setOnClickListener(numberPadClickListener);
        (mRootView.findViewById(R.id.button3)).setOnClickListener(numberPadClickListener);
        (mRootView.findViewById(R.id.button4)).setOnClickListener(numberPadClickListener);
        (mRootView.findViewById(R.id.button5)).setOnClickListener(numberPadClickListener);
        (mRootView.findViewById(R.id.button6)).setOnClickListener(numberPadClickListener);
        (mRootView.findViewById(R.id.button7)).setOnClickListener(numberPadClickListener);
        (mRootView.findViewById(R.id.button8)).setOnClickListener(numberPadClickListener);
        (mRootView.findViewById(R.id.button9)).setOnClickListener(numberPadClickListener);
        (mRootView.findViewById(R.id.button_custom1)).setOnClickListener(numberPadClickListener);
        (mRootView.findViewById(R.id.button_custom2)).setOnClickListener(numberPadClickListener);
    }
}
