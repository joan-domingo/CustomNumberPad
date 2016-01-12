package cat.xojan.numpadsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import cat.xojan.numpad.NumPadButton;
import cat.xojan.numpad.NumPadView;
import cat.xojan.numpad.OnNumPadClickListener;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NumPadView customNumberPad = (NumPadView) findViewById(R.id.custom_number_pad);
        customNumberPad.setNumberPadClickListener(new OnNumPadClickListener() {
            @Override
            public void onPadClicked(NumPadButton button) {
                Log.v(TAG, button.name());
            }
        });
    }
}
