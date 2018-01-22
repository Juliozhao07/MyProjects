package eecs1022.lab1;

/**
 * Created by user on 1/22/18.
 */
public class PersonTester
{

    public static void main(String[] args){

        //this is the location where we can store the information anduse it to test the codes.
        //this Person in this tester is refering to the other Person class
        // the reason we do this is to Alocate space in the memory for a person object with input
        // declare  a variable P1 that stores the address of some person object
        Person p1 = new Person("Jim",80,1.85);
        Person p2 =  new Person("Jonas",85,1.76);

        Person p3 = new Person("Macreep", 80, 1.85);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        p3.setWeight(p3.getWeight() + 2.0);
        p2.setWeight(p2.getWeight() - 5);
        System.out.println(p2);
        System.out.println(p3);

    }

}
