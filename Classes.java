class Calculator{
    int a;
    public int add(){
        System.out.println("in add");
        return 0;
    }
}


public class Classes {
    public static void main(String[] args){
        int n = 4;
        int m = 5;
        Calculator calc = new Calculator();
        int result = calc.add();
        System.out.println(result);
    }
}
