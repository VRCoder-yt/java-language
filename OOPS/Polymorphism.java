// Polymorphism

// Polymorphism is the ability to present the same interface for differing
// underlying forms (data types). With polymorphism, each of these classes
// will have different underlying data. Precisely, Poly means ‘many’ and
// morphism means ‘forms’.

// Types of Polymorphism IMP
// 1. Compile Time Polymorphism (Static)
// 2. Runtime Polymorphism (Dynamic)

// Let’s understand them one by one :
// Compile Time Polymorphism : The polymorphism which is implemented at
// the compile time is known as compile-time polymorphism. 

// Method Overloading

// Method Overloading : Method overloading is a technique which allows you
// to have more than one function with the same function name but with
// different functionality. Method overloading can be possible on the
// following basis:

// 1. The type of the parameters passed to the function.
// 2. The number of parameters passed to the function.

// Runtime Polymorphism : Runtime polymorphism is also known as dynamic
// polymorphism. Function overriding is an example of runtime
// polymorphism. Function overriding means when the child class contains
// the method which is already present in the parent class. Hence, the child
// class overrides the method of the parent class. In case of function
// overriding, parent and child classes both contain the same function with a
// different definition. The call to the function is determined at runtime is
// known as runtime polymorphism.

class School {
    String sn;
    int ns;

    public void printinfo(String sn) {
        System.out.println(sn);
    }

    public void printinfo(int ns) {
        System.out.println(ns);
    }

    public void printinfo(String sn, int ns) {
        System.out.println(sn + " " + ns);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        School s1 = new School();
        s1.sn = "cbdse";
        s1.ns = 1923;

        s1.printinfo(s1.ns);
    }
}