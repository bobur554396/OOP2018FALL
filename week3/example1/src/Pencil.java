public class Pencil {
    public String color = "red";
    public static int ID = 0;

    public Pencil(){
        ID++;
    }

    public Pencil(String color){
        this();
        this.color = color;
    }

    public void showID(){
        System.out.println(this.color);
    }
}

