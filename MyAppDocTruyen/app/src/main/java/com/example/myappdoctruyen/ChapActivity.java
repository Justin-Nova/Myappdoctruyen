package com.example.myappdoctruyen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.myappdoctruyen.adapter.ChapTruyenAdapter;
import com.example.myappdoctruyen.object.ChapTruyen;
import com.example.myappdoctruyen.object.TruyenTranh;

import java.util.ArrayList;

public class ChapActivity extends AppCompatActivity {

    TextView TenTruyen2;
    ImageView AnhTruyen2;
    TruyenTranh truyenTranh;
    ListView DanhSachChap;
    ArrayList<ChapTruyen> arrChap;
    ChapTruyenAdapter chapTruyenAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chap);

        init();
        anhXa();
        setUp();
        setClick();
    }
    private void init() {
        Bundle b = getIntent().getBundleExtra("data");
        truyenTranh = (TruyenTranh) b.getSerializable("truyen");

        // Tạo dữ liệu ảo
        arrChap = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            arrChap.add(new ChapTruyen("Chapter "+i, "06 - 10 - 2023"));
        }
        chapTruyenAdapter = new ChapTruyenAdapter(this,0, arrChap);

    }
    private void anhXa() {
        AnhTruyen2 = findViewById(R.id.AnhTruyen2);
        TenTruyen2 = findViewById(R.id.TenTruyen2);
        DanhSachChap = findViewById(R.id.DanhSachChap);
    }
    private void setUp() {
        TenTruyen2.setText(truyenTranh.getTenTruyen());
        Glide.with(this).load(truyenTranh.getLinkAnh()).into(AnhTruyen2);

        DanhSachChap.setAdapter(chapTruyenAdapter);
    }
    private void setClick() {
    }
}