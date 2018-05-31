package com.tomorrow.worldcupguide.data;

import java.util.ArrayList;

/**
 * Created by Sean on 2018/5/31.
 */

public class BaseData {

    private ArrayList<String> mPlayingFloorCities;
    private ArrayList<String> mPlayingFloors;
    private ArrayList<String> mHoldContent;
    private ArrayList<String> mGroupStageContent;

    private ArrayList<String> mGameTime;
    private ArrayList<String> mGameTeams;
    private ArrayList<String> mGameSite;

    public ArrayList<String> getPlayingFloorCities() {
        mPlayingFloorCities = new ArrayList<>();
        mPlayingFloorCities.add("莫斯科");
        mPlayingFloorCities.add("莫斯科");
        mPlayingFloorCities.add("圣彼得堡");
        mPlayingFloorCities.add("加里宁格勒");
        mPlayingFloorCities.add("喀山");
        mPlayingFloorCities.add("下诺夫哥罗德");
        mPlayingFloorCities.add("萨马拉");
        mPlayingFloorCities.add("伏尔加格勒");
        mPlayingFloorCities.add("萨兰斯克");
        mPlayingFloorCities.add("顿河畔罗斯托夫");
        mPlayingFloorCities.add("索契");
        mPlayingFloorCities.add("叶卡捷琳堡");
        return mPlayingFloorCities;
    }

    public ArrayList<String> getmPlayingFloors() {
        mPlayingFloors = new ArrayList<>();
        mPlayingFloors.add("卢日尼基体育场(81,000)");
        mPlayingFloors.add("莫斯科斯巴达克体育场(45,360)");
        mPlayingFloors.add("圣彼得堡体育场(68,134)");
        mPlayingFloors.add("加里宁格勒体育场(35,212)");
        mPlayingFloors.add("喀山竞技场(45,000)");
        mPlayingFloors.add("下诺夫哥罗德体育场(44,899)");
        mPlayingFloors.add("萨马拉竞技场(44,000)");
        mPlayingFloors.add("伏尔加格勒竞技场(45,568)");
        mPlayingFloors.add("莫尔多瓦竞技场(44,442)");
        mPlayingFloors.add("顿河畔罗斯托夫体育场(45,000)");
        mPlayingFloors.add("菲什特奥林匹克体育场(47,659)");
        mPlayingFloors.add("叶卡捷琳堡中央体育场(35,696)");
        return mPlayingFloors;
    }

    public ArrayList<String> getHoldContent() {
        mHoldContent = new ArrayList<>();
        mHoldContent.add("4场小组赛,1场16强赛,1场半决赛及决赛");
        mHoldContent.add("4场小组赛,1场16强赛");
        mHoldContent.add("4场小组赛,1场16强赛,1场半决赛及第三四名决赛");
        mHoldContent.add("4场小组赛");
        mHoldContent.add("4场小组赛,1场16强赛,一场8强赛");
        mHoldContent.add("4场小组赛,1场16强赛,一场8强赛");
        mHoldContent.add("4场小组赛,1场16强赛,一场8强赛");
        mHoldContent.add("4场小组赛");
        mHoldContent.add("4场小组赛");
        mHoldContent.add("4场小组赛,1场16强赛");
        mHoldContent.add("4场小组赛,1场16强赛,一场8强赛");
        mHoldContent.add("4场小组赛");
        return mHoldContent;
    }

    public ArrayList<String> getGroupStageContent() {
        mGroupStageContent = new ArrayList<>();
        mGroupStageContent.add("小组赛比赛内容有待更新");
        mGroupStageContent.add("小组赛比赛内容有待更新");
        mGroupStageContent.add("小组赛比赛内容有待更新");
        mGroupStageContent.add("小组赛比赛内容有待更新");
        mGroupStageContent.add("小组赛比赛内容有待更新");
        mGroupStageContent.add("小组赛比赛内容有待更新");
        mGroupStageContent.add("小组赛比赛内容有待更新");
        mGroupStageContent.add("小组赛比赛内容有待更新");
        mGroupStageContent.add("小组赛比赛内容有待更新");
        mGroupStageContent.add("小组赛比赛内容有待更新");
        mGroupStageContent.add("小组赛比赛内容有待更新");
        mGroupStageContent.add("小组赛比赛内容有待更新");
        return mGroupStageContent;
    }

    /**
     * 1-64场依次的比赛时间
     *
     * @return
     */
    public ArrayList<String> getGameTime() {
        mGameTime = new ArrayList<>();
        mGameTime.add("2018年6月14日23:00");
        mGameTime.add("2018年6月15日20:00");
        mGameTime.add("2018年6月15日23:00");
        mGameTime.add("2018年6月16日02:00");
        mGameTime.add("2018年6月16日18:00");
        mGameTime.add("2018年6月16日21:00");
        mGameTime.add("2018年6月17日00:00");
        mGameTime.add("2018年6月17日03:00");
        mGameTime.add("2018年6月17日20:00");
        mGameTime.add("2018年6月17日23:00");
        mGameTime.add("2018年6月18日02:00");
        mGameTime.add("2018年6月18日20:00");
        mGameTime.add("2018年6月18日23:00");
        mGameTime.add("2018年6月19日02:00");
        mGameTime.add("2018年6月19日20:00");
        mGameTime.add("2018年6月19日23:00");
        mGameTime.add("2018年6月20日02:00");
        mGameTime.add("2018年6月20日20:00");
        mGameTime.add("2018年6月20日23:00");
        mGameTime.add("2018年6月21日02:00");
        mGameTime.add("2018年6月21日20:00");
        mGameTime.add("2018年6月21日23:00");
        mGameTime.add("2018年6月22日02:00");
        mGameTime.add("2018年6月22日20:00");
        mGameTime.add("2018年6月22日23:00");
        mGameTime.add("2018年6月23日02:00");
        mGameTime.add("2018年6月23日20:00");
        mGameTime.add("2018年6月23日23:00");
        mGameTime.add("2018年6月24日02:00");
        mGameTime.add("2018年6月24日20:00");
        mGameTime.add("2018年6月24日23:00");
        mGameTime.add("2018年6月25日02:00");
        mGameTime.add("2018年6月25日22:00");
        mGameTime.add("2018年6月25日22:00");
        mGameTime.add("2018年6月26日02:00");
        mGameTime.add("2018年6月26日02:00");
        mGameTime.add("2018年6月26日22:00");
        mGameTime.add("2018年6月26日22:00");
        mGameTime.add("2018年6月27日02:00");
        mGameTime.add("2018年6月27日02:00");
        mGameTime.add("2018年6月27日22:00");
        mGameTime.add("2018年6月27日22:00");
        mGameTime.add("2018年6月28日02:00");
        mGameTime.add("2018年6月28日02:00");
        mGameTime.add("2018年6月28日22:00");
        mGameTime.add("2018年6月28日22:00");
        mGameTime.add("2018年6月29日02:00");
        mGameTime.add("2018年6月29日02:00");
        mGameTime.add("2018年6月30日22:00");
        mGameTime.add("2018年7月1日02:00");
        mGameTime.add("2018年7月1日22:00");
        mGameTime.add("2018年7月2日02:00");
        mGameTime.add("2018年7月2日22:00");
        mGameTime.add("2018年7月3日02:00");
        mGameTime.add("2018年7月3日22:00");
        mGameTime.add("2018年7月4日02:00");
        mGameTime.add("2018年7月6日22:00");
        mGameTime.add("2018年7月7日02:00");
        mGameTime.add("2018年7月7日22:00");
        mGameTime.add("2018年7月8日02:00");
        mGameTime.add("2018年7月11日02:00");
        mGameTime.add("2018年7月12日02:00");
        mGameTime.add("2018年7月14日22:00");
        mGameTime.add("2018年7月15日23:00");
        return mGameTime;
    }

    /**
     * 1-64场依次的对战球队
     *
     * @return
     */
    public ArrayList<String> getGameTeams() {
        mGameTeams = new ArrayList<>();
        mGameTeams.add("俄罗斯VS沙特阿拉伯");
        mGameTeams.add("埃及VS乌拉圭");
        mGameTeams.add("摩洛哥VS伊朗");
        mGameTeams.add("葡萄牙VS西班牙");
        mGameTeams.add("法国VS澳大利亚");
        mGameTeams.add("阿根廷VS冰岛");
        mGameTeams.add("秘鲁VS丹麦");
        mGameTeams.add("克罗地亚VS尼日利亚");
        mGameTeams.add("哥斯达黎加VS塞尔维亚");
        mGameTeams.add("德国VS墨西哥");
        mGameTeams.add("俄罗斯VS沙特阿拉伯");
        mGameTeams.add("俄罗斯VS沙特阿拉伯");
        mGameTeams.add("俄罗斯VS沙特阿拉伯");
        mGameTeams.add("俄罗斯VS沙特阿拉伯");
        mGameTeams.add("俄罗斯VS沙特阿拉伯");
        mGameTeams.add("俄罗斯VS沙特阿拉伯");
        mGameTeams.add("俄罗斯VS沙特阿拉伯");
        mGameTeams.add("俄罗斯VS沙特阿拉伯");
        mGameTeams.add("俄罗斯VS沙特阿拉伯");
        mGameTeams.add("俄罗斯VS沙特阿拉伯");
        mGameTeams.add("俄罗斯VS沙特阿拉伯");
        mGameTeams.add("俄罗斯VS沙特阿拉伯");
        mGameTeams.add("俄罗斯VS沙特阿拉伯");
        mGameTeams.add("俄罗斯VS沙特阿拉伯");
        mGameTeams.add("俄罗斯VS沙特阿拉伯");
        mGameTeams.add("俄罗斯VS沙特阿拉伯");
        mGameTeams.add("俄罗斯VS沙特阿拉伯");
        mGameTeams.add("俄罗斯VS沙特阿拉伯");
        mGameTeams.add("俄罗斯VS沙特阿拉伯");
        mGameTeams.add("俄罗斯VS沙特阿拉伯");
        mGameTeams.add("俄罗斯VS沙特阿拉伯");
        mGameTeams.add("俄罗斯VS沙特阿拉伯");
        mGameTeams.add("俄罗斯VS沙特阿拉伯");
        mGameTeams.add("俄罗斯VS沙特阿拉伯");
        mGameTeams.add("俄罗斯VS沙特阿拉伯");
        mGameTeams.add("俄罗斯VS沙特阿拉伯");
        mGameTeams.add("俄罗斯VS沙特阿拉伯");
        mGameTeams.add("俄罗斯VS沙特阿拉伯");
        mGameTeams.add("俄罗斯VS沙特阿拉伯");
        mGameTeams.add("俄罗斯VS沙特阿拉伯");
        mGameTeams.add("俄罗斯VS沙特阿拉伯");
        mGameTeams.add("俄罗斯VS沙特阿拉伯");
        mGameTeams.add("俄罗斯VS沙特阿拉伯");
        mGameTeams.add("俄罗斯VS沙特阿拉伯");
        mGameTeams.add("俄罗斯VS沙特阿拉伯");
        mGameTeams.add("俄罗斯VS沙特阿拉伯");
        mGameTeams.add("俄罗斯VS沙特阿拉伯");
        mGameTeams.add("俄罗斯VS沙特阿拉伯");
        mGameTeams.add("俄罗斯VS沙特阿拉伯");
        mGameTeams.add("俄罗斯VS沙特阿拉伯");
        mGameTeams.add("俄罗斯VS沙特阿拉伯");
        mGameTeams.add("俄罗斯VS沙特阿拉伯");
        mGameTeams.add("俄罗斯VS沙特阿拉伯");
        mGameTeams.add("俄罗斯VS沙特阿拉伯");
        mGameTeams.add("俄罗斯VS沙特阿拉伯");
        mGameTeams.add("俄罗斯VS沙特阿拉伯");
        mGameTeams.add("俄罗斯VS沙特阿拉伯");
        mGameTeams.add("俄罗斯VS沙特阿拉伯");
        mGameTeams.add("俄罗斯VS沙特阿拉伯");
        mGameTeams.add("俄罗斯VS沙特阿拉伯");
        mGameTeams.add("俄罗斯VS沙特阿拉伯");
        mGameTeams.add("俄罗斯VS沙特阿拉伯");
        mGameTeams.add("俄罗斯VS沙特阿拉伯");
        mGameTeams.add("俄罗斯VS沙特阿拉伯");
        return mGameTeams;
    }

    /**
     * 1-64场依次的比赛场地
     *
     * @return
     */
    public ArrayList<String> getGameSite() {
        mGameSite = new ArrayList<>();
        mGameSite.add("卢日尼基体育场，莫斯科");
        mGameSite.add("叶卡捷琳堡中央体育场，叶卡捷琳堡");
        mGameSite.add("圣彼得堡体育场，圣彼得堡");
        mGameSite.add("菲什特奥林匹克体育场，索契");
        mGameSite.add("喀山竞技场，喀山");
        mGameSite.add("斯巴达克体育场，莫斯科");
        mGameSite.add("萨兰斯克体育场，萨兰斯克");
        mGameSite.add("加里宁格勒体育场，加里宁格勒");
        mGameSite.add("萨马拉竞技场，萨马拉");
        mGameSite.add("卢日尼基体育场， 莫斯科");
        mGameSite.add("卢日尼基体育场");
        mGameSite.add("卢日尼基体育场");
        mGameSite.add("卢日尼基体育场");
        mGameSite.add("卢日尼基体育场");
        mGameSite.add("卢日尼基体育场");
        mGameSite.add("卢日尼基体育场");
        mGameSite.add("卢日尼基体育场");
        mGameSite.add("卢日尼基体育场");
        mGameSite.add("卢日尼基体育场");
        mGameSite.add("卢日尼基体育场");
        mGameSite.add("卢日尼基体育场");
        mGameSite.add("卢日尼基体育场");
        mGameSite.add("卢日尼基体育场");
        mGameSite.add("卢日尼基体育场");
        mGameSite.add("卢日尼基体育场");
        mGameSite.add("卢日尼基体育场");
        mGameSite.add("卢日尼基体育场");
        mGameSite.add("卢日尼基体育场");
        mGameSite.add("卢日尼基体育场");
        mGameSite.add("卢日尼基体育场");
        mGameSite.add("卢日尼基体育场");
        mGameSite.add("卢日尼基体育场");
        mGameSite.add("卢日尼基体育场");
        mGameSite.add("卢日尼基体育场");
        mGameSite.add("卢日尼基体育场");
        mGameSite.add("卢日尼基体育场");
        mGameSite.add("卢日尼基体育场");
        mGameSite.add("卢日尼基体育场");
        mGameSite.add("卢日尼基体育场");
        mGameSite.add("卢日尼基体育场");
        mGameSite.add("卢日尼基体育场");
        mGameSite.add("卢日尼基体育场");
        mGameSite.add("卢日尼基体育场");
        mGameSite.add("卢日尼基体育场");
        mGameSite.add("卢日尼基体育场");
        mGameSite.add("卢日尼基体育场");
        mGameSite.add("卢日尼基体育场");
        mGameSite.add("卢日尼基体育场");
        mGameSite.add("卢日尼基体育场");
        mGameSite.add("卢日尼基体育场");
        mGameSite.add("卢日尼基体育场");
        mGameSite.add("卢日尼基体育场");
        mGameSite.add("卢日尼基体育场");
        mGameSite.add("卢日尼基体育场");
        mGameSite.add("卢日尼基体育场");
        mGameSite.add("卢日尼基体育场");
        mGameSite.add("卢日尼基体育场");
        mGameSite.add("卢日尼基体育场");
        mGameSite.add("卢日尼基体育场");
        mGameSite.add("卢日尼基体育场");
        mGameSite.add("卢日尼基体育场");
        mGameSite.add("卢日尼基体育场");
        mGameSite.add("卢日尼基体育场");
        mGameSite.add("卢日尼基体育场");
        return mGameSite;
    }


}
