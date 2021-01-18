package com.example.books;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {room.class},version = 1)
public abstract class Dataroombase extends RoomDatabase {
    private static final String DP_name="Books_dp";
    public static Dataroombase instance;
    public static synchronized Dataroombase getInstance(Context context){
        if(instance==null){
                instance= Room.databaseBuilder(context,Dataroombase.class,DP_name).allowMainThreadQueries().build();
        }
        return instance;
    }
    public abstract RoomDao dataDAO();
}
