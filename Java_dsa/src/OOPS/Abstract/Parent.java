package OOPS.Abstract;

// abstract means child class needs to override the functions to be legal
// if the class has even 1 abstract method it needs to be abstract too
// abstract classes cannot have objects, so making constructor is not very reasonable,
// child class can either 'this.age' or 'super(age)'
// constructor cannot be abstract since child cannot override the constructor of parent class
// static abstract function is not allowed since static means specific to class, child cannot override it
// cannot have final abstract class since you want abstract methods to be inherited but the class is final so cannot have children

public abstract class Parent {
    int age = 0;
    abstract void career();

    // need to make constructors in child classes too having function super(age) in them
//    Parent(int age)
//    {
//        this.age = age;
//    }

}
