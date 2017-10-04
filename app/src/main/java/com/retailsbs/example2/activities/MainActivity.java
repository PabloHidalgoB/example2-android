package com.retailsbs.example2.activities;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.retailsbs.example2.R;
import com.retailsbs.example2.fragments.Fragment1;
import com.retailsbs.example2.fragments.Fragment2;
import com.retailsbs.example2.fragments.Fragment3;

public class MainActivity extends AppCompatActivity {

    private Fragment mFragment1;
    private Fragment mFragment2;
    private Fragment mFragment3;

    private final static String MESSASGE1 = "Este es el mensaje final 1";
    private String mMessage2;
    private String mMessage3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMessage2 = "I know what you did last summer";
        mMessage3 = "OH NO!";

        Bundle mBundle = new Bundle();

        mBundle.putString("parametro1", MESSASGE1);
        mFragment1 = new Fragment1();
        mFragment1.setArguments(mBundle);
        FragmentManager mFragmentManager = getSupportFragmentManager();
        FragmentTransaction mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.replace(R.id.frame1, mFragment1).addToBackStack("frame1").commit();

        mBundle = new Bundle();
        mBundle.putString("parametro2", mMessage2);
        mFragment2 = new Fragment2();
        mFragment2.setArguments(mBundle);
        mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.replace(R.id.frame2, mFragment2).addToBackStack("frame2").commit();


        mBundle = new Bundle();
        mBundle.putString("parametro3", mMessage3);
        mFragment3 = new Fragment3();
        mFragment3.setArguments(mBundle);
        mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.replace(R.id.frame3, mFragment3);
        mFragmentTransaction.addToBackStack("frame3");
        mFragmentTransaction.commit();

    }


}
