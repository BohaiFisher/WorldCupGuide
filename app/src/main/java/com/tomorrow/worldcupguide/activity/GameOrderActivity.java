package com.tomorrow.worldcupguide.activity;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.tomorrow.worldcupguide.R;
import com.tomorrow.worldcupguide.adapter.GameOrderAdapter;
import com.tomorrow.worldcupguide.base.BaseActivity;
import com.tomorrow.worldcupguide.bean.GameOrderBean;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GameOrderActivity extends BaseActivity {

    @BindView(R.id.recycler_view_game_order)
    RecyclerView recyclerViewGameOrder;
    private GameOrderAdapter mGameOrderAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_order);
        ButterKnife.bind(this);
        initData();
    }

    private void initData() {
        recyclerViewGameOrder.setLayoutManager(new LinearLayoutManager(this));
        mGameOrderAdapter = new GameOrderAdapter(this, new GameOrderBean().getGameOrderInfo());
        recyclerViewGameOrder.setAdapter(mGameOrderAdapter);
    }
}
