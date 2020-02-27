package com.example.ukmku.activity.owner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.ukmku.R;
import com.example.ukmku.activity.general.RegisterActivity;
import com.example.ukmku.api.MyApi;
import com.google.android.material.textfield.TextInputLayout;

public class OwnerRegister2Activity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton ib_Back;
    private TextInputLayout til_NPWP, til_ukm_name, til_ukm_address, til_rt, til_rw,
            til_born_date, til_kecamatan, til_kelurahan, til_provinsi, til_postal_code,
            til_office_number, til_kind, til_director_name, til_ukm_account_number;
    private Button btn_Done;

    private String nama_usaha, alamat_usaha, lahir, bulan_lahir, kecamatan, kelurahan,
            provinsi, jenis_usaha, nama_direktur;
    private Integer NPWP, RT, RW, tanggal_lahir, tahun_lahir, kode_pos, no_telpon_kantor,
            no_rekening_usaha;

    private MyApi myApi;
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owner_register2);

        til_NPWP = (TextInputLayout) findViewById(R.id.edt_NPWP);
        til_ukm_name = (TextInputLayout) findViewById(R.id.edt_ukm_name);
        til_ukm_address = (TextInputLayout) findViewById(R.id.edt_ukm_address);
        til_rt = (TextInputLayout) findViewById(R.id.edt_RT);
        til_rw = (TextInputLayout) findViewById(R.id.edt_RW);
        til_born_date = (TextInputLayout) findViewById(R.id.edt_born_date2);
        til_kecamatan = (TextInputLayout) findViewById(R.id.edt_kecamatan);
        til_kelurahan = (TextInputLayout) findViewById(R.id.edt_kelurahan);
        til_provinsi = (TextInputLayout) findViewById(R.id.edt_provinsi);
        til_postal_code = (TextInputLayout) findViewById(R.id.edt_postal_code);
        til_office_number = (TextInputLayout) findViewById(R.id.edt_office_number);
        til_kind = (TextInputLayout) findViewById(R.id.edt_kind);
        til_director_name = (TextInputLayout) findViewById(R.id.edt_director_name);
        til_ukm_account_number = (TextInputLayout) findViewById(R.id.edt_account_ukm);

        btn_Done = findViewById(R.id.btn_done2);
        ib_Back = (ImageButton) findViewById(R.id.ib_back2);

        btn_Done.setOnClickListener(this);
        ib_Back.setOnClickListener(this);
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

    private int tahun(String c){
        return Integer.parseInt(c.substring(6, (c.length() - 1)));
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_done2:
                nama_usaha = til_ukm_name.getEditText().getText().toString();
                alamat_usaha = til_ukm_address.getEditText().getText().toString();
                lahir = til_born_date.getEditText().getText().toString();
                bulan_lahir = bulan(lahir);
                kecamatan = til_kecamatan.getEditText().getText().toString();
                kelurahan = til_kelurahan.getEditText().getText().toString();
                provinsi = til_provinsi.getEditText().getText().toString();
                jenis_usaha = til_kind.getEditText().getText().toString();
                nama_direktur = til_director_name.getEditText().getText().toString();

                NPWP = Integer.parseInt(til_NPWP.getEditText().getText().toString());
                RT = Integer.parseInt(til_rt.getEditText().getText().toString());
                RW = Integer.parseInt(til_rw.getEditText().getText().toString());
                tanggal_lahir = tanggal(lahir);
                tahun_lahir = tahun(lahir);
                kode_pos = Integer.parseInt(til_postal_code.getEditText().getText().toString());
                no_telpon_kantor = Integer.parseInt(til_office_number.getEditText().getText().toString());
                no_rekening_usaha = Integer.parseInt(til_ukm_account_number.getEditText().getText().toString());


                break;
            case R.id.ib_back2:
                Intent intent_back = new Intent(OwnerRegister2Activity.this, RegisterActivity.class);
                startActivity(intent_back);
                finish();
                break;
        }
    }
}
