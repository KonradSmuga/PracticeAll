package Books;


public class Books {

    private int yearOfRelease;
    private String name;
    private String author;

    public Books(int yearOfRelease, String name, String author) {
        this.yearOfRelease = yearOfRelease;
        this.name = name;
        this.author = author;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Books books = (Books) o;

        if (yearOfRelease != books.yearOfRelease) return false;
        if (name != null ? !name.equals(books.name) : books.name != null) return false;
        return author != null ? author.equals(books.author) : books.author == null;
    }

    @Override
    public int hashCode() {
        int result = yearOfRelease;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        return result;
    }


    @Override
    public String toString() {
        return "Books{" +
                "yearOfRelease=" + yearOfRelease +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
