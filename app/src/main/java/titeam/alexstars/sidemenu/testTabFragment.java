package titeam.alexstars.sidemenu;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import titeam.alexstars.R;
import titeam.alexstars.tabviewfragment.ViewPagerAdapter;
import titeam.alexstars.tabviewfragment.movie;
import titeam.alexstars.tabviewfragment.music;


public class testTabFragment extends Fragment {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    public testTabFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_test_tab, container, false);
        toolbar = (Toolbar) rootView.findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) rootView.findViewById(R.id.viewpager);
        setupViewPager(viewPager,inflater);

        tabLayout = (TabLayout) rootView.findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        setupTabIcons();
        // Inflate the layout for this fragment
        return rootView;
    }

    private void setupTabIcons() {
        for(int i=0; i<50; i++) {
            if (i % 2 == 0) {
                tabLayout.getTabAt(i).setIcon(R.drawable.ic_menu_camera);
            } else {
                tabLayout.getTabAt(i).setIcon(R.drawable.ic_menu_share);
            }
        }
    }
    private void setupViewPager(ViewPager viewPager,LayoutInflater inflater) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(inflater);

        viewPager.setAdapter(adapter);
    }
}
