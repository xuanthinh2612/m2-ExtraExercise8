public class Newspaper extends Document {
    private String releasedDay;

    public Newspaper(int documentId, String publishingCompany, int releaseNumber, String releasedDay) {
        super(documentId, publishingCompany, releaseNumber);
        this.releasedDay = releasedDay;
    }

    public String getReleasedDay() {
        return releasedDay;
    }

    public void setReleasedDay(String releasedDay) {
        this.releasedDay = releasedDay;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Newspaper{" +
                "releasedDay='" + releasedDay + '\'' +
                '}';
    }
}
