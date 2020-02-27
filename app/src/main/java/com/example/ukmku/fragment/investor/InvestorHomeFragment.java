package com.example.ukmku.fragment.investor;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ukmku.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class InvestorHomeFragment extends Fragment {


    public InvestorHomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_investor_home, container, false);
    }

}
