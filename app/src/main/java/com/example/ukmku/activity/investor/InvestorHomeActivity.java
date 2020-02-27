package com.example.ukmku.activity.investor;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ukmku.R;
import com.example.ukmku.fragment.owner.OwnerFinanceFragment;
import com.example.ukmku.fragment.investor.InvestorHomeFragment;
import com.example.ukmku.fragment.owner.OwnerTrainingFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class InvestorHomeActivity extends AppCompatActivity {

    private Toolbar tb_InvestorHome;
    private TextView tv_Pelatihan, tv_Keuangan;
    private ImageView iv_Logo;

    private final BottomNavigationView.OnNavigationItemSelectedListener onNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;
            switch (item.getItemId()){
                case R.id.nav_today:
                    iv_Logo.setVisibility(View.VISIBLE);
                    tv_Pelatihan.setVisibility(View.GONE);
                    tv_Keuangan.setVisibility(View.GONE);
                    fragment = new InvestorHomeFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, fragment, fragment.getClass().getSimpleName()).commit();
                    return true;
                case R.id.nav_training:
                    iv_Logo.setVisibility(View.GONE);
                    tv_Pelatihan.setVisibility(View.VISIBLE);
                    tv_Keuangan.setVisibility(View.GONE);
                    fragment = new OwnerTrainingFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, fragment, fragment.getClass().getSimpleName()).commit();
                    return true;
                case R.id.nav_money:
                    iv_Logo.setVisibility(View.GONE);
                    tv_Pelatihan.setVisibility(View.GONE);
                    tv_Keuangan.setVisibility(View.VISIBLE);
                    fragment = new OwnerFinanceFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, fragment, fragment.getClass().getSimpleName()).commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_investor_home);

        tb_InvestorHome = (Toolbar) findViewById(R.id.tb_investor_home);
        tv_Pelatihan = (TextView) findViewById(R.id.tv_pelatihan);
        tv_Keuangan = (TextView) findViewById(R.id.tv_keuangan);
        iv_Logo = (ImageView) findViewById(R.id.iv_logo);

        setSupportActionBar(tb_InvestorHome);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        BottomNavigationView navigationView = findViewById(R.id.nav_bottom_investor);
        navigationView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener);

        if (savedInstanceState == null){
            navigationView.setSelectedItemId(R.id.nav_today);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_investor_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        switch (id){
            case R.id.search:
                return true;
            case R.id.profile:
                return true;
        }

        return onOptionsItemSelected(item);
    }
}
