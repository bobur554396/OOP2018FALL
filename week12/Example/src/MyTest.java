import jdk.nashorn.internal.runtime.regexp.joni.constants.OPCode;

public class MyTest {

    static void f1(){
        Student s = new Student("Student 1", 18, Gender.MALE);
        System.out.println(s);
    }

    static void f2(){
        Operation op = Operation.TIMES;
        System.out.println(op.calculate(2, 3));
    }

    static void f3(){
        for(Operation op:Operation.values()){
            System.out.println(op.ordinal()+": "+op);
        }
        Operation op = Operation.TIMES;
        System.out.println(op == Operation.TIMES);
    }

    public static void main(String args[]){

        f3();

    }
}
