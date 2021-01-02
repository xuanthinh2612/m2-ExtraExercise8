public class Book extends Document {
    private String author;
    private int amountOfPage;

    public Book(int documentId, String publishingCompany, int releaseNumber, String author1, int amountOfPage) {
        super(documentId, publishingCompany, releaseNumber);
        this.author = author1;
        this.amountOfPage = amountOfPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAmountOfPage() {
        return amountOfPage;
    }

    public void setAmountOfPage(int amountOfPage) {
        this.amountOfPage = amountOfPage;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Book{" +
                "author='" + author + '\'' +
                ", amountOfPage=" + amountOfPage +
                '}';
    }
}
