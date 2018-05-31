package com.tomorrow.worldcupguide.activity;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.tomorrow.worldcupguide.R;
import com.tomorrow.worldcupguide.adapter.PlayingFloorAdapter;
import com.tomorrow.worldcupguide.base.BaseActivity;
import com.tomorrow.worldcupguide.bean.PlayingFloor;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 比赛场地
 */
public class PlayingFloorActivity extends BaseActivity {

    @BindView(R.id.recycler_view_playing_floor)
    RecyclerView recyclerViewPlayingFloor;
    private PlayingFloorAdapter mPlayingFloorAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing_floor);
        ButterKnife.bind(this);
        initData();
    }

    private void initData() {
        recyclerViewPlayingFloor.setLayoutManager(new LinearLayoutManager(this));
        mPlayingFloorAdapter = new PlayingFloorAdapter(this, new PlayingFloor().getPlayingFloorInfo());
        recyclerViewPlayingFloor.setAdapter(mPlayingFloorAdapter);
        mPlayingFloorAdapter.setClickListener(new PlayingFloorAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                showToastShort("short click!");
            }

            @Override
            public void onItemLongClick(View view, int position) {
                showToastShort("long click!");
            }
        });
    }

}
