package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("personBean")
public class Person {
    private Pet pet;
    private String surname;
    private int age;

/*@Autowired
    public Person(@Qualifier("catBean") Pet pet) {
        System.out.println("Person bean is been created");
    this.pet=pet;
    }*/
public Person( Pet pet) {
    System.out.println("Person bean is been created");
    this.pet = pet;
}
//public Person() {
//    System.out.println("Person bean is been created");
//
//}

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person: Set age");
        this.age = age;
    }

    public String getSurname() {

        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person: Set surname");
    this.surname = surname;
    }

    public Pet getPet() {
        return pet;
    }
@Autowired
    public void setPet(Pet pet) {
        System.out.println("Class Person: SetPet");
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Hello my lovely pet");
        pet.say();


    }

}
