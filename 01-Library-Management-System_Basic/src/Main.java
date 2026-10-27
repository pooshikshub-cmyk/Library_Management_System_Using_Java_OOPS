import java.sql.SQLOutput;
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("If You Want to Add Books to The Library Press 1");
        System.out.println("If You Want To Access Library to Return or Borrow Book Press 2");
        boolean keepRunning=true;
        Library lbr=new Library();
        while(keepRunning) {
            int choice=s.nextInt();
            s.nextLine();
            if (choice == 1) {
                System.out.println("Our Library Welcomes You Dear Book Publisher");
                System.out.println("Kindly Enter The Title Of The Book");
                String title = s.nextLine();
                System.out.println("Kindly Enter The Author Name");
                String author = s.nextLine();

                Book obj = new Book(title, author);
                lbr.addBooks(obj);
                System.out.println("Your Book Has Been Successfully Published");
            } else if (choice == 2) {
                System.out.println("Kindly Press 4 To See Available Books");
                System.out.println("Kindly Press 5 To Borrow Books");
                System.out.println("Kindly Press 6 To Return Books");
                int user = s.nextInt();
                s.nextLine();
                if (user == 4) {
                    System.out.println("The Available Books In The Library Is");
                    lbr.displayBooks();
                } else if(user==5) {
                    System.out.println("Kindly enter the title of book to borrow");
                    lbr.BorrowBook(s.nextLine());
                } else if (user==6) {
                    System.out.println("Kindly enter the title of book to return");
                    lbr.ReturnBook(s.nextLine());
                }
                else {
                    System.out.println("Sorry Invalid Input");
                }

            } else {
                System.out.println("Sorry Dear User Invalid Choice");
            }
        }
    }
}