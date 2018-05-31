package com.tomorrow.worldcupguide.bean;

import com.tomorrow.worldcupguide.data.BaseData;

import java.util.ArrayList;

/**
 * Created by Sean on 2018/5/31.
 */

public class GameOrderBean {

    private String gameOrder;
    private String gameTime;
    private String gameTeams;
    private String gameSiteInfo;

    private ArrayList<GameOrderBean> mGameOrderArrayList;
    private ArrayList<String> mGameTime;
    private ArrayList<String> mGameTeams;
    private ArrayList<String> mGameSite;

    public GameOrderBean() {
    }

    public GameOrderBean(String gameOrder, String gameTime, String gameTeams, String gameSiteInfo) {
        this.gameOrder = gameOrder;
        this.gameTime = gameTime;
        this.gameTeams = gameTeams;
        this.gameSiteInfo = gameSiteInfo;
    }

    public ArrayList<GameOrderBean> getGameOrderInfo() {
        mGameOrderArrayList = new ArrayList<>();

        BaseData baseData = new BaseData();
        mGameTime = baseData.getGameTime();
        mGameTeams = baseData.getGameTeams();
        mGameSite = baseData.getGameSite();

        for (int i = 0; i < 64; i++) {
            GameOrderBean gameOrderBean = new GameOrderBean("第" + (i + 1) + "场", mGameTime.get(i), mGameTeams.get(i), mGameSite.get(i));
            mGameOrderArrayList.add(gameOrderBean);
        }
        return mGameOrderArrayList;
    }

    public String getGameOrder() {
        return gameOrder;
    }

    public void setGameOrder(String gameOrder) {
        this.gameOrder = gameOrder;
    }

    public String getGameTime() {
        return gameTime;
    }

    public void setGameTime(String gameTime) {
        this.gameTime = gameTime;
    }

    public String getGameTeams() {
        return gameTeams;
    }

    public void setGameTeams(String gameTeams) {
        this.gameTeams = gameTeams;
    }

    public String getGameSiteInfo() {
        return gameSiteInfo;
    }

    public void setGameSiteInfo(String gameSiteInfo) {
        this.gameSiteInfo = gameSiteInfo;
    }


}
