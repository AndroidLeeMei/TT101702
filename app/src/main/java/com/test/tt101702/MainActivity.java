package com.test.tt101702;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyDBHelper helper = new MyDBHelper(MainActivity.this);
        SQLiteDatabase db = helper.getWritableDatabase();
    }
}
