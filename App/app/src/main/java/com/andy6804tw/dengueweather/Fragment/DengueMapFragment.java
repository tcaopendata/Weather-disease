package com.andy6804tw.dengueweather.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.andy6804tw.dengueweather.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DengueMapFragment extends Fragment {


    public DengueMapFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_dengue_map, container, false);
        return view;
    }

}
