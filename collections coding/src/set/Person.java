package set;

public class Person {

    private int age;

    public Person(int age){
        this.age = age;
    }
//this method is a very important one..if we dont do this we will be getting the address stored in the list
    //like this... Your age is :set.Person@2f4d3709
    @Override
    public String toString(){
        return Integer.toString(this.age);

    }
}
