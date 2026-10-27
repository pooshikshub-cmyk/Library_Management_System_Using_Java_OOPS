import java.util.ArrayList;

///
public class Library {
    Book slot1;
    ArrayList<Book>Container;

    public Library(){
        this.Container=new ArrayList<>();
    }
    public void addBooks(Book b1){
        this.Container.add(b1);
    }

    public void displayBooks(){
        if(Container.isEmpty()){
            System.out.println("Sorry The Book Is Not Available In Our Library");
        }
        else{
            for(Book list:Container){
                System.out.println("Title : "+list.title+" Author : "+list.authName);
            }
        }
    }

    public void BorrowBook(String name){
        boolean found=false;
        for(Book list:Container){
            if(list.title.equalsIgnoreCase(name)){
                if (list.isAvailable) {
                    System.out.println(list.title + " Have Been Sucessfully Rented Thank You");
                    list.BorrowBooks();
                    found=true;
                    return;
                }
            }
        }
        if(!found){
            System.out.println("Sorry The Book Is Currently Not Available");
        }
    }

    public void ReturnBook(String name) {
        boolean found=false;
        for (Book list : Container) {
            if (list.title.equalsIgnoreCase(name)) {
                if (!list.isAvailable) {
                    System.out.println(list.title + " Have Been Sucessfully Returned Thank You");
                    list.ReturnBooks();
                    found=true;
                    return;
                }
            }

        }
        if(!found){
            System.out.println("Sorry The Book Not Belongs to Our Library");
        }
    }
}
