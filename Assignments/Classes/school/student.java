package school; 

public class student {
    public String firstname;
    public String lastname;
    public int id;

    public student(String firstname, String lastname, int id){
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;    
    }
    public String getfullname(){
        return firstname + " " + lastname;
    }
    public String toString(){
        return "Name: " + getfullname() + "; id " + id + ";";
    }
}



