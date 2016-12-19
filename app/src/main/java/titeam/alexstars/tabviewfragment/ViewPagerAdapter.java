package titeam.alexstars.tabviewfragment;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import titeam.alexstars.R;

/**
 * Created by ITI on 12/19/2016.
 */


//this to make page menu swipe between views

public class  ViewPagerAdapter extends PagerAdapter
{
    private  LayoutInflater layoutInflater;
   // private  List<News> newsList;
   public ViewPagerAdapter(LayoutInflater layoutInflater ) {

       //this commented hdaer to send array to page adaptour
//    public ViewPagerAdapter(LayoutInflater layoutInflater ,List<News> newsList) {


        this.layoutInflater = layoutInflater;
        //this.newsList = newsList;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        // TODO Auto-generated method stub

        //LayoutInflater inflater = context.getLayoutInflater();

        View viewItem = layoutInflater.inflate(R.layout.new_content_layout, null);
        TextView news = (TextView) viewItem.findViewById(R.id.newsDescrption);
        if (position%2 == 0) {
            news.setText(R.string.firstString);
        }
        else
        {
            news.setText(R.string.secoundString);
        }
        container.addView(viewItem);

        return viewItem;
    }

    @Override
    public int getCount() {
        return 50;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((View)object);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return position+"";
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        // TODO Auto-generated method stub
         container.removeView((View) object);
    }
}

// this for make page menu swipe between frgment not views


//public class ViewPagerAdapter extends FragmentPagerAdapter {
//    private final List<Fragment> mFragmentList = new ArrayList<>();
//    private final List<String> mFragmentTitleList = new ArrayList<>();
//    public ViewPagerAdapter(FragmentManager fm) {
//        super(fm);
//    }
//
//    @Override
//    public Fragment getItem(int position) {
//        if(position%2==0)
//        {
//            return new music();
//        }
//        else
//        {
//            return new movie();
//        }
//        //return new movie();
//    }
//
//    @Override
//    public int getCount() {
//        return 50;
//    }
//    public void addFragment(Fragment fragment, String title) {
//        mFragmentList.add(fragment);
//        mFragmentTitleList.add(title);
//    }
//
//    @Override
//    public CharSequence getPageTitle(int position) {
//        return position+"";
//    }
//}
