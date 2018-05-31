package com.tomorrow.worldcupguide.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tomorrow.worldcupguide.R;
import com.tomorrow.worldcupguide.bean.PlayingFloor;

import java.util.ArrayList;

/**
 * Created by Sean on 2018/5/31.
 */

public class PlayingFloorAdapter extends RecyclerView.Adapter<PlayingFloorAdapter.PlayingFloorHolder> {

    private Context mContext;
    private ArrayList<PlayingFloor> mPlayingFloorList;
    private OnItemClickListener mClickListener;

    public interface OnItemClickListener {
        void onItemClick(View view, int position);

        void onItemLongClick(View view, int position);
    }

    public void setClickListener(OnItemClickListener clickListener) {
        this.mClickListener = clickListener;
    }

    public PlayingFloorAdapter(Context context, ArrayList<PlayingFloor> list) {
        this.mContext = context;
        this.mPlayingFloorList = list;
    }

    @Override
    public PlayingFloorHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View contentView = LayoutInflater.from(mContext).inflate(R.layout.item_playing_floor, parent, false);
        PlayingFloorHolder playingFloorHolder = new PlayingFloorHolder(contentView);
        return playingFloorHolder;
    }

    @Override
    public void onBindViewHolder(final PlayingFloorHolder holder, final int position) {

        String city = mPlayingFloorList.get(position).getCity();
        String playingFloor = mPlayingFloorList.get(position).getPlayingFloor();
        String holdContent = mPlayingFloorList.get(position).getHoldContent();
        String groupStageContent = mPlayingFloorList.get(position).getGroupStageContent();

        holder.tvCity.setText(city);
        holder.tvPlayingFloor.setText(playingFloor);
        holder.tvHoldContent.setText(holdContent);
        holder.tvGroupStageContent.setText(groupStageContent);

        if (mClickListener != null) {
            holder.playingFloorCardview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mClickListener.onItemClick(holder.playingFloorCardview, position);
                }
            });
            holder.playingFloorCardview.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    mClickListener.onItemLongClick(holder.playingFloorCardview, position);
                    return true;//当返回false时，点击事件和长按事件都会相应
                }
            });
        }
    }


    @Override
    public int getItemCount() {
        return mPlayingFloorList.size();
    }

    public static class PlayingFloorHolder extends RecyclerView.ViewHolder {

        CardView playingFloorCardview;
        TextView tvCity;
        TextView tvPlayingFloor;
        TextView tvHoldContent;
        TextView tvGroupStageContent;

        public PlayingFloorHolder(View itemView) {
            super(itemView);
            playingFloorCardview = itemView.findViewById(R.id.cardview_playing_floor);
            tvCity = itemView.findViewById(R.id.tv_city);
            tvPlayingFloor = itemView.findViewById(R.id.tv_playing_floor);
            tvHoldContent = itemView.findViewById(R.id.tv_hold_content);
            tvGroupStageContent = itemView.findViewById(R.id.tv_group_stage_content);
        }
    }
}
