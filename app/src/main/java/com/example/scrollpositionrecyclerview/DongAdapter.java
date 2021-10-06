package com.example.scrollpositionrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DongAdapter extends RecyclerView.Adapter<DongAdapter.viewHolder>{
    private List<String> arrStr;

    public DongAdapter(List<String> arrStr) {
        this.arrStr = arrStr;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.dong_list, parent, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        String content = arrStr.get(position);
        holder.txtDong.setText(content);
    }

    @Override
    public int getItemCount() {
        return arrStr.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{

        TextView txtDong;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            txtDong = itemView.findViewById(R.id.txt_dong);
        }
    }
}
