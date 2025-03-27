class Calci{
    //int a;
    public int add(int n1, int m1){
        int r = n1 + m1;
        return r;
    }
}

public class Classes2 {
    public static void main(String[] args){
        int n = 4;
        int m = 5;
        Calci cal = new Calci();
        int result = cal.add(n,m);
        System.out.println(result);
    }
}
