package com.andy6804tw.dengueweather.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.andy6804tw.dengueweather.Adapter.TWNewsRecyclerAdapter;
import com.andy6804tw.dengueweather.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TaiwanNewsFragment extends Fragment {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;

    public TaiwanNewsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_taiwan_news, container, false);
        recyclerView =(RecyclerView) view.findViewById(R.id.recycler_view);

        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);

        adapter = new TWNewsRecyclerAdapter(getContext());
        recyclerView.setAdapter(adapter);


        return view;
    }

}
