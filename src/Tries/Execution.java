package Tries;

public class Execution {

    public static void main(String[] args) {

        Tries tr = new Tries();
        tr.insert("Abhishek");
        tr.insert("Abhi");
        tr.insert("Aman");
        tr.insert("Shikha");
        System.out.println(tr.search(""));
        System.out.println(tr.startsWith("Abhis"));
    }

}
