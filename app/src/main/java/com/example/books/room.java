package com.example.books;

import androidx.annotation.NonNull;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "book_dp")
class room {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    private int id;
    private String name;
    @ColumnInfo(name="Writer")
    private String writer;
    @ColumnInfo(name="Description")
    private String description;
    @ColumnInfo(name="Page")
    private int page;
    @ColumnInfo(name="Reviews")
    private int reviews;
    @ColumnInfo(name="Images")
   private int images;

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getReviews() {
        return reviews;
    }

    public void setReviews(int reviews) {
        this.reviews = reviews;
    }
}
