// An array with multiple arrays together
public class MultiDimensionalArray {
    public static void main(String[] args){
        // this is represented by [][]
        // this is like a matrix of 3x4 dimension
        int[][] a = new int[3][4];
        // to get random values we use for loop and random function
        for(int i = 0 ; i<3;i++){
            for(int j =0;j<4;j++){
                a[i][j] = (int)(Math.random() * 100);
            }
        }

        for(int i = 0 ; i<3;i++){
            for(int j =0;j<4;j++){
                System.out.print(a[i][j]+ " ");
            }
            //to represent as a matrix by printing in new line
            System.out.println();
        }

        // to use an enhanced for loop which gives the same result as above
        for(int m[] : a){
            for(int n: m){
                System.out.print(n + " ");
            }
            System.out.println();
        }

    }
}
