package com.konon.youtapong.tongrestaurant;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by youtapong on 19/03/2016.
 */
public class MyManage {
    // Explicit
    private MyOpenHelper myOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase, readSqLiteDatabase;

    public static final String user_table = "userTable";
    public static final String column_id= "";
    public static final String column_User= "User";
    public static final String column_Password= "Password";
    public static final String column_Name= "Name";

    public static final String food_table = "foodTable";
    public static final String column_Food= "Food";
    public static final String column_Price= "Price";
    public static final String column_Source= "Source";

    public MyManage(Context context){

        //Ctreate&Connected SQLite
        myOpenHelper = new MyOpenHelper(context);
        writeSqLiteDatabase = myOpenHelper.getReadableDatabase();
        readSqLiteDatabase = myOpenHelper.getReadableDatabase();

    }//Constructor

    public long addValue(int intTable,
                         String strColumn2,
                         String strColumn3,
                         String strColumn4) {
        ContentValues contentValues = new ContentValues();
        long mylong = 0;

        switch (intTable) {
            case 1:
                // For userTable
                contentValues.put(column_User, strColumn2);
                contentValues.put(column_Password, strColumn3);
                contentValues.put(column_Name, strColumn4);

                mylong = writeSqLiteDatabase.insert(user_table, null, contentValues);
                break;
            case 2:
                //For Food Table
                contentValues.put(column_Food, strColumn2);
                contentValues.put(column_Price, strColumn3);
                contentValues.put(column_Source, strColumn4);

                mylong = writeSqLiteDatabase.insert(food_table, null, contentValues);

                break;
        }
      return 0;
    }


}//Main Class
