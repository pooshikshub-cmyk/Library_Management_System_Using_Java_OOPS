public class Book {
    String title;
    String authName;
    Boolean isAvailable;

    public Book(String tit,String auth){
        this.title=tit;
        this.authName=auth;
        this.isAvailable=true;
    }

    public boolean BorrowBooks(){
        this.isAvailable=false;
        return isAvailable;
    }

    public boolean ReturnBooks(){
        this.isAvailable=true;
        return isAvailable;
    }
}
