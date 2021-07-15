package com.example.animal;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Holder extends RecyclerView.ViewHolder {
    private ImageView mImage;
    private TextView mName;
    private TextView mType;
    private TextView mSound;
    private RelativeLayout mRlView;
    private ItemClickListner itemClickListner;

    public Holder(@NonNull View itemView, ItemClickListner itemClickListner) {
        super(itemView);
        this.itemClickListner=itemClickListner;
        initview(itemView);
    }
    public void initview(View itemview)
    {
        mImage=itemview.findViewById(R.id.ivImage);
        mName=itemview.findViewById(R.id.name);
        mSound=itemview.findViewById(R.id.sound);
        mType=itemview.findViewById(R.id.type);
        mRlView=itemview.findViewById(R.id.rlView);
    }
    public void setdata(Animal model)
    {
        mImage.setImageResource(model.getmImage());
        mName.setText(model.getmName());
        mType.setText(model.getmType());
        mSound.setText(model.getmSound());
        mRlView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListner.onItemClick(model);
            }
        });
    }
}
