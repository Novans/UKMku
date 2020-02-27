package com.example.ukmku.activity.general;

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
import com.example.ukmku.activity.investor.InvestorRegister2Activity;
import com.example.ukmku.activity.owner.OwnerRegister2Activity;
import com.example.ukmku.api.ApiClient;
import com.example.ukmku.api.MyApi;
import com.example.ukmku.model.Errors;
import com.example.ukmku.model.Register;
import com.example.ukmku.response.BaseResponse;
import com.google.android.material.textfield.TextInputLayout;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    private TextInputLayout til_Name, til_Email, til_Password, til_RePassword;
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

        Register user = new Register(name, email, password, status);

        myApi = ApiClient.getClient().create(MyApi.class);

        Call<BaseResponse> registerCall = myApi.register(user);

        registerCall.enqueue(new Callback<BaseResponse>() {
            @Override
            public void onResponse(Call<BaseResponse> call, Response<BaseResponse> response) {
                if (response.isSuccessful()) {
                    if (status.equals("Investor")){
                        Intent intent_investor_2 = new Intent(RegisterActivity.this, InvestorRegister2Activity.class);
                        startActivity(intent_investor_2);
                    } else if(status.equals("Pemilik Usaha")){
                        Intent intent_owner_2 = new Intent(RegisterActivity.this, OwnerRegister2Activity.class);
                        startActivity(intent_owner_2);
                    }
                } else {
                    Toast.makeText(RegisterActivity.this, response.body().getErrors().toString(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<BaseResponse> call, Throwable t) {
                Toast.makeText(RegisterActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }


}


