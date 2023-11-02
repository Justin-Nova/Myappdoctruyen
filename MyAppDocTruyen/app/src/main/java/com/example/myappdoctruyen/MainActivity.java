package com.example.myappdoctruyen;

import android.content.Intent;
import android.os.Bundle;

import com.example.myappdoctruyen.adapter.TruyenTranhAdapter;
import com.example.myappdoctruyen.object.TruyenTranh;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.myappdoctruyen.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView DSTruyen;
    TruyenTranhAdapter adapter;
    ArrayList<TruyenTranh> truyenTranhArrayList;
    EditText TimKiem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        anhXa();
        setUp();
        setClick();
    }

    private void init() {
        truyenTranhArrayList = new ArrayList<>();
        truyenTranhArrayList.add(new TruyenTranh("VÔ CHỨC TÁN NHÂN","12","https://st.nhattruyenplus.com/data/comics/138/toan-dan-chuyen-chuc-duy-ta-vo-chuc-tan-7990.jpg"));
        truyenTranhArrayList.add(new TruyenTranh("QUẢN GIA MA HOÀNG","25","https://st.nhattruyenplus.com/data/comics/188/dai-quan-gia-la-ma-hoang-904.jpg"));
        truyenTranhArrayList.add(new TruyenTranh("ĐỈNH CẤP KHÍ VẬN","8","https://st.nhattruyenplus.com/data/comics/250/dinh-cap-khi-van-lang-le-tu-luyen-ngan-n-4183.jpg"));
        truyenTranhArrayList.add(new TruyenTranh("PHÁP SƯ TOÀN NĂNG","11","https://st.nhattruyenplus.com/data/comics/6/dai-phap-su-toan-nang.jpg"));
        truyenTranhArrayList.add(new TruyenTranh("CHẤP SỰ THỎ CỤP TAI","24","https://st.nhattruyenplus.com/data/comics/34/chap-su-tho-cup-tai.jpg"));
        truyenTranhArrayList.add(new TruyenTranh("VẠN CỔ TỐI CƯỜNG TÔNG","16","https://st.nhattruyenplus.com/data/comics/175/van-co-toi-cuong-tong.jpg"));

        adapter = new TruyenTranhAdapter(this, 0,truyenTranhArrayList);
    }
    private void anhXa() {
        DSTruyen = findViewById(R.id.DSTruyen);
        TimKiem = findViewById(R.id.TimKiem);
    }
    private void setUp() {
        DSTruyen.setAdapter(adapter);
    }
    private void setClick() {
        TimKiem.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String s = TimKiem.getText().toString();
                adapter.sortTruyen(s);
            }
        });
        DSTruyen.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TruyenTranh truyenTranh = truyenTranhArrayList.get(i);
                Bundle b = new Bundle();
                b.putSerializable("truyen",truyenTranh);

                Intent intent = new Intent(MainActivity.this, ChapActivity.class);
                intent.putExtra("data",b);
                startActivity(intent);
            }
        });
    }

    public void update(View view) {
    }
}