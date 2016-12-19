package titeam.alexstars.sidemenu;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import titeam.alexstars.R;

/**
 * Created by ITI on 12/10/2016.
 */

public class testFragment extends Fragment {

    public testFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.test_layout, container, false);
    }
}
