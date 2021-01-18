package com.example.books;

import android.content.Context;
import android.view.View;

import java.util.List;

public class BooksModel {
  private   Dataroombase dr;
    private  List<room> rooms;
    private   String []name={"Support","Laws","Science","Movies","DSMMSDD","hgvbggggggg"};
    private   String []desc={"sahhsshshsshhsshshshhshshshhshshshhshshshshhshshshshshhshshshshhshshshshhshshshshhshshshshsh",
            "Many corporations have slick, flashy mission statements that ultimately do little to motivate employees and less to impress customers, investors, and partners.But there is a way to share your excitement for the future of your company in a clear, compelling, and powerful way and entrepreneur and business growth expert Cameron Herold can show you how.",
            "Vivid Vision is a revolutionary tool that will help owners, CEOs, and senior managers create inspirational, detailed, and actionable three-year mission statements for their companies. In this easy-to-follow guide, Herold walks organization leaders through the simple steps to creating their own Vivid Vision, from brainstorming to sharing the ideas to using the document to drive progress in the years to come.",
            "By focusing on mapping out how you see your company looking and feeling in every category of business, without getting bogged down by data and numbers, Vivid Vision creates a holistic road map to success that will get all of your teammates passionate about the big picture.",
            "Your company is your dream, one that you want to share with your staff, clients, and stakeholders. Vivid Vision is the tool you need to make that dream a reality.",
            "dsvgvsdvhvsdjhvjvsdvdsajhgavdjhgjhbsjkabjhdhjsdbvghvuwhisdhvsdygucsjbsdhgvcygvsdyuhbasjkbcjhvsjhdbvjcshjcvsdjhcbsjkadbgvsdykjhukdsghjsdgsvyuajkcbsdjhvyjhsakjbcghsdvjaukdjchsdhbvegsudyjghcsugebsdjhcbjhvsdjhh"};
    private String []Writer={"Ahmed","Abdo","Mohamed","Nada","Salah","Nour"};
    private  int [] image={R.drawable.download,R.drawable.book1,R.drawable.book2,R.drawable.book3,R.drawable.book4,R.drawable.book5};
    private  int []page={400,500,200,100,6000,2020};
    private  int []review={1,3,2,0,5,6};

    public BooksModel(Booksview view) {
        SetBookData(view);
    }
    void SetBookData(Booksview view) {
        dr = Dataroombase.getInstance(view.getContext());
        room rom = new room();
        rooms = dr.dataDAO().getalldata();
        if (rooms.size() == 0) {
            for (int i = 0; i < 6; i++) {
                rom.setName(name[i]);
                rom.setPage(page[i]);
                rom.setWriter(Writer[i]);
                rom.setReviews(review[i]);
                rom.setDescription(desc[i]);
                rom.setImages(image[i]);
                dr.dataDAO().insert(rom);
            }
            rooms = dr.dataDAO().getalldata();
        }
    }
      public List<room> getRooms(){
        return rooms;
    }

}
