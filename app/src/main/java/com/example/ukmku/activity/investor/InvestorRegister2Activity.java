package com.example.ukmku.activity.investor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;

import com.example.ukmku.R;
import com.example.ukmku.activity.general.RegisterActivity;
import com.example.ukmku.api.ApiClient;
import com.example.ukmku.api.MyApi;
import com.example.ukmku.model.Religion;
import com.example.ukmku.response.ReligionResponse;
import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class InvestorRegister2Activity extends AppCompatActivity implements View.OnClickListener {

    private TextInputLayout til_nation, til_identity_number, til_born_place, til_born_nation,
            til_born_date, til_religion, til_address, til_phone, til_education, til_work, til_salary;
    private Spinner sp_Gender, sp_Salary, sp_Marriage;
    private Button btn_Next;
    private ImageButton img_back;
    private String kewarganegaraan, tempatLahir, negaraLahir, bulanLahir, agama, alamat, lahir;
    private Integer noIdentitas, tanggalLahir, tahunLahir, noHP;
    private MyApi myApi;
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_investor_register2);

        til_nation = (TextInputLayout) findViewById(R.id.edt_nation);
        til_identity_number = (TextInputLayout) findViewById(R.id.edt_identity_number);
        til_born_place = (TextInputLayout) findViewById(R.id.edt_born_place);
        til_born_nation = (TextInputLayout) findViewById(R.id.edt_born_nation);
        til_born_date = (TextInputLayout) findViewById(R.id.edt_born_date);
        til_religion = (TextInputLayout) findViewById(R.id.edt_religion);
        til_address = (TextInputLayout) findViewById(R.id.edt_address);
        til_phone = (TextInputLayout) findViewById(R.id.edt_phone);

        sp_Gender = findViewById(R.id.sp_gender);

        btn_Next = findViewById(R.id.btn_next);
        img_back = (ImageButton) findViewById(R.id.ib_back);

        btn_Next.setOnClickListener(this);
        img_back.setOnClickListener(this);

    }

    private int tanggal(String a) {
        return Integer.parseInt(a.substring(0, 1));
    }

    private String bulan(String b) {
        String a = b.substring(3, 4);
        switch (a) {
            case "01":
                return "Januari";
            case "02":
                return "Februari";
            case "03":
                return "Maret";
            case "04":
                return "April";
            case "05":
                return "Mei";
            case "06":
                return "Juni";
            case "07":
                return "Juli";
            case "08":
                return "Agustus";
            case "09":
                return "September";
            case "10":
                return "Oktober";
            case "11":
                return "November";
            case "12":
                return "Desember";
            default:
                return "null";
        }
    }

    private int tahun(String c) {
        return Integer.parseInt(c.substring(6, (c.length() - 1)));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_next:
                RegisterUser();


                break;
            case R.id.ib_back:
                Intent intent_back = new Intent(InvestorRegister2Activity.this, RegisterActivity.class);
                startActivity(intent_back);
                finish();
                break;
        }
    }

    private boolean RegisterCheck() {
        boolean cek = true;

        return cek;
    }

    private void RegisterUser() {
        kewarganegaraan = til_nation.getEditText().getText().toString();
        tempatLahir = til_born_place.getEditText().getText().toString();
        negaraLahir = til_born_nation.getEditText().getText().toString();
        lahir = til_born_date.getEditText().getText().toString();
        tanggalLahir = tanggal(lahir);
        bulanLahir = bulan(lahir);
        tahunLahir = tahun(lahir);
        agama = til_religion.getEditText().getText().toString();
        alamat = til_address.getEditText().getText().toString();
        noIdentitas = Integer.parseInt(til_identity_number.getEditText().getText().toString());
        noHP = Integer.parseInt(til_phone.getEditText().getText().toString());

        myApi = ApiClient.getClient().create(MyApi.class);

        Call<ReligionResponse> religionCall = myApi.getReligion();

        religionCall.enqueue(new Callback<ReligionResponse>() {
            @Override
            public void onResponse(Call<ReligionResponse> call, Response<ReligionResponse> response) {
                ArrayList<Religion> religions = new ArrayList<>();

            }

            @Override
            public void onFailure(Call<ReligionResponse> call, Throwable t) {

            }
        });

    }

}
