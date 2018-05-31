package com.tomorrow.worldcupguide.bean;

import com.tomorrow.worldcupguide.data.BaseData;

import java.util.ArrayList;

/**
 * Created by Sean on 2018/5/31.
 */

public class PlayingFloor {

    private String city;
    private String playingFloor;
    private String holdContent;
    private String groupStageContent;
    private ArrayList<PlayingFloor> playingFloorArrayList;
    private ArrayList<String> mPlayingFloorCities;
    private ArrayList<String> mPlayingFloors;
    private ArrayList<String> mHoldContent;
    private ArrayList<String> mGroupStageContent;

    public PlayingFloor() {
    }

    public PlayingFloor(String city, String playingFloor, String holdContent, String groupStageContent) {
        this.city = city;
        this.playingFloor = playingFloor;
        this.holdContent = holdContent;
        this.groupStageContent = groupStageContent;
    }

    public ArrayList<PlayingFloor> getPlayingFloorInfo() {

        playingFloorArrayList = new ArrayList<>();
        BaseData baseData = new BaseData();
        mPlayingFloorCities = baseData.getPlayingFloorCities();
        mPlayingFloors = baseData.getmPlayingFloors();
        mHoldContent = baseData.getHoldContent();
        mGroupStageContent = baseData.getGroupStageContent();
        for (int i = 0; i < 12; i++) {
            PlayingFloor playingFloor = new PlayingFloor(mPlayingFloorCities.get(i) + ": ", mPlayingFloors.get(i), mHoldContent.get(i), mGroupStageContent.get(i));
            playingFloorArrayList.add(playingFloor);
        }
        return playingFloorArrayList;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPlayingFloor() {
        return playingFloor;
    }

    public void setPlayingFloor(String playingFloor) {
        this.playingFloor = playingFloor;
    }

    public String getHoldContent() {
        return holdContent;
    }

    public void setHoldContent(String holdContent) {
        this.holdContent = holdContent;
    }

    public String getGroupStageContent() {
        return groupStageContent;
    }

    public void setGroupStageContent(String groupStageContent) {
        this.groupStageContent = groupStageContent;
    }


}
