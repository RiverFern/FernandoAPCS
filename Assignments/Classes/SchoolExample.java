import school.*;

class SchoolExample{
    public static void main(String[] args) {

    student jd = new student("John","Doe", 1234);
    String fullname = jd.getfullname();
    System.out.println(fullname);
    System.out.println(jd.toString());
    }
}



