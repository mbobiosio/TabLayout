package com.mbobiosio.navigationdrawerwithtablayout.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mbobiosio.navigationdrawerwithtablayout.R;

/**
 * Created by Mbuodile Obiosio Jul 10, 2018
 */

public class TabTwo extends Fragment {

    public TabTwo() {
        // Required empty public constructor
    }


    public static TabTwo newInstance(String param1, String param2) {
        TabTwo fragment = new TabTwo();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tab_two, container, false);
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

}
