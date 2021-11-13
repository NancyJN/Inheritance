public class Demo
{
    public static void main(String[] args)
    {
       // Person p = new Person();
        Student s = new Student();

    }

}

class Person
{
String FirstName;
String LastName;

    public Person() {
        System.out.println("Person class constructor called");
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void pat(){
        System.out.println("Person is eating");
    }
}

class Student extends Person {
    String schoolName;

    public Student()
    {
        System.out.println("Student class constructor called");

    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
    public void study (){
        System.out.println("student is studying");
    }
}
