public class ForEachLoop {
    //foreach loop only works on array type of data
    public static void main(String[] args){
        int[] n = new int[4];
        n[0]=4;
        n[1]=5;
        n[2]=6;
        n[3]=7;

//        for(int i =0; i<n.length; i ++){
//            System.out.println(n[i]);
//        }
        // the below is the for each loop
        for(int i: n )
        {
            System.out.println(i);
        }
    }
}
