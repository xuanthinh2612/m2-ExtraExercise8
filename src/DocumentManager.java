import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DocumentManager {
    static Scanner scanner = new Scanner(System.in);
    static List<Document> documentsList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("1.Them tai lieu");
        System.out.println("2.Tim tai lieu");
        System.out.println("0.Exit");
        int choice = scanner.nextInt();
        while (true){
            switch (choice){
                case 1:
                    addNew();
                    break;
                case 2:
                    showInfo();
                    break;
                case 0:
                    System.exit(0);
            }
            System.out.println("Menu");
            System.out.println("1.Them tai lieu");
            System.out.println("2.Tim tai lieu");
            System.out.println("0.Exit");

            choice = scanner.nextInt();
        }
    }
    public static void addNew() {
        System.out.println("1.Them Sach\n2.Them tap chi\n3.Them Bao");
        int choice = scanner.nextInt();
        System.out.println("Ma tai lieu ");
        int documentId = scanner.nextInt();
        System.out.println("Nha xuat ban");
        scanner.nextLine();
        String publishingCompany = scanner.nextLine();
        System.out.println("So ban phat hanh");
        int releaseNumber = scanner.nextInt();

        switch (choice){
            case 1:
                System.out.println("Ten tac gia");
                scanner.nextLine();
                String author1 = scanner.nextLine();
                System.out.println("So Trang");
                int amountOfPage = scanner.nextInt();
                Book book = new Book(documentId,publishingCompany,releaseNumber,author1,amountOfPage);
                documentsList.add(book);
                break;
            case 2:
                System.out.println("Ma phat hanh");

                int releaseId = scanner.nextInt();
                System.out.println("Thang phat hanh");
                scanner.nextLine();
                String releasedMonth = scanner.nextLine();
                Magazines magazines = new Magazines(documentId,publishingCompany,releaseNumber,releaseId,releasedMonth);
                documentsList.add(magazines);
                break;
            case 3:
                System.out.println("Ngay phat hanh");
                scanner.nextLine();
                String releasedDay = scanner.nextLine();
                Newspaper newspaper = new Newspaper(documentId,publishingCompany,releaseNumber,releasedDay);
                documentsList.add(newspaper);
                break;


        }
    }
    public static void showInfo(){
        System.out.println("Nhap ma tai lieu");
        int documentId = scanner.nextInt();
        for (Document document: documentsList){
            if (document.getDocumentId()==documentId){
                System.out.println(document);
            }
        }
    }



}
