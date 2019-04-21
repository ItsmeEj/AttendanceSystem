package com.example.attendancesystem;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.util.LogTime;

import java.util.ArrayList;

public class RecyclerViewAdapter extends  RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{
    private static final String TAG = "RecyclerViewAdapter";

    private ArrayList<String> subjectName = new ArrayList<>();
    private Context mContext;

    public RecyclerViewAdapter(ArrayList<String> subjectName, Context context) {
        this.subjectName = subjectName;
        this.mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = (View) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_listitem, viewGroup, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Log.d(TAG,  "onBindViewHolder: called");
        viewHolder.subject_name.setText(subjectName.get(i));

    }

    @Override
    public int getItemCount() {
        return subjectName.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView subject_name;
        RelativeLayout parent_layout;
        public ViewHolder(View itemView) {
            super(itemView);
            subject_name = itemView.findViewById(R.id.subject_name);
            parent_layout = itemView.findViewById(R.id.parent_layout);


        }
    }
}
