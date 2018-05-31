package com.tomorrow.worldcupguide.activity;

import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

import com.tomorrow.worldcupguide.R;
import com.tomorrow.worldcupguide.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @BindView(R.id.view_center_line)
    TextView viewCenterLine;
    @BindView(R.id.card_view_match)
    CardView cardViewMatch;
    @BindView(R.id.card_view_grade)
    CardView cardViewGrade;
    @BindView(R.id.card_view_group)
    CardView cardViewGroup;
    @BindView(R.id.card_view_continent)
    CardView cardViewContinent;
    @BindView(R.id.card_view_site)
    CardView cardViewSite;
    @BindView(R.id.card_view_article)
    CardView cardViewArticle;
    @BindView(R.id.card_view_lottery)
    CardView cardViewLottery;
    @BindView(R.id.card_view_guide)
    CardView cardViewGuide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.card_view_match, R.id.card_view_grade, R.id.card_view_group, R.id.card_view_continent, R.id.card_view_site, R.id.card_view_article, R.id.card_view_lottery, R.id.card_view_guide})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.card_view_match:
                startActivity(GameOrderActivity.class);
                break;
            case R.id.card_view_grade:
                startActivity(CountryGradeActivity.class);
                break;
            case R.id.card_view_group:
                startActivity(CountryGroupActivity.class);
                break;
            case R.id.card_view_continent:
                startActivity(CountryLocationActivity.class);
                break;
            case R.id.card_view_site:
                startActivity(PlayingFloorActivity.class);
                break;
            case R.id.card_view_article:
                break;
            case R.id.card_view_lottery:
                break;
            case R.id.card_view_guide:
                break;
        }
    }
}
