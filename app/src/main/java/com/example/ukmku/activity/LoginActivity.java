package com.example.ukmku.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ukmku.R;
import com.example.ukmku.api.ApiClient;
import com.example.ukmku.api.MyApi;
import com.example.ukmku.model.Api_Token;
import com.example.ukmku.model.Login;
import com.example.ukmku.response.LoginResponse;
import com.example.ukmku.utils.AppPreference;
import com.google.android.material.textfield.TextInputLayout;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private TextInputLayout til_Username, til_Password;
    private Button btn_Sign_In, btn_To_Sign_Up;
    private String username, password, status;
    private MyApi myApi;
    private AppPreference appPreference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        appPreference = new AppPreference(LoginActivity.this);

        til_Username = (TextInputLayout) findViewById(R.id.edt_username);
        til_Password = (TextInputLayout) findViewById(R.id.edt_password);
        btn_Sign_In = findViewById(R.id.btn_sign_in);
        btn_To_Sign_Up = findViewById(R.id.btn_to_sign_up);

        btn_Sign_In.setOnClickListener(this);
        btn_To_Sign_Up.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_sign_in:
                loginUser();
                break;
            case R.id.btn_to_sign_up:
                Intent intent_to_sign_up = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent_to_sign_up);
                break;
        }
    }

    public void loginUser() {
        username = til_Username.getEditText().toString();
        password = til_Password.getEditText().toString();

        Login login = new Login(username, password);

        myApi = ApiClient.getClient().create(MyApi.class);

        Call<LoginResponse> callLogin = myApi.login(login);

        callLogin.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                if (response.isSuccessful()) {
                    String token = response.body().getData().getApiToken().toString();
                    status = response.body().getData().getUser().getStatus().toString();

                    appPreference.saveToken(token);

                    if (status.equals("Investor")) {
                        Intent intent_sign_in = new Intent(LoginActivity.this, InvestorActivity.class);
                        startActivity(intent_sign_in);
                        finish();
                    } else if (status.equals("Pemiik")){

                    }

                } else {
                    Toast.makeText(LoginActivity.this, "Error", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                Toast.makeText(LoginActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onStart() {
        super.onStart();

        if (appPreference.isLoggedIn()) {
            if (status.equals("Investor")) {
                Intent intent = new Intent(LoginActivity.this, InvestorActivity.class);
                startActivity(intent);
                finish();
            } else {

            }
        }
    }
}
