package com.example.ukmku.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ukmku.R;
import com.example.ukmku.api.ApiClient;
import com.example.ukmku.api.MyApi;
import com.example.ukmku.model.Register;
import com.example.ukmku.response.RegisterResponse;
import com.google.android.material.textfield.TextInputLayout;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    private TextInputLayout til_Name, til_Username, til_Email, til_Password, til_RePassword;
    private Button btn_Sign_Up, btn_To_Sign_In;
    private Spinner sp_Status;
    private String name, username, email, password, rePassword, status;
    private MyApi myApi;
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        til_Name = (TextInputLayout) findViewById(R.id.edt_name);
        til_Username = (TextInputLayout) findViewById(R.id.edt_username);
        til_Email = (TextInputLayout) findViewById(R.id.edt_email);
        til_Password = (TextInputLayout) findViewById(R.id.edt_password);
        til_RePassword = (TextInputLayout) findViewById(R.id.edt_repassword);

        sp_Status = findViewById(R.id.sp_status);

        btn_Sign_Up = findViewById(R.id.btn_sign_up);
        btn_To_Sign_In = findViewById(R.id.btn_to_sign_in);

        btn_Sign_Up.setOnClickListener(this);
        btn_To_Sign_In.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_sign_up:
                name = til_Name.getEditText().getText().toString();
                username = til_Username.getEditText().getText().toString();
                email = til_Email.getEditText().getText().toString();
                password = til_Password.getEditText().getText().toString();
                rePassword = til_RePassword.getEditText().getText().toString();
                status = String.valueOf(sp_Status.getSelectedItem());

                if (RegisterCheck()) {
                    RegisterUser();
                }
                break;
            case R.id.btn_to_sign_in:
                Intent intent_to_sign_in = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent_to_sign_in);
                finishAffinity();
                break;
        }
    }


    private boolean RegisterCheck() {
        boolean cek = true;
        if (TextUtils.isEmpty(name)) {
            til_Name.setError("Nama tidak boleh kosong");
            til_Name.requestFocus();
            cek = false;
        } else {
            til_Name.setError(null);
        }
        if (TextUtils.isEmpty(username)) {
            til_Username.setError("Username tidak boleh kosong");
            til_Username.requestFocus();
            cek = false;
        } else {
            til_Username.setError(null);
        }
        if (TextUtils.isEmpty(email)) {
            til_Email.setError("Email tidak boleh kosong");
            til_Email.requestFocus();
            cek = false;
        } else {
            til_Email.setError(null);
        }
        if (TextUtils.isEmpty(password)) {
            til_Password.setError("Kata sandi tidak boleh kosong");
            til_Password.requestFocus();
            cek = false;
        } else {
            til_Password.setError(null);
        }
        if (!rePassword.equals(password)) {
            til_RePassword.setError("Kata sandi tidak sama");
            til_RePassword.requestFocus();
            cek = false;
        } else {
            til_RePassword.setError(null);
        }
        TextView errorTextView = (TextView) sp_Status.getSelectedView();
        if (sp_Status.getSelectedItemPosition() == 0) {
            errorTextView.setError("");
            errorTextView.setTextColor(Color.RED);
            errorTextView.setText("Pilih status");
            cek = false;
        } else {
            errorTextView.setError(null);
        }
        return cek;
    }

    private void RegisterUser() {

        Register register = new Register(name, username, email, password, status);

        myApi = ApiClient.getClient().create(MyApi.class);

        Call<RegisterResponse> registerCall = myApi.register(register);

        registerCall.enqueue(new Callback<RegisterResponse>() {
            @Override
            public void onResponse(Call<RegisterResponse> call, Response<RegisterResponse> response) {
                if (response.isSuccessful()) {
                    Intent intent_to_Sign_In = new Intent(RegisterActivity.this, LoginActivity.class);
                    startActivity(intent_to_Sign_In);
                    finish();
                } else {
                    Toast.makeText(RegisterActivity.this, "Error", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<RegisterResponse> call, Throwable t) {
                Toast.makeText(RegisterActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }


}

