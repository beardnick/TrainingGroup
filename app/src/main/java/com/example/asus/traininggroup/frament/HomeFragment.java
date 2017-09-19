package com.example.asus.traininggroup.frament;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.asus.traininggroup.R;


public class HomeFragment extends Fragment {
    View view;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.home , container , false);
        return view;
    }

    public void test(){
        LinearLayout llMain = (LinearLayout) view.findViewById(R.id.mainbutton);
        LinearLayout llTeacherShow = (LinearLayout) view.findViewById(R.id.teachershow);
        LinearLayout llBar = (LinearLayout) view.findViewById(R.id.bar);
        TextView tvMain = (TextView) view.findViewById(R.id.tv_main_button);
        TextView tvTeacherShow = (TextView) view.findViewById(R.id.tv_teachershow);
        TextView tvBar = (TextView) view.findViewById(R.id.tv_bar);
        llBar.addView(tvBar);
        llMain.addView(tvMain);
        llTeacherShow.addView(tvTeacherShow);
    }
}
