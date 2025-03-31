package set;

public class PersonModified {

    private int age;

    public PersonModified(int age){
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
//what ever that should be returned when the objected is printed should be given here
    
    /*The equals method is overridden to compare two PersonModified objects based on their age attribute.
     It first checks if the provided object is an instance of PersonModified. If it is, it compares the age attributes of the two objects.
    This is essential for determining object equality in collections like HashSet
     */

    @Override
    public boolean equals(Object person){
        if (person instanceof PersonModified){
            return (this.age == ((PersonModified) person).getAge());
        }else{
            return false;
        }
    }

    /*The hashCode method is overridden to return a hash code based on the age attribute.
    when this is done same values cannot return
    This is crucial for the proper functioning of hash-based collections like HashMap and HashSet.
    If equals is overridden, hashCode should also be overridden to maintain
    the contract that equal objects must have the same hash code
     */
    @Override
    public int hashCode(){
        return this.age;
    }

}
