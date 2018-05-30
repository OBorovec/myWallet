package com.mywallet.view.mainFragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mywallet.R;

/**
 * Created by oborovec on 08/03/2018.
 */

public class InProgressFragment extends Fragment {

    private TextView textView;
    private String text;
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View fragmentView =  inflater.inflate(R.layout.fragment_inprogress, container, false);
        this.textView = fragmentView.findViewById(R.id.fragment_inprogress_text);
        this.textView.setText(this.text);
        return fragmentView;
    }
}
