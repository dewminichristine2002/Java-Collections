package set;

public class PersonModified2 implements Comparable{
    private int age;

    public PersonModified2(int age){
        this.age = age;
    }

    private int getAge() {
        return this.age;
    }

    /*this below method is a very important one..if we dont do this we will be getting the address stored in the list
    like this... Your age is :set.Person@2f4d3709
    The toString method is overridden to provide a string representation of the PersonModified object.
    Instead of printing the default memory address (like set.Person@2f4d3709), it returns the age as a string.
     */
    @Override
    public String toString(){
        return Integer.toString(this.age);

    }

    /*The equals method is overridden to compare two PersonModified objects based on their age attribute.
     It first checks if the provided object is an instance of PersonModified. If it is, it compares the age attributes of the two objects.
    This is essential for determining object equality in collections like HashSet
     */

    @Override
    public boolean equals(Object person){
        if (person instanceof PersonModified2){
            return (this.age == ((PersonModified2) person).getAge());
        }else{
            return false;
        }
    }

    /*The hashCode method is overridden to return a hash code based on the age attribute.
    This is crucial for the proper functioning of hash-based collections like HashMap and HashSet.
    If equals is overridden, hashCode should also be overridden to maintain
    the contract that equal objects must have the same hash code
     */
    @Override
    public int hashCode(){
        return this.age;
    }

    /*The compareTo method is implemented as part of the Comparable interface.
     This method allows PersonModified2 objects to be compared based on their age.
     It subtracts the age of the given PersonModified2 object from the age of the current object.
    If the result is positive, the current object is considered greater; if negative, it is considered smaller;
     if zero, they are considered equal.
     */

    @Override
    public int compareTo(Object person) {
        if(person != null){
            PersonModified2 personobg = (PersonModified2) person;
            return (this.getAge() - personobg.getAge());
            //return (personobg.getAge() - this.getAge()); this gives the descending order
        }
        else
            return 0;
    }
}
