package com.example.android_lab_3;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private final List<Sourse> sourceList;
    private final Button button1;
    private final Button button2;
    private final ImageView image;
    private final TextView title;

    public ViewHolder(@NonNull View itemView, List<Sourse> sourceList) {
        super(itemView);
       button1 itemView.findViewById(R.id.button1);
        button2 itemView.findViewById(R.id.button2);
        image itemView.findViewById(R.id.image);
        title titleitemView.findViewById(R.id.title);
    }

    @Override
    public void onClick(View v) {

    }
}
