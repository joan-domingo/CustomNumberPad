[![Platform](https://img.shields.io/badge/Platform-Android-brightgreen.svg?style=flat-square)]()
[ ![Download](https://api.bintray.com/packages/xojan/maven/numpad/images/download.svg?version=1.1.0) ](https://bintray.com/xojan/maven/numpad/1.1.0/link)
[![API](https://img.shields.io/badge/API-14%2B-orange.svg?style=flat-square)]()

# Customizable Numeric Keypad for Android
This is a library that provides a customizable numeric keypad view for Android.

Contributions are welcome.

![](https://raw.githubusercontent.com/xojan/CustomNumberPad/master/screenshots/Screenshot_20160116-114934.png)
![](https://raw.githubusercontent.com/xojan/CustomNumberPad/master/screenshots/Screenshot_20160116-115000.png)


## Download
Include the following repository in your module gradle.build file.

 ```
repositories {
    maven {
        url 'https://dl.bintray.com/xojan/maven/'
    }
}}
 ```
  
And add the gradle dependency.

 ```
dependencies {
    compile 'cat.xojan:numpad:1.1.0'
}
 ```

## Usage

Include NumPadView in your layout XML.

A simple example:
```
<cat.xojan.numpad.NumPadView
        android:id="@+id/custom_number_pad"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        numpad:textColor="@color/dark_grey"/>

```

An example with all the possible options:
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
        numpad:fontFamily="sans-serif-light"
        numpad:verticalSeparatorMargin="12dp"
        numpad:horizontalSeparatorMargin="12dp"/>
```

In the onCreate of your activity or the onCreateView of your fragment, initialize the NumPadView and set OnNumPadClickListener to read the clicked button.
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

## License
Copyright 2016 Joan Domingo Sallent

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
