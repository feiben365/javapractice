package CourseP7;

public class TextBook
{
    public String title;
    public String author;
    public String publisher;

    public TextBook(String textTitle, String auth, String pub)
    {
        title = textTitle;
        author = auth;
        publisher = pub;
    }

    public TextBook(TextBook object2)
    {
        title = object2.title;
        author = object2.author;
        publisher = object2.publisher;
    }

    public void set(String textTitle, String auth, String pub)
    {
        title = textTitle;
        author = auth;
        publisher = pub;
    }

    public String toString()
    {
        String str = "Title: " + title +
            "\nAuthor: " + author +
            "\nPublisher: " + publisher;

        return str;
    }
}


