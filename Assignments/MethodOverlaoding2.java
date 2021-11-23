package Assignments;

public class MethodOverlaoding2 {

    public static void main(String[] args) {
        Parent obj1 = new Parent();
        obj1.addition(4,9);
        Child obj2 = new Child();
        obj2.addition("Its", "Okay");

    }
}

class Parent {
    public int addition(int a, int b) {
        int sum = a + b;
        System.out.println("You are in parent addition method");
        return sum;
    }
}

// Inherited class
class Child extends Parent {
    // This method overrides addition() method of Parent class
    public String addition(String a, String b) {
        String str3 =a + b;
        System.out.println("You are in child addition method");
            return str3;
    }
}


