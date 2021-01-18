package com.example.books;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Booksview extends Fragment {
    RecyclerView recyclerView;
    BooksPresenter presenter;
    public Booksview() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_booksview, container, false);
        recyclerView=view.findViewById(R.id.rec);
        presenter=new BooksPresenter(this);
        recyclerView.setAdapter(new mainAdapter(presenter.getRooms(),view.getContext()));
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        return view;
    }
}
