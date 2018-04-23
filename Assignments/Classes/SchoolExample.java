import school.*;

class SchoolExample{
    public static void main(String[] args) {

    student jd = new student("John","Doe", 1234);
    String fullname = jd.getfullname();
    System.out.println(fullname);
    System.out.println(jd.toString());
    course cs = new course("Computer Science","Cs101","Mr,Merrell","B19");
    System.out.println(cs.toString());
    addCourse(cs);
    printCourses();
    }
}



