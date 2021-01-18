package com.example.books;

import android.view.View;

import java.util.List;

public class BooksPresenter {
    BooksModel booksModel;

    public BooksPresenter(Booksview view) {
        booksModel =new BooksModel(view);
    }
    public List<room> getRooms(){
        return booksModel.getRooms();
    }
}
