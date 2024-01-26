package extra_crawiling.sec01_human_edu;

public class Course {
    private String place;
    private String title;
    private String desc;

    public Course(String place, String title, String desc) {
        this.place = place;
        this.title = title;
        this.desc = desc;
    }

    public Course() {
    }

    @Override
    public String toString() {
        return String.format("[[%s]] - %s\n\t\t%s", place, title, desc);
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
