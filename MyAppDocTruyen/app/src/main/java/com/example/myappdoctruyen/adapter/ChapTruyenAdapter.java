package com.example.myappdoctruyen.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.myappdoctruyen.R;
import com.example.myappdoctruyen.object.ChapTruyen;

import java.util.ArrayList;
import java.util.List;

public class ChapTruyenAdapter extends ArrayAdapter<ChapTruyen> {
    private Context ct;
    private ArrayList<ChapTruyen> arr;
    public ChapTruyenAdapter(@NonNull Context context, int resource, @NonNull List<ChapTruyen> objects) {
        super(context, resource, objects);

        this.ct = context;
        this.arr = new ArrayList<>(objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater)ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.item_chap_truyen,null);
        }
        if (arr.size()>0) {
            TextView TenChap2, NgayNhap;
            TenChap2 = convertView.findViewById(R.id.TenChap2);
            NgayNhap = convertView.findViewById(R.id.NgayNhap);

            ChapTruyen chapTruyen = arr.get(position);
            TenChap2.setText(chapTruyen.getTenChap());
            NgayNhap.setText(chapTruyen.getNgayDang());
        }
        return convertView;
    }
}
