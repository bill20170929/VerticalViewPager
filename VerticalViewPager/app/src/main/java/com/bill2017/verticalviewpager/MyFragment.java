package com.bill2017.verticalviewpager;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Locale;

public class MyFragment extends Fragment {
    public static MyFragment newInstance(int index) {
        MyFragment fragment = new MyFragment();
        Bundle args = new Bundle();
        args.putInt("index", index);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_layout, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        TextView textView = view.findViewById(R.id.textView);
        Bundle args = this.getArguments();
        if(args != null) {
            textView.setText(String.format(Locale.CHINA, "fragment%d", args.getInt("index")));
        } else {
            textView.setText("fragment");
        }
    }
}
