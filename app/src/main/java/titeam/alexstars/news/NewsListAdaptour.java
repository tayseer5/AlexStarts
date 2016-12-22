package titeam.alexstars.news;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import titeam.alexstars.R;
import titeam.alexstars.intefraces.recycleViewClickListnerInterface;


/**
 * Created by bassemabbas on 12/18/16.
 */

public class NewsListAdaptour extends RecyclerView.Adapter<NewsListAdaptour.MyViewHolder> {

    private List<NewsAdaptour> categouryAdaptourList;
    private int lastPosition = -1;
    private Context context;
    private recycleViewClickListnerInterface parentView;

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.category_list_raw, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        NewsAdaptour newsItem = categouryAdaptourList.get(position);
        holder.title.setText(newsItem.getTitle());
        holder.image.setImageResource(newsItem.getNewsimage());
        // Here you apply the animation when the view is bound
       // setAnimation(holder.container, position);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("title",categouryAdaptourList.get(position).getTitle());
                parentView.moveToDetails(position);

            }
        });
//        holder.genre.setText(movie.getGenre());
//        holder.year.setText(movie.getYear());
    }

    @Override
    public int getItemCount() {
        Log.e("catlist2",this.categouryAdaptourList.size()+"");
        return categouryAdaptourList.size();
    }

    public class MyViewHolder extends  RecyclerView.ViewHolder{
        public ImageView image;
        private TextView title;
        private LinearLayout container;
        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.newsTitle);
            image = (ImageView) view.findViewById(R.id.newsImage);
            container = (LinearLayout) view.findViewById(R.id.container);
        }

    }
    public NewsListAdaptour(List<NewsAdaptour> categouryAdaptourList, Context context, recycleViewClickListnerInterface parentView) {
        this.categouryAdaptourList = categouryAdaptourList;
        this.context = context;
        this.parentView = parentView;
        Log.e("catlist",this.categouryAdaptourList.size()+"");
    }

//    private void setAnimation(View viewToAnimate, int position)
//    {
//        // If the bound view wasn't previously displayed on screen, it's animated
////        if (position > lastPosition)
////        {
//        YoYo.with(Techniques.FadeInUp)
//                .duration(1000)
//                .playOn(viewToAnimate);
////            Animation animation = AnimationUtils.loadAnimation(context, android.R.anim.slide_out_right);
////            viewToAnimate.startAnimation(animation);
//            lastPosition = position;
//        //}
//    }

}
