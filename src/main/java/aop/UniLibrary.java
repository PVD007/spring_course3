package aop;


import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
    public void getBook(){
        System.out.println("Мы берем книгу из Unilibrary");
        System.out.println("____________________________________");
    }
    public void returnBook(){
        System.out.println("Мы возвращаем книгу в Unilibrary  ");
        System.out.println("____________________________________");

    }
    public void addBook(String person_name, Book book){
        System.out.println("Мы добавляем книгу в Unilibrary  ");
        System.out.println("____________________________________");

    }
    public void getMagazine(){
        System.out.println("Мы берем журнал из Unilibrary  ");
        System.out.println("____________________________________");
    }
    public void returnMagazine(){
        System.out.println("Мы возвращаем журнал в Unilibrary  ");
        System.out.println("____________________________________");

    }
    public void addMagazine(){
        System.out.println("Мы добавляем журнал в Unilibrary  ");
        System.out.println("____________________________________");

    }
}
