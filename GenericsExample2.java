import java.util.ArrayList;

//<T> means any type of data
class GenericsEx<T>
{
    T obj;
    GenericsEx(T obj)
    {
        this.obj = obj;
    }
    public void disp()
    {
        System.out.println("Type of data passed here T: " + obj.getClass().getName());
    }
    public T getObj(){
        return obj;
    }
}

public class GenericsExample2 {
    public static void main(String[] args) {
        GenericsEx<Integer> ge = new GenericsEx<>(10);
        ge.disp();
        System.out.println(ge.getObj());

        GenericsEx<String> ge2 = new GenericsEx<>("JAVA");
        ge2.disp();
        System.out.println(ge2.getObj());
    }
}
