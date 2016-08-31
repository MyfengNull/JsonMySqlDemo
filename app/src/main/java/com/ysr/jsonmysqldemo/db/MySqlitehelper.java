package com.ysr.jsonmysqldemo.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Administrator on 2016/8/22.
 */
public class MySqlitehelper extends SQLiteOpenHelper {
    private static final String DATABASENAME = "mynews.db";
    public static final String Table_Name = "NewsTable";
    private static int version = 1;

    public MySqlitehelper(Context context) {
        super(context, DATABASENAME, null, version);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
/**
 * 创建表
 */
            sqLiteDatabase.execSQL( "create table "
                    + Table_Name + "(_id integer primary key autoincrement,ctype varchar,title varchar," +
                    "source varchar,source_type varchar,type varchar," +
                    "detail_a varchar,url varchar,data_id varchar)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }



}
