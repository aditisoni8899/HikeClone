package com.example.android.clonechallangeudacity.Fragment;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.clonechallangeudacity.R;

/**
 * Created by DELL STORE on 4/2/2018.
 */

public class MeFragment extends Fragment {

    Typeface typeface;
    TextView text;
    TextView text1;
    TextView text2;
    TextView text3;
    TextView name;
    public static TimeLine newInstance() {
        TimeLine fragment = new TimeLine();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.me_fargment, container, false);
        typeface =  Typeface.createFromAsset(getContext().getAssets(),"font/medium.ttf");
        text = (TextView) rootView.findViewById(R.id.text_verb1);
        text.setTypeface(typeface);
        text1 = (TextView) rootView.findViewById(R.id.text_verb2);
        text1.setTypeface(typeface);
        text2 = (TextView) rootView.findViewById(R.id.text_verb3);
        text2.setTypeface(typeface);
        text3 = (TextView) rootView.findViewById(R.id.text_verb4);
        text3.setTypeface(typeface);
        name = (TextView) rootView.findViewById(R.id.name);
        name.setTypeface(typeface);
        setHasOptionsMenu(true);
        return rootView;
    }


    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        menu.clear();
        inflater.inflate(R.menu.me_fragment_menu, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }
}
