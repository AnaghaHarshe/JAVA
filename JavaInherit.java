class Book
{
        String title;
        String author;  
        int numberOfPages;
        String ISBN;
   
        Book(String tit,String aut,int num)
        {
                title = tit;
                author = aut;
                numberOfPages = num;
                ISBN = "unknow";
        }
        Book(String tit,String aut,int num,String isbn)
        {
                title = tit;
                author = aut;
                numberOfPages = num;
                ISBN = isbn;
        }
}

class ScientificBook extends Book        
{
        String area;
        boolean proceeding = false;
        ScientificBook(String tit,String aut,int num,String isbn,String a)
        {
                super(tit,aut,num,isbn);
                area = a;
        }    
        public void DisplayBookInformation()
        {
                System.out.println("\n");
                System.out.println("****Scientific Book Information***");
                System.out.println("Title of theBook:"+title);
                System.out.println("Author of theBook:"+author);
                System.out.println("Number of pages in the Book:"+numberOfPages);
                System.out.println("ISBN number  of the Book:"+ISBN);
                System.out.println("Area of the Book:"+area);
                System.out.println("Whether this is from proceedings:"+proceeding);
        }
}

class ComicBook extends Book      
{
        String publisher;
        int price;
        ComicBook(String tit , String aut , int num , String isbn , String pb , int pr)
        {
                super(tit,aut,num,isbn);
                publisher=pb;
                price=pr;
        }
        public void DisplayBookInformation()
        {
                System.out.println("\n");
                System.out.println("***Comic Book Information***");
                System.out.println("Title of theBook:"+title);
                System.out.println("Author of theBook:"+author);
                System.out.println("Number of pages in the Book:"+numberOfPages);
                System.out.println("ISBN number  of the Book:"+ISBN);
                System.out.println("Publisher of the Book:"+publisher);
                System.out.println("Price of the Book:"+price);
        }
}

public class JavaInherit
{
        public static void main(String[] args)
        {
                System.out.print("\nProgram for Inheritance!");
                ScientificBook b=new ScientificBook("A Brief History of Time","Stephen Hawking",226,"0553380168","Cosmology");

                ComicBook c=new ComicBook("The Magical Journey of Harry Potter","Samy Carl",144,"9993108766","Samy Carl",6520);
                
                b.DisplayBookInformation();  

                c.DisplayBookInformation();