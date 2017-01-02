package info.androidhive.recyclerview;

/**
 * Created by Lincoln on 15/01/16.
 */
public class Lesson {
    private String title, year;

    public Lesson(String title, String year) {
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

}
