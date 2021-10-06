package com.example.scrollpositionrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
<<<<<<< HEAD
=======
import android.widget.LinearLayout;
>>>>>>> 61adeaf (Initial commit)
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
<<<<<<< HEAD
        rcvList.setLayoutManager(new LinearLayoutManager(this));
        rcvList.setAdapter(dongAdapter);
        rcvList.scrollToPosition(position);
        //scroll tới vị trí của vị trí đang được chọn
=======
        LinearLayoutManager manager = new LinearLayoutManager(this);
        rcvList.setLayoutManager(manager);
        rcvList.setAdapter(dongAdapter);
        //scroll tới vị trí của vị trí đang được chọn
        //rcvList.scrollToPosition(position);
        manager.scrollToPositionWithOffset(position, arr.size());
>>>>>>> 61adeaf (Initial commit)
        txtPosition.setText("dòng được scroll là"+ position);
    }
    private void setArr(){
        arr = new ArrayList<>();
        for (int i = 0; i < 50; i++){
            arr.add("Đây là ội dung được thêm thứ: "+ i);
        }
    }
}