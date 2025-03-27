class InheritanceCalc {
    public int add(int n1, int n2){
        return n1 + n2;
    }
    public int sub(int n1, int n2){
        return n1 - n2;
    }

}

class InheritanceAdvCalc extends InheritanceCalc{
    public int multi(int n1, int n2){
        return n1*n2;
    }
    public int div(int n1, int n2){
        return n1/n2;
    }
}

class VeryAdvCalc extends InheritanceAdvCalc{
    public double power(int n1, int n2){
        return Math.pow(n1, n2);
    }
}

public class Inheritance {
    public static void main(String[] args){
        VeryAdvCalc obj = new VeryAdvCalc();
        int r1 = obj.add(4,3);
        int r2 = obj.sub(7,5);
        int r3 = obj.multi(4,3);
        int r4 = obj.div(4,2);
        double r5 = obj.power(4,3);
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " +r5);
    }
}
