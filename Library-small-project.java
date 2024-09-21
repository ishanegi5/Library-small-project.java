class Library{
    String []books;
    int noofbooks;
    Library(){
        this.books=new String[100];
        this.noofbooks=0;
        System.out.println("the added books are:- ");
    }
    public void addbook(String book){
       
        this.books[noofbooks]=book;
        noofbooks++;
       
         System.out.println(noofbooks+". "+book+" has been added!");
    }
   
    public void issuebooks(String issuebook){
       System.out.println("Issued book: ");
        for (int i=0;i<this.books.length;i++) {
            if(this.books[i]==issuebook){
                System.out.println("* "+issuebook+" has been issued!");
                this.books[i]=null;
            }
        }
    }
    public void returnbook(String book){
        System.out.println("Returned book: ");
        addbook(book);
    }
    public void showavailablebook(){
        System.out.println("Availabe books are: ");
        for(String book: this.books){
            if(book==null){
                continue;
            }
           
            System.out.println("* "+book);
        }
    }
}
public class Main{
    public static void main(String[]args){
        Library CL=new Library();
        CL.addbook("data structures");
        CL.addbook("c language");
        CL.addbook("java");
        CL.addbook("python");
        CL.addbook("mongo DB");
        CL.addbook("java script");
        CL.addbook("html");
        CL.addbook("css");
        CL.addbook("fundamentals of cs");
        CL.addbook("digital electronics");
        CL.showavailablebook();
        CL.issuebooks("mongo DB");
        CL.issuebooks("python");
        CL.issuebooks("data structures");
        CL.returnbook("mongo DB");
        CL.returnbook("python");
        CL.showavailablebook();
       
    }
}