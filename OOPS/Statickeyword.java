class Student{
    String name;
    static String school;
    public static void changeSchool(){
        school="newSchool";
    }
}
public class StaticKeyword{
    public static void main(String args[]){
        Student.school = "MWPS";
        Student student1 = new Student();
        student1.name = "Ms";
        Student.changeSchool();
        System.out.println(Student.school);
    }
}