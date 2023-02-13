package dev.Marcin.learnspring;

public class Course {
    public double id;
    public String author;
    public String title;

    public double getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public Course(double id, String author, String title) {
        this.id = id;
        this.author = author;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
