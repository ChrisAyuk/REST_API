package service.rest.api.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

public class MutableLiveStream {
    
    private String id;
    private String title;
    private String description;
    private String url;
    private LocalDateTime startdate;
    private LocalDateTime enddate;

    public MutableLiveStream(){

    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    public LocalDateTime getStartdate() {
        return startdate;
    }
    public void setStartdate(LocalDateTime startdate) {
        this.startdate = startdate;
    }

    public LocalDateTime getEnddate() {
        return enddate;
    }
    public void setEnddate(LocalDateTime enddate) {
        this.enddate = enddate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MutableLiveStream)) return false;

        MutableLiveStream that = (MutableLiveStream) o;

        if (!getId().equals(that.getId())) return false;
        if (!getTitle().equals(that.getTitle())) return false;
        if (!getDescription().equals(that.getDescription())) return false;
        if (!getUrl().equals(that.getUrl())) return false;
        if (!getStartdate().equals(that.getStartdate())) return false;
        return getEnddate().equals(that.getEnddate());
    }

    @Override
    public int hashCode() {
        int result = getId().hashCode();
        result = 31 * result + getTitle().hashCode();
        result = 31 * result + getDescription().hashCode();
        result = 31 * result + getUrl().hashCode();
        result = 31 * result + getStartdate().hashCode();
        result = 31 * result + getEnddate().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "MutableLiveStream{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", url='" + url + '\'' +
                ", startdate=" + startdate +
                ", enddate=" + enddate +
                '}';
    }
}
