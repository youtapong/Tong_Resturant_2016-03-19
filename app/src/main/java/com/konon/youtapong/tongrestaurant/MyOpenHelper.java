package com.konon.youtapong.tongrestaurant;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by youtapong on 19/03/2016.
 */
public class MyOpenHelper extends SQLiteOpenHelper{
    //Explicit
    public static final String database_name ="Restaurant.db";
    private static final int database_version = 1;
    private static final String create_user_table = "create table userTABLE(" +
            "_id interger primary key," +
            "User text," +
            "Password text," +
            "Name text);";
    private static final String creat_food_table = "create table foodTable(" +
            "_id interger primary key," +
            "Food text," +
            "Price text," +
            "Source text);";

    public MyOpenHelper(Context context){
        super(context, database_name, null, database_version);

    }//Constructor


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(create_user_table);
        sqLiteDatabase.execSQL(creat_food_table);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}//Main Class
