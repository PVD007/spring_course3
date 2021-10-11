package aop.Aspect;


import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LogginAspect {
//@Pointcut("execution(* aop.UniLibrary.*(..))")
//    private void allMethodsFromUniLibrary(){
//
//}
//    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUniLibrary(){
//
//    }
//    @Pointcut("allMethodsFromUniLibrary()&& !returnMagazineFromUniLibrary()")
//    private void allMethodExeptReturnMagazineFromLibrary(){
//
//    }
//    @Before("allMethodExeptReturnMagazineFromLibrary()")
//    public void beforeAllMethodExeptReturnMagazineFromLibrary(){
//        System.out.println("beforeAllMethodExeptReturnMagazineFromLibrary: Log #10");
//    }


//    @Pointcut("execution(* aop.UniLibrary.get*())")
//    private void allGetMethodsUniLibrary() {
//    }
//
//    @Before("allGetMethodsUniLibrary()")
//    public void beforeGetLogginAdvice() {
//        System.out.println("beforeGetLogginAdvice:  writing Log #1");
//
//    }
//
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    private void allReturnMethodsUniLibrary() {
//    }
//
//    @Before("allReturnMethodsUniLibrary()")
//    public void beforeReturnLogginAdvice() {
//        System.out.println("beforeReturnLogginAdvice:  writing Log #2");
//
//    }
//
//    @Pointcut("allGetMethodsUniLibrary()||allReturnMethodsUniLibrary()")
//    private void allGetAndReturnMethodsUniLibrary() {
//
//    }
//
//    @Before("allGetAndReturnMethodsUniLibrary()")
//    public void beforeGetAndReturnMethodsUniLibrary() {
//        System.out.println("beforeGetAndReturnMethodsUniLibrary: writing Log#3");
//    }

  @Before("aop.Aspect.MyPointCuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint){
      MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
      System.out.println("MethodSignature = " + methodSignature);
      System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
      System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
    System.out.println("methodSignature.getName() = " + methodSignature.getName());

if(methodSignature.getName().equals("addBook")){
  Object[] arguments = joinPoint.getArgs();
  for(Object obj:arguments){
    if(obj instanceof Book){
      Book myBook = (Book) obj;
      System.out.println("Информация о книге: название - "+myBook.getName()+
              ", автор - "+myBook.getAuthor()+", год издания - "+myBook.getYearOfPublication());
    }
    else if(obj instanceof String){
      System.out.println("книгу в библиотеку добавляет "+obj);
    }
  }

}

        System.out.println("beforeAddLoggingAdvice: логирование попитки poluceniya knigi/jurnal");
      System.out.println("____________________________________");

    }

}
