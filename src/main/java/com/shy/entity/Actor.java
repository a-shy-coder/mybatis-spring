package com.shy.entity;

import org.apache.ibatis.annotations.Param;

/**
 * 演员实体类
 */
public class Actor {

    // 演员编号——（唯一）
    private int ActorId;
    // 演员中文名
    private String ActorChineseName;
    // 演员原名
    private String ActorOriginName;
    //演员信息
    private String ActorInfo;
    //演员性别
    private String ActorGender;
    //演员图片
    private String ActorImg;

    // 构造器
    public Actor(){
        System.out.println("Actor.Actor");
    }
    public Actor(@Param("ActorId") int ActorId, @Param("ActorChineseName") String ActorChineseName, @Param("ActorOriginName") String ActorOriginName, @Param("ActorInfo") String ActorInfo, @Param("ActorGender") String ActorGender, @Param("ActorImg") String ActorImg){
        this.ActorId = ActorId;
        this.ActorChineseName = ActorChineseName;
        this.ActorOriginName = ActorOriginName;
        this.ActorInfo = ActorInfo;
        this.ActorGender = ActorGender;
        this.ActorImg = ActorImg;

    }


    public Actor(String ActorChineseName, String ActorOriginName, String ActorInfo, String ActorGender, String ActorImg){
        this.ActorChineseName = ActorChineseName;
        this.ActorOriginName = ActorOriginName;
        this.ActorInfo = ActorInfo;
        this.ActorGender = ActorGender;
        this.ActorImg = ActorImg;

    }


//     getter setter
    public int getActorId() {
        return ActorId;
    }

    public void setActorId(int actorId) {
        ActorId = actorId;
    }

    public String getActorChineseName() {
        return ActorChineseName;
    }

    public void setActorChineseName(String actorChineseName) {
        ActorChineseName = actorChineseName;
    }

    public String getActorOriginName() {
        return ActorOriginName;
    }

    public void setActorOriginName(String actorOriginName) {
        ActorOriginName = actorOriginName;
    }

    public String getActorInfo() {
        return ActorInfo;
    }

    public void setActorInfo(String actorInfo) {
        ActorInfo = actorInfo;
    }

    public String getActorGender() {
        return ActorGender;
    }

    public void setActorGender(String actorGender) {
        ActorGender = actorGender;
    }

    public String getActorImg() {
        return ActorImg;
    }

    public void setActorImg(String actorImg) {
        ActorImg = actorImg;
    }


    @Override
    public String toString() {
        return "Actor{" +
                "ActorId=" + ActorId +
                ", ActorChineseName='" + ActorChineseName + '\'' +
                ", ActorOriginName='" + ActorOriginName + '\'' +
                ", ActorGender='" + ActorGender + '\'' +
                '}';
    }
}
