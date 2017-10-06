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

public class Fragment2 extends Fragment {

    private LinearLayout mLayout;
    private String mMessage;
    private TextView mTextView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mLayout = (LinearLayout) inflater.inflate(R.layout.fragment_fragment2, container, false);
        //relaciona la clase con el xml fragment target
        // en este caso se relaciona la clase Fragment2 con el xml fragment_fragment2

        mTextView = (TextView) mLayout.findViewById(R.id.txt_message);

        if (getArguments() != null){
            //se revisa si el fragment a sido levantado con arguments - REVISAR MAIN ACTIVITY!!
            mMessage = getArguments().getString("parametro2");
            //se obtiene el mensaje contenido dento del key "parametro2" - REVISAR MAIN ACTIVITY!!
            mTextView.setText(mMessage);
        }

        return mLayout;
    }
}
