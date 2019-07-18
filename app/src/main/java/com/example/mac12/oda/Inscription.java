package com.example.mac12.oda;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Inscription extends Fragment {
    View view;
    FloatingActionButton register_next;

    public Inscription() {

    }


    @Nullable
    @Override
    public View onCreateView( LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.inscription,container,false);
        register_next = (FloatingActionButton)view.findViewById(R.id.register_next);






        register_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Main_inscriptionActivity.class);
                startActivity(intent);
            }
        });
        return view;

    }



}
