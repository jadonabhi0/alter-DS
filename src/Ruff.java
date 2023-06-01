import java.util.*;

public class Ruff{
   static int cc=0;
    public static void generateParanthesis(int n, String str, int o, int c){
        if(n*2 == str.length()) {
            ++cc;
            System.out.println(str+" "+ cc);
            return;
        }
        if(o<n)generateParanthesis(n, str+"{", o+1, c);
        if (c < o)generateParanthesis(n, str+"}", o, c+1);
    }

    public static void main(String[] args) {

        generateParanthesis(5,"", 0, 0);


        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });

    }
}