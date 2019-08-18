package com.bitspilani.bosm2019.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bitspilani.bosm2019.R;
import com.bitspilani.bosm2019.models.MyBetsModel;

import java.util.ArrayList;

public class MyBetAdapter extends RecyclerView.Adapter<MyBetAdapter.ViewHolder>
{
    private ArrayList<MyBetsModel> items = new ArrayList<>();
    private Context context;


    public MyBetAdapter(ArrayList<MyBetsModel> items, Context context) {
        this.items = items;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.mybet_item_layout,viewGroup,false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }



    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
      holder.event.setText(items.get(position).getEvent());
      holder.betAmount.setText(String.valueOf(items.get(position).getBetAmount()));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView event,betAmount,betType;
        boolean completed;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            event = itemView.findViewById(R.id.tV_event_name);
            betAmount = itemView.findViewById(R.id.tV_bet_amount);
            betType = itemView.findViewById(R.id.tV_betType);
        }
    }
}