package com.example.android.clonechallangeudacity.Data;

/**
 * Created by DELL STORE on 4/2/2018.
 */

public class ChatPerson {

    private String mName;

    private String mchatline;

    private int mImageResourceId ;

    private String mDate;



    public ChatPerson(String name, String chatline, int imageResourceId,String date) {
        mName = name;
        mchatline = chatline;
        mImageResourceId = imageResourceId;
        mDate = date;
    }


    public String getmName() {
        return mName;
    }

    public String getMchatline() {
        return mchatline;
    }

    public int  getImageResourceId(){
        return mImageResourceId; }



    public String getmDate(){return mDate;}
}
