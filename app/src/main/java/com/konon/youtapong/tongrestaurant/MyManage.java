package com.konon.youtapong.tongrestaurant;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by youtapong on 19/03/2016.
 */
public class MyManage {
    // Explicit
    private MyOpenHelper myOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase, readSqLiteDatabase;

    public MyManage(Context context){

        //Ctreate&Connected SQLite
        myOpenHelper = new MyOpenHelper(context);
        writeSqLiteDatabase = myOpenHelper.getReadableDatabase();
        readSqLiteDatabase = myOpenHelper.getReadableDatabase();

    }//Constructor

}//Main Class
