package com.example.books;

import android.graphics.Bitmap;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.room.Dao;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class Description extends Fragment {
    TextView Name;
    TextView Writer;
    TextView Review;
    TextView page;
    ImageView Book_image;
    TextView Description;
    FloatingActionButton fav_but;
    Dataroombase r;
    Bundle bundle;
    public Description() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_descrption, container, false);
        r=Dataroombase.getInstance(view.getContext());
        Name=view.findViewById(R.id.name1);
        Writer=view.findViewById(R.id.Writer1);
        Review=view.findViewById(R.id.review1);
        page=view.findViewById(R.id.page1);
        Book_image=view.findViewById(R.id.image1);
        Description=view.findViewById(R.id.desc);
        fav_but=view.findViewById(R.id.butoon);
        bundle  =getArguments();
        Name.setText(bundle.getString("name"));
        Writer.setText(bundle.getString("writer"));
        Review.setText(bundle.getString("review"));
        page.setText(bundle.getString("page"));
        Description.setText(bundle.getString("description"));
        Bitmap bmp =  bundle.getParcelable("Image");
        Book_image.setImageBitmap(bmp);
        fav_but.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                r.dataDAO().deletitem(bundle.getInt("id"));

            }
        });
        return view;
    }
}
