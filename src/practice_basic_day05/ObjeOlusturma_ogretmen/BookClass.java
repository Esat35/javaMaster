package practice_basic_day05.ObjeOlusturma_ogretmen;

public class BookClass {

    String adı,yazarı;
    int yayınYılı;

    public BookClass() {
    }

    public BookClass(String adı, String yazarı) {
        this.adı = adı;
        this.yazarı = yazarı;
    }

    public BookClass(String adı, String yazarı, int yayınYılı) {
        this.adı = adı;
        this.yazarı = yazarı;
        this.yayınYılı = yayınYılı;
    }

public void display(){
    System.out.println("Kitap : "+adı+", Yazar : "+yazarı+", Yayın yılı : "+yayınYılı);
}
    public static void main(String[] args) {


        BookClass kitap1=new BookClass("Harry Poter","JK Rowling",2020);

kitap1.display();

        BookClass kitap2=new BookClass("Crime and Panishment","Dostoyevski");

        kitap2.display();
    }
}
