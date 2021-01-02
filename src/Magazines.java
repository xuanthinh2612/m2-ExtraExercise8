public class Magazines extends Document {
    private int releaseId;
    private String releasedMonth;

    public Magazines(int documentId, String publishingCompany, int releaseNumber, int releaseId, String releasedDate) {
        super(documentId, publishingCompany, releaseNumber);
        this.releaseId = releaseId;
        this.releasedMonth = releasedDate;
    }

    public int getReleaseId() {
        return releaseId;
    }

    public void setReleaseId(int releaseId) {
        this.releaseId = releaseId;
    }

    public String getReleasedMonth() {
        return releasedMonth;
    }

    public void setReleasedMonth(String releasedMonth) {
        this.releasedMonth = releasedMonth;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Magazines{" +
                "releaseId=" + releaseId +
                ", releasedDate='" + releasedMonth + '\'' +
                '}';
    }
}
