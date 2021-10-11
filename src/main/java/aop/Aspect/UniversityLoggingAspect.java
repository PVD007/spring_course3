package aop.Aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UniversityLoggingAspect {
//   @Before("execution(* getStudent())")
//        public void beforeGetStudentsLoggingAdvice(){
//            System.out.println("beforeGetStudentsLoggingAdvice: логируем получение "+
//                    "списка студентов перед методом getStudents");
//        }
//    @AfterReturning("execution(* getStudent())")
//    public void afterReturningGetStudentsLoggingAdvice(){
//        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение "+
//                "списка студентов после работы метода getStudents");
//    }
    @AfterThrowing("execution(* getStudent() )")
    public void afterThrowingGetStudentsLoggingAdvice(){
        System.out.println("afterThrowingGetStudentsLoggingAdvice: логируем выброс исключения");
    }
    }

