package com.soft1611.jianshu.model;

import java.util.Date;
import javax.persistence.*;

public class Article {
    /**
     * 作者id
     */
    @Id
    @Column(name = "article_id")
    private Integer articleId;

    private Integer comments;

    private Integer likes;

    private String summary;

    private String thumbnail;

    private String title;

    @Column(name = "write_time")
    private Date writeTime;

    @Column(name = "user_id")
    private Integer userId;

    /**
     * 获取作者id
     *
     * @return article_id - 作者id
     */
    public Integer getArticleId() {
        return articleId;
    }

    /**
     * 设置作者id
     *
     * @param articleId 作者id
     */
    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    /**
     * @return comments
     */
    public Integer getComments() {
        return comments;
    }

    /**
     * @param comments
     */
    public void setComments(Integer comments) {
        this.comments = comments;
    }

    /**
     * @return likes
     */
    public Integer getLikes() {
        return likes;
    }

    /**
     * @param likes
     */
    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    /**
     * @return summary
     */
    public String getSummary() {
        return summary;
    }

    /**
     * @param summary
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * @return thumbnail
     */
    public String getThumbnail() {
        return thumbnail;
    }

    /**
     * @param thumbnail
     */
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return write_time
     */
    public Date getWriteTime() {
        return writeTime;
    }

    /**
     * @param writeTime
     */
    public void setWriteTime(Date writeTime) {
        this.writeTime = writeTime;
    }

    /**
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}