package CourseP5;

public class CouseDemo
{
    public static void main(String[] args)
    {
        Instructor myInstructor = new Instructor("Kramer", "Shawn", "RH3010");
        TextBook myTextBok = new TextBook("Starting Out with Java", "Gaddis", "Pearson");
        Course myCourse = new Course("Intro to Java", myInstructor, myTextBok);


        System.out.println(myCourse);
    }
}
