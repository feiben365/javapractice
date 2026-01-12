package CourseP4;

public class CourseDemo {
    public static void main(String[] args) {
        Instructor myInstructor = new Instructor(new Instructor("John Smith", "John", "Smith"));
        TextBook myTextBook = new TextBook(new TextBook("Java Programming", "Java", "Programming"));
        Course myCourse = new Course("Intro to Java", myInstructor, myTextBook);

        System.out.println(myCourse);
    }
}
