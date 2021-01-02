public class Document {
    private int documentId;
    private String publishingCompany;
    private int releaseNumber;

    public Document(int documentId, String publishingCompany, int releaseNumber) {
        this.documentId = documentId;
        this.publishingCompany = publishingCompany;
        this.releaseNumber = releaseNumber;
    }

    public int getDocumentId() {
        return documentId;
    }

    public void setDocumentId(int documentId) {
        this.documentId = documentId;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public int getReleaseNumber() {
        return releaseNumber;
    }

    public void setReleaseNumber(int releaseNumber) {
        this.releaseNumber = releaseNumber;
    }

    @Override
    public String toString() {
        return "Document{" +
                "documentId=" + documentId +
                ", publishedCompany='" + publishingCompany + '\'' +
                ", releaseNumber=" + releaseNumber +
                '}';
    }
}
