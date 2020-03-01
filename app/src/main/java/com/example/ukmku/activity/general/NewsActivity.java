package com.example.ukmku.activity.general;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ukmku.R;
import com.example.ukmku.activity.investor.InvestorHomeActivity;
import com.example.ukmku.api.ApiClient;
import com.example.ukmku.api.MyApi;
import com.example.ukmku.model.News;
import com.example.ukmku.utils.AppPreference;
import com.squareup.picasso.Picasso;

public class NewsActivity extends AppCompatActivity implements View.OnClickListener {

    private News news;
    private ImageButton img_back;
    private ImageView img_cover;
    private TextView tv_newsContent;
    private MyApi myApi;
    private AppPreference appPreference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        news = getIntent().getParcelableExtra("news");

        myApi = ApiClient.getClient().create(MyApi.class);
        appPreference = new AppPreference(this);

        img_back = (ImageButton) findViewById(R.id.ib_back2);
        img_cover = findViewById(R.id.iv_cover);
        tv_newsContent = findViewById(R.id.tv_news_content);

        String URL = news.getImage_url().toString();
        Picasso.get().load(URL).into(img_cover);
        tv_newsContent.setText(news.getBody().getWholeText());

        img_cover.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.ib_back2){
            Intent intent_back = new Intent(NewsActivity.this, InvestorHomeActivity.class);
            startActivity(intent_back);
            finish();
        }
    }
}
