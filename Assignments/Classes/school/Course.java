package school;
import java.util.*;

public class course{
    public String courseName;
    public String courseId;
    public String teacherName;
    public String room;

    public ArrayList<String> courses = new ArrayList<String>();

    public course(String courseName, String courseId, String teacherName, String room){
        this.courseName = courseName;
        this.courseId = courseId;
        this.teacherName = teacherName;
        this.room = room;
    }

    public String toString(){
        return "Course Name: " + courseName + 
               "; Course ID: " + courseId + 
               "; Teacher Name: " + teacherName + 
               "; Room: " + room;
    }

    public void addCourse(String course){
        courses.add(course);
    }

    public void printCourses(){
        for(int i = 0; i < courses.size(); i++){
            System.out.println("Course: " + courses.get(i));
        }
    }
}

