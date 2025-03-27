enum Systems{
    // the below are the constructors with values
    Macbook(1400), XPS(700), Surface(1000), Dell(900);
    //whatever the price it wil be stord in below
    int price;
    private Systems(int price){
        this.price=price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
public class EnumClass {
    public static void main(String[] args)
    {
//        Systems sys = Systems.Macbook;
//        System.out.println(sys + " : " + sys.getPrice());
        for(Systems sys : Systems.values()){
            System.out.println(sys + " : " + sys.getPrice());
        }
    }
}
