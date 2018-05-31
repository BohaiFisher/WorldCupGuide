package com.tomorrow.worldcupguide.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tomorrow.worldcupguide.R;
import com.tomorrow.worldcupguide.bean.GameOrderBean;

import java.util.ArrayList;

/**
 * Created by Sean on 2018/5/31.
 */

public class GameOrderAdapter extends RecyclerView.Adapter<GameOrderAdapter.GameOrderHolder> {

    private Context mContext;
    private ArrayList<GameOrderBean> mGameOrderList;
    private OnItemClickListener mClickListener;

    public interface OnItemClickListener {
        void onItemClick(View view, int position);

        void onItemLongClick(View view, int position);
    }

    public void setClickListener(OnItemClickListener clickListener) {
        this.mClickListener = clickListener;
    }

    public GameOrderAdapter(Context context, ArrayList<GameOrderBean> list) {
        this.mContext = context;
        this.mGameOrderList = list;
    }

    @Override
    public GameOrderHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View contentView = LayoutInflater.from(mContext).inflate(R.layout.item_game_info, parent, false);
        GameOrderHolder gameOrderHolder = new GameOrderHolder(contentView);
        return gameOrderHolder;
    }


    @Override
    public void onBindViewHolder(final GameOrderHolder holder, final int position) {

        String gameOrder = mGameOrderList.get(position).getGameOrder();
        String gameTime = mGameOrderList.get(position).getGameTime();
        String gameTeams = mGameOrderList.get(position).getGameTeams();
        String gameSite = mGameOrderList.get(position).getGameSiteInfo();

        holder.tvGameOrder.setText(gameOrder);
        holder.tvGameTime.setText(gameTime);
        holder.tvGameTeams.setText(gameTeams);
        holder.tvGameSite.setText(gameSite);

        if (mClickListener != null) {
            holder.gameInfoCardview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mClickListener.onItemClick(holder.gameInfoCardview, position);
                }
            });
            holder.gameInfoCardview.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    mClickListener.onItemLongClick(holder.gameInfoCardview, position);
                    return true;//当返回false时，点击事件和长按事件都会相应
                }
            });
        }
    }


    @Override
    public int getItemCount() {
        return mGameOrderList.size();
    }

    public static class GameOrderHolder extends RecyclerView.ViewHolder {

        CardView gameInfoCardview;
        TextView tvGameOrder;
        TextView tvGameTime;
        TextView tvGameTeams;
        TextView tvGameSite;

        public GameOrderHolder(View itemView) {
            super(itemView);
            gameInfoCardview = itemView.findViewById(R.id.cardview_game_info);
            tvGameOrder = itemView.findViewById(R.id.tv_game_order);
            tvGameTime = itemView.findViewById(R.id.tv_game_time);
            tvGameTeams = itemView.findViewById(R.id.tv_team_info);
            tvGameSite = itemView.findViewById(R.id.tv_game_site_info);
        }
    }
}
