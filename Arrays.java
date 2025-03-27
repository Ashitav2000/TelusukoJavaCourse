public class Arrays {
    public static void main(String[] args){
        //defining an array can either in int a[] = (1,2,3,4} or like below
        int[] a = {1,2,3,4};
        //other way of defining an array without values is dynamic int a[] = new int[4]; this array contains 4 empty values

        // cannot give System.out.println(a[]) or System.out.println(a)- this gives a value which is not the initialized one
        //to change the 3rd value
        a[2] = 6;
        System.out.println(a[0]);
        System.out.println(a[2]);

        // to get all the values we use for loop and i=0 is because the location starts at 0th position
        for(int i = 0;i<4;i++){
            System.out.println(a[i]);
        }
    }
}
