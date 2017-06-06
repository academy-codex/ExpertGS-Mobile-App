package com.expertgs.expertgs.Fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.expertgs.expertgs.R;

/**
 * Created by SIDDHANT CHADHA on 7/12/2016.
 */
public class FragmentTwo extends Fragment {

    public FragmentTwo(){

    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.layout_fragmenttwo,container,false);
    }
}
