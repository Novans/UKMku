package com.example.ukmku.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ukmku.R;
import com.example.ukmku.activity.general.NewsActivity;
import com.example.ukmku.model.News;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {

    private ArrayList<News> newsArrayList;
    private Context context;

    public NewsAdapter(ArrayList<News> newsArrayList, Context context) {
        this.newsArrayList = newsArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public NewsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_today, parent, false);
        final ViewHolder holder =new ViewHolder(v);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, NewsActivity.class);
                intent.putExtra("post", newsArrayList.get(holder.getAdapterPosition()));
                context.startActivity(intent);
            }
        });
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull NewsAdapter.ViewHolder holder, int position) {
        News news = newsArrayList.get(position);
        String URL = news.getImage_url().toString();
        Picasso.get().load(URL).into(holder.ivCover);
        holder.tvContent.setText(news.getBody().getWholeText());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView ivCover;
        private TextView tvContent;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivCover = itemView.findViewById(R.id.iv_cover);
            tvContent = itemView.findViewById(R.id.tv_news_content);
        }
    }
}
