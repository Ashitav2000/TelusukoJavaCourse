enum STatus{
    Running, Failed, Pending, Success;
}

public class EnumSwitch {
    public static void main(String[] args){
        STatus ss = STatus.Running;
        switch (ss){
            case Pending -> {
                System.out.println("please wait");
                break;
            }
            case Failed -> {
                System.out.println("try again");
                break;
            }
            case Running -> {
                System.out.println("all good");
                break;
            }
            default -> {
                System.out.println("Done");
                break;
            }
        }

    }
}
