package CourseP3;

public class CourseDemo
{
    public static void main(String[] args)
    {
        Instructor myInstructor = new Instructor("John Smith", "John", "Smith");
        TextBook myTextBook = new TextBook("Java Programming", "Java", "Programming");
        Course myCourse = new Course("Java Programming", myInstructor, myTextBook);

        System.out.println(myCourse);
    }
}
