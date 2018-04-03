package com.example.android.clonechallangeudacity.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.android.clonechallangeudacity.Data.ChatAdapter;
import com.example.android.clonechallangeudacity.Data.ChatPerson;
import com.example.android.clonechallangeudacity.R;

import java.util.ArrayList;

/**
 * Created by DELL STORE on 4/1/2018.
 */

public class TimeLine extends Fragment {


    public static TimeLine newInstance() {
        TimeLine fragment = new TimeLine();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        View rootView = inflater.inflate(R.layout.timeline_frgament, container, false);

        final ArrayList<ChatPerson> chat = new ArrayList<ChatPerson>();
        chat.add(new ChatPerson("Aditi Soni", "Get fit with your friendz", R.drawable.aditi, "Now"));
        chat.add(new ChatPerson("Natasha", "Get fit with your friendz", R.drawable.natasha, "23 mins"));
        chat.add(new ChatPerson("Vishal Sehgal", "Get fit with your friendz", R.drawable.vishal, "40 mins"));
        chat.add(new ChatPerson("Parth Joshi", "Get fit with your friendz", R.drawable.parth, "2 hrs"));
        chat.add(new ChatPerson("Prachi", "Get fit with your friendz", R.drawable.prachi, "6 hrs"));
        chat.add(new ChatPerson("Hike Run(Beta)", "Get fit with your friendz", R.drawable.hike_run, "23 hrs"));
        chat.add(new ChatPerson("Shreya Soni", "Get fit with your friendz", R.drawable.shreya, "yesterday"));
        chat.add(new ChatPerson("Aditya Sharma", "Get fit with your friendz", R.drawable.aditya, "yesterday"));
        chat.add(new ChatPerson("Akshit Jain", "Get fit with your friendz", R.drawable.akshit, "yesterday"));

        ChatAdapter adapter = new ChatAdapter(getActivity(), chat);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
