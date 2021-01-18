package com.example.books;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class mainAdapter extends RecyclerView.Adapter<mainAdapter.MyViewHolder> {
private List<room>notes;
    private Context context;
    Bundle bundle;
    room rom;
    public mainAdapter(List<room> notes, Context context) {
        this.notes = notes;
        this.context = context;
        bundle =new Bundle();
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.book_card,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {
   rom=notes.get(position);
    holder.tv_name.setText(rom.getName());
    holder.tv_writer.setText(rom.getWriter());
    holder.tv_page.setText((String.valueOf(rom.getPage())));
    holder.tv_review.setText(String.valueOf(rom.getReviews()));
    holder.tv_desc.setText(rom.getDescription());
    holder.tv_id.setText(String.valueOf(rom.getId()));
    holder.book_image.setImageResource(rom.getImages());
    holder.itemView.setOnClickListener(new View.OnClickListener(){

        @Override
        public void onClick(View v) {
            bundle.putString("name",holder.tv_name.getText().toString());
            bundle.putInt("id",Integer.parseInt(holder.tv_id.getText().toString()));
            bundle.putString("writer",holder.tv_writer.getText().toString());
            bundle.putString("page",holder.tv_page.getText().toString());
            bundle.putString("review",holder.tv_review.getText().toString());
            bundle.putString("description",holder.tv_desc.getText().toString());
            bundle.putParcelable("Image",((BitmapDrawable)holder.book_image.getDrawable()).getBitmap());
            AppCompatActivity activity=(AppCompatActivity)v.getContext();
            Description description=new Description();
            activity.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
            description.setArguments(bundle);
            activity.getSupportFragmentManager().beginTransaction().replace(R.id.maincontainer,description).addToBackStack(null).commit();
        }
    });
    }

    @Override
    public int getItemCount() {
        return notes.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tv_name, tv_writer, tv_page, tv_review,tv_desc,tv_id;
        CardView book_card;
        ImageView book_image;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_name = itemView.findViewById(R.id.name_book);
            tv_writer = itemView.findViewById(R.id.writer_name);
            tv_page = itemView.findViewById(R.id.page_num);
            tv_review = itemView.findViewById(R.id.review);
            book_card = itemView.findViewById(R.id.card_book);
            book_image = itemView.findViewById(R.id.bookimage);
            tv_desc=itemView.findViewById(R.id.desc1);
            tv_id=itemView.findViewById(R.id.iddd);
        }
    }
}