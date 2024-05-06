package org.sid.demospringcloudstreamskafka.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
@Data
public class PageEvent {
    private String name;
    private String user;
    private Date date;
    private long duration;

    public PageEvent() {

    }

    public PageEvent(String name, String user, Date date, long duration) {
        this.name = name;
        this.user = user;
        this.date = date;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "PageEvent{" +
                "name='" + name + '\'' +
                ", user='" + user + '\'' +
                ", date=" + date +
                ", duration=" + duration +
                '}';
    }
}

