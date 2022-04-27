package com.example.recycleviewproject1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


     class RecyclerAdaper extends RecyclerView.Adapter<RecyclerAdaper.RecyclerViewHolder> {
        private ArrayList<RecyclerItem> recyclerItems;
        public static class RecyclerViewHolder extends RecyclerView.ViewHolder{
            public ImageView mimageView;
            public TextView mtextView1;

            public ImageView ColorRes;
            public RecyclerViewHolder( View itemView) {
                super(itemView);
                mimageView=itemView.findViewById(R.id.restimg);
                mtextView1=itemView.findViewById(R.id.RestName);



                ColorRes=itemView.findViewById(R.id.RestRes);


            }//end of const
        }//end of RecyclerViewHolder
        public RecyclerAdaper(ArrayList<RecyclerItem> recyclerItems){
            this.recyclerItems=recyclerItems;
        }//end of main class constr.

        @Override
        public RecyclerViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_items,viewGroup,false);
            RecyclerViewHolder RVH=new RecyclerViewHolder(v);
            return RVH;
        }//end of onCreateViewHolder

        @Override
        public void onBindViewHolder(RecyclerViewHolder Holder, int position) {
            RecyclerItem currentItem=recyclerItems.get(position);
            Holder.mimageView.setImageResource(currentItem.getmImageRes());
            Holder.mtextView1.setText(currentItem.getmText1());


            Holder.ColorRes.setImageResource(currentItem.getmImageRes3());


        }//end of onBindViewHolder

        @Override
        public int getItemCount() {
            return recyclerItems.size();
        }//end of getItemCount


    }

