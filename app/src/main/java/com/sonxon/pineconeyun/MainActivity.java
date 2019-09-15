package com.sonxon.pineconeyun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.chaquo.python.*;
import com.chaquo.python.android.AndroidPlatform;

import java.lang.reflect.*;
import static com.chaquo.python.PyObject._chaquopyCall;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (! Python.isStarted()) {
            Python.start(new AndroidPlatform(this));
        }
    }

}
