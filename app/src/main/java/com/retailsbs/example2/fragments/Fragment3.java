package com.retailsbs.example2.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.retailsbs.example2.R;

/**
 * Created by Trabajo on 04-10-2017.
 */

public class Fragment3 extends Fragment {

    private LinearLayout mLayout;
    private String mMessage;
    private TextView mTextView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mLayout = (LinearLayout) inflater.inflate(R.layout.fragment_fragment3, container, false);
        mTextView = (TextView) mLayout.findViewById(R.id.txt_message);

        if (getArguments() != null){
            mMessage = getArguments().getString("parametro3");
            mTextView.setText(mMessage);
        }

        return mLayout;
    }
}
