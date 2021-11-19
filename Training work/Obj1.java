public class Obj1 {
    public void doSomething(int VAL) {
        System.out.println("This is an integer");
    }
    public void doSomething(String VAL) {
        System.out.println("This is a string");
    }

    public static void main(String[] args) {
        Obj1 obj = new Obj1();
        obj.doSomething("e");
    }
}
