package aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary{

    public void getBook(String bookName){
    System.out.println("Mi berem knigu iz SchoolLibrary");
}

}
