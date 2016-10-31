package ssru.satien_janpla.my_shop;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Pc on 27/10/2559.
 */

public class MyOpenHelper extends SQLiteOpenHelper{
    //Explicit
    public static final String database_name = "MyShop.db";
    private static final int database_version = 1;

    private static final String create_user_table = "create table userTABLE (" +
            "_id integer primary key, " +
            "Name text, " +
            "Surname text, " +
            "User text, " +
            "Password text," +
            "Address text, " +
            "Phone text);";
    public MyOpenHelper (Context context){
        super(context, database_name, null, database_version);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(create_user_table);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}   //Main Class
