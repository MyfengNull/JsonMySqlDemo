package com.ysr.jsonmysqldemo.beans;

/**
 * Created by Administrator on 2016/8/25.
 */
public class DateBean {
    public String topicImg;
    public String videosource;
    public String mp4Hd_url;
    public String topicDesc;
    public String topicSid;
    public String cover;
    public String title;
    public int playCount;
    public String replyBoard;
    public String sectiontitle;
    public String replyid;
    public String description;
    public String mp4_url;
    public int length;
    public int playersize;
    public String m3u8Hd_url;
    public String vid;
    public String m3u8_url;
    public String ptime;
    public String topicName;

    public DateBean(String topicImg, String videosource,
                    String mp4Hd_url, String topicSid,
                    String topicDesc, String topicName,
                    String cover, String title,
                    String replyBoard, String sectiontitle,
                    String m3u8Hd_url, String vid,
                    String m3u8_url) {
        this.topicImg = topicImg;
        this.videosource = videosource;
        this.mp4Hd_url = mp4Hd_url;
        this.topicSid = topicSid;
        this.title = title;
        this.topicDesc = topicDesc;
        this.topicName = topicName;
        this.cover = cover;
        this.replyBoard = replyBoard;
        this.sectiontitle = sectiontitle;
        this.m3u8Hd_url = m3u8Hd_url;
        this.vid = vid;
        this.m3u8_url = m3u8_url;
    }
}
