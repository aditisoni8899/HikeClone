package com.example.android.clonechallangeudacity.Data;

import android.app.Activity;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.clonechallangeudacity.R;

import java.util.ArrayList;

/**
 * Created by DELL STORE on 4/2/2018.
 */

public class ChatAdapter extends ArrayAdapter<ChatPerson> {

        Typeface typeface;
        Typeface typeface1;

public ChatAdapter(Activity context, ArrayList<ChatPerson> chats) {

        super(context, 0,chats);

        }




@NonNull
@Override
public View getView(int position, View convertView, ViewGroup parent) {


        View listItemView = convertView;
        if(listItemView == null) {
        listItemView = LayoutInflater.from(getContext()).inflate(
        R.layout.list_item, parent, false);
        }

        typeface =  Typeface.createFromAsset(getContext().getAssets(),"font/blond.ttf");
        typeface1 =  Typeface.createFromAsset(getContext().getAssets(),"font/medium.ttf");
        ChatPerson currentWord = getItem(position);



        TextView tvName = (TextView) listItemView.findViewById(R.id.name);
        tvName.setTypeface(typeface1);
        tvName.setText(currentWord.getmName());


        TextView tvchatline = (TextView) listItemView.findViewById(R.id.chatline);
        tvchatline.setTypeface(typeface);
        tvchatline.setText(currentWord.getMchatline());


        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        imageView.setImageResource(currentWord.getImageResourceId());

        TextView tvdate = (TextView) listItemView.findViewById(R.id.date);
        tvdate.setTypeface(typeface);
        tvdate.setText(currentWord.getmDate());


        return listItemView;


        }

        }
