package com.example.books;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface RoomDao {
    @Insert
     void insert(room rom);
    @Query("DELETE FROM book_dp WHERE id = :itemid ")
    void deletitem(int itemid);
    @Query("SELECT * FROM book_dp")
     List <room> getalldata();
}
