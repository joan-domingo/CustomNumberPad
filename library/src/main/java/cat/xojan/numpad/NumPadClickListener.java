package cat.xojan.numpad;

import android.view.View;

import static cat.xojan.numpad.NumPadButton.*;

/**
 * Number pad click listener.
 */
public class NumPadClickListener implements View.OnClickListener {

    private static OnNumPadClickListener mListener;

    public NumPadClickListener(OnNumPadClickListener listener) {
        mListener = listener;
    }

    /**
     * Reads the clicked button tag and returns its respective {@link NumPadButton}.
     * Throws {@link NumPadListenerException} if listener was not set.
     */
    @Override
    public void onClick(View v) {
        if (mListener == null) {
            throw new NumPadListenerException("Number pad listener is not set");
        }
        mListener.onPadClicked(tagToNumPadButton((String) v.getTag()));
    }

    private NumPadButton tagToNumPadButton(String tag) {
        switch (tag) {
            case "0":
                return NUM_0;
            case "1":
                return NUM_1;
            case "2":
                return NUM_2;
            case "3":
                return NUM_3;
            case "4":
                return NUM_4;
            case "5":
                return NUM_5;
            case "6":
                return NUM_6;
            case "7":
                return NUM_7;
            case "8":
                return NUM_8;
            case "9":
                return NUM_9;
            case "custom1":
                return CUSTOM_BUTTON_1;
            default:
                return CUSTOM_BUTTON_2;
        }
    }
}
