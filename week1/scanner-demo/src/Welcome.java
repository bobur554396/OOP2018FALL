import java.util.Scanner;

public class Welcome {
    public static void main(String []args){
        Scanner reader = new Scanner(System.in);

        int n1 = reader.nextInt();
        int n2 = reader.nextInt();

        System.out.print(n1 + n2);
    }
}
