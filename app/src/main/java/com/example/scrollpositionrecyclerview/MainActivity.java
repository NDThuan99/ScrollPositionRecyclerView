package com.example.scrollpositionrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<String> arr = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txtPosition = findViewById(R.id.txt_position);
        RecyclerView rcvList = findViewById(R.id.rcv_list);
        int position = 22;
        setArr();
        DongAdapter dongAdapter = new DongAdapter(arr);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        rcvList.setLayoutManager(manager);
        rcvList.setAdapter(dongAdapter);
        //scroll tới vị trí của vị trí đang được chọn
        //rcvList.scrollToPosition(position);
        manager.scrollToPositionWithOffset(position, arr.size());
        txtPosition.setText("dòng được scroll là"+ position);
    }
    private void setArr(){
        arr = new ArrayList<>();
        for (int i = 0; i < 50; i++){
            arr.add("Đây là ội dung được thêm thứ: "+ i);
        }
    }
}