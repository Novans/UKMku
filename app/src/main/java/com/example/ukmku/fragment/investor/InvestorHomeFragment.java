package com.example.ukmku.fragment.investor;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ukmku.R;
import com.example.ukmku.adapter.NewsAdapter;
import com.example.ukmku.api.ApiClient;
import com.example.ukmku.api.MyApi;
import com.example.ukmku.model.News;
import com.example.ukmku.response.NewsResponse;
import com.example.ukmku.utils.AppPreference;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class InvestorHomeFragment extends Fragment {

    private RecyclerView rvNews;
    private MyApi myApi;
    private AppPreference appPreference;

    public InvestorHomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_investor_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvNews = view.findViewById(R.id.rv_news);

        myApi = ApiClient.getClient().create(MyApi.class);

        String token = appPreference.getToken();
        Call<NewsResponse> allNewsCall = myApi.getAllNews("Bearer " + token);

        allNewsCall.enqueue(new Callback<NewsResponse>() {
            @Override
            public void onResponse(Call<NewsResponse> call, Response<NewsResponse> response) {
                if (response.isSuccessful()){
                    ArrayList<News> news = new ArrayList<>();

                    for (News news1:response.body().getData()){
                        news.add(news1);
                    }

                    rvNews.setAdapter(new NewsAdapter(news, getContext()));
                    rvNews.setLayoutManager(new LinearLayoutManager(getContext()));
                    rvNews.getAdapter().notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<NewsResponse> call, Throwable t) {

            }
        });
    }

}
