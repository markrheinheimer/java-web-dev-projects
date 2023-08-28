import java.util.ArrayList;

public class Course {
    private String courseTitle;
    private Double hoursInClass;
    private ArrayList<String> booksNeeded;

    public Course(String courseTitle, Double hoursInClass, ArrayList<String> booksNeeded) {
        this.courseTitle = courseTitle;
        this.hoursInClass = hoursInClass;
        this.booksNeeded = booksNeeded;
    }

    public String getCourseTitle() {
        return courseTitle;
    }
    public Double getHoursInClass() {
        return hoursInClass;
    }
    public ArrayList<String> getBooksNeeded() {
        return booksNeeded;
    }

    public void setCourseTitle (String aCourseTitle) {
        courseTitle = aCourseTitle;
    }
    public void setHoursInClass(Double aHoursInClass) {
        hoursInClass = aHoursInClass;
    }
    public void setBooksNeeded(ArrayList<String> aBooksNeeded) {
        booksNeeded = aBooksNeeded;
    }

}
