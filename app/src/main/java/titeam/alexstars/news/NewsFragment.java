package titeam.alexstars.news;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import titeam.alexstars.R;
import titeam.alexstars.intefraces.recycleViewClickListnerInterface;


/**
 * A simple {@link Fragment} subclass.
 */
public class NewsFragment extends Fragment implements recycleViewClickListnerInterface {
    private List<NewsAdaptour> newsList = new ArrayList<>();
    private RecyclerView recyclerView;
    private NewsListAdaptour newslistAdaptour;
    private RecyclerView.LayoutManager mLayoutManager;
    private int index;


    public NewsFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        int index = getArguments().getInt("index");
        if (index != 0)
        {
            this.index = index;
        }

        View rootView = inflater.inflate(R.layout.fragment_category, container, false);
        //rootView.setTag(TAG);

        recyclerView = (RecyclerView) rootView.findViewById(R.id.categoryRecyclerView);

        // LinearLayoutManager is used here, this will layout the elements in a similar fashion
        // to the way ListView would layout elements. The RecyclerView.LayoutManager defines how
        // elements are laid out.

        //mLayoutManager = new LinearLayoutManager(getActivity());

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        Log.e("h",mLayoutManager.canScrollHorizontally()+"");
        Log.e("v",mLayoutManager.canScrollVertically()+"");

        recyclerView.setLayoutManager(mLayoutManager);
       // recyclerView.setItemAnimator(new DefaultItemAnimator());
        //mCurrentLayoutManagerType = LayoutManagerType.LINEAR_LAYOUT_MANAGER;

//        if (savedInstanceState != null) {
//            // Restore saved layout manager type.
//            mCurrentLayoutManagerType = (LayoutManagerType) savedInstanceState
//                    .getSerializable(KEY_LAYOUT_MANAGER);
//        }
        //setRecyclerViewLayoutManager(mCurrentLayoutManagerType);
        preparecatgroyData();
        newslistAdaptour = new NewsListAdaptour(newsList,getContext(),this);

        // Set CustomAdapter as the adapter for RecyclerView.
        recyclerView.setAdapter(newslistAdaptour);
        recyclerView.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {
            @Override
            public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
                View child = rv.findChildViewUnder(e.getX(), e.getY());
                Log.e("position",rv.getChildPosition(child)+"");

                return false;
            }

            @Override
            public void onTouchEvent(RecyclerView rv, MotionEvent e) {

            }

            @Override
            public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

            }
        });
       // recyclerView.setAdapter(new AlphaInAnimationAdapter(categourylistAdaptour));
        //recyclerView.setAdapter(categourylistAdaptour);

//        mLinearLayoutRadioButton = (RadioButton) rootView.findViewById(R.id.linear_layout_rb);
//        mLinearLayoutRadioButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                setRecyclerViewLayoutManager(LayoutManagerType.LINEAR_LAYOUT_MANAGER);
//            }
//        });
//
//        mGridLayoutRadioButton = (RadioButton) rootView.findViewById(R.id.grid_layout_rb);
//        mGridLayoutRadioButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                setRecyclerViewLayoutManager(LayoutManagerType.GRID_LAYOUT_MANAGER);
//            }
//        });

        return rootView;
    }

    private void preparecatgroyData() {
        NewsAdaptour news1 = new NewsAdaptour(R.drawable.ic_menu_share,"news 1"+index,"descrption");
        newsList.add(news1);
        news1 = new NewsAdaptour(R.drawable.ic_menu_share,"news 2"+index,"descrption 1");
        newsList.add(news1);
        news1 = new NewsAdaptour(R.drawable.ic_menu_share,"news 3"+index,"descrption 2");
        newsList.add(news1);
        news1 = new NewsAdaptour(R.drawable.ic_menu_share,"news 4"+index,"descrption 3");
        newsList.add(news1);
        news1 = new NewsAdaptour(R.drawable.ic_menu_share,"news 5"+index,"descrption 4");
        newsList.add(news1);
        news1 = new NewsAdaptour(R.drawable.ic_menu_share,"news 6 "+index,"descrption 5");
        newsList.add(news1);

    }
     public void test (){

//         FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
//         //if (index == 0) {
//         getActivity().getSupportFragmentManager()
//                 .beginTransaction()
//                 .replace(R.id.categorylayout, new Product(), "productFragment")
//                 .addToBackStack(null)
//                 .commit();

}

    @Override
    public void moveToDetails(int postion)
    {
        Log.e("postion of raw list",postion+"");
        Log.e("postion of tab view",index+"");
    }

//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_category, container, false);
//    }

}
