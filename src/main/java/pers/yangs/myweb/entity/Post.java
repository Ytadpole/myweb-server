package pers.yangs.myweb.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author yangs
 * @since 2019-01-02
 */
public class Post implements Serializable {

    private static final long serialVersionUID = 1L;

    private String title;

    private String brief;

    private String content;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Post{" +
        "title=" + title +
        ", brief=" + brief +
        ", content=" + content +
        "}";
    }
}
