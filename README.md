# Customizable Numeric Keypad for Android
This is a library that provides a customizable numeric keypad view for Android.

![](https://raw.githubusercontent.com/xojan/CustomNumberPad/master/screenshots/Screenshot_20160116-114934.png)
![](https://raw.githubusercontent.com/xojan/CustomNumberPad/master/screenshots/Screenshot_20160116-115000.png)

in your module build.gradle file:
```
repositories {
    maven {
        url 'https://dl.bintray.com/xojan/maven/'
    }
}

...

dependencies {
    compile 'cat.xojan:numpad:1.0.0'
}
```

in your xml layout:
```
<cat.xojan.numpad.NumPadView
        android:id="@+id/custom_number_pad"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="@color/grey"
        numpad:button0_background="@drawable/button_background"
        numpad:button1_background="@drawable/button_background"
        numpad:button2_background="@drawable/button_background"
        numpad:button3_background="@drawable/button_background"
        numpad:button4_background="@drawable/button_background"
        numpad:button5_background="@drawable/button_background"
        numpad:button6_background="@drawable/button_background"
        numpad:button7_background="@drawable/button_background"
        numpad:button8_background="@drawable/button_background"
        numpad:button9_background="@drawable/button_background"
        numpad:custom_button1_background="@drawable/button_del_background"
        numpad:custom_button2_background="@drawable/button_ok_background"
        numpad:custom_button1_text="DEL"
        numpad:custom_button2_text="OK"
        numpad:textSize="14sp"
        numpad:textBold="false"
        numpad:textColor="@color/dark_grey"
        numpad:fontFamily="sans-serif-light"/>
```

in your activiy or fragment:
```
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
```
