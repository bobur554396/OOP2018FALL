import java.util.*;

public class MyTest {
    static void f1() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(10);
        l.add(1);

        System.out.println(l);

//        for(int i = 0; i < l.size(); i++){
//            System.out.println(l.get(i));
//        }

//        for (Integer i:l) {
//            System.out.println(i);
//        }

//        l.forEach((el) -> {
//            System.out.println(el);
//        });
    }

    static void f2() {
        ArrayList<Student> l = new ArrayList<Student>();

        Student s1 = new Student("s1");
        Student s2 = new Student("s2");
        l.add(s1);
        l.add(s2);
        l.add(new Student("s3_inner"));

        l.remove(s1);

//        Student arr[] = new Student[5];
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
    }

    static void f3() {
        ArrayList<Student> l = new ArrayList<Student>();

        Student s1 = new Student("s1");
        Student s2 = new Student("s2");
        l.add(s1);
        l.add(s2);
        l.add(new Student("s3"));

        Iterator<Student> it = l.iterator();
        Student s1_new = (Student) it.next();
        it.next();
        it.remove();
//        it.remove();
//        l.set(2, new Student("s3 updated"));
//        it.next();
//        it.remove();

//        while (it.hasNext()){
//            it.next();
//            it.remove();
////            Student s = (Student) it.next();
////            System.out.println(s);
//        }
        System.out.println(l);

    }

    static void f4() {
        ArrayList<Student> l = new ArrayList<Student>();

        Student s1 = new Student("s1");
        Student s2 = new Student("s2");
        l.add(s1);
        l.add(s2);
        l.add(new Student("s3"));

        ListIterator<Student> it = l.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next() + " " + it.nextIndex());
        }
    }

    static void f5() {
        ArrayList<String> l = new ArrayList<String>();
        l.add("1");
        l.add("2");
        l.add("3");

        Iterator<String> it = l.iterator();
        while (it.hasNext()) {
            String s = (String) it.next();
            if (s.equals("1")) {
                l.set(2, "3 changed");
            }
            System.out.println(s);
        }
    }

    static void f6() {
        Set<Integer> s = new HashSet<Integer>();
        s.add(10);
        s.add(2);
        s.add(4);
        s.add(2);
        s.add(20);
        s.add(20);
        s.add(200);

        System.out.println(s);
    }

    static void f7() {
        HashMap<String, Integer> m = new HashMap<String, Integer>();
        m.put("a", 1);
        m.put("b", 2);
        m.put("c", 3);

        System.out.println(m);
        System.out.println(m.keySet());
        System.out.println(m.values());

        for (Map.Entry<String, Integer> me : m.entrySet()) {
            System.out.println(me.getKey() + "=>" + me.getValue());
        }
    }

    static void f8(){
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(10);
        l.add(1);

        Collections.sort(l);

        System.out.println(l);
    }

    public static void main(String args[]) {
        f8();
    }
}
