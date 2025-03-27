public class Jagged3DArray {
    public static void main(String[] args){
        // In a multidimensional array int[3][4], every row cannot be in same size. It can be int[3][]. An array can be
        // of different size of elements
        //int[][] num = new int[4][]; is jagged
        //3x3 dimension can be represented as int[][][] a = new int[3][4][5];
        int[][] a = new int[3][];

        // to specify the number of elements in the empty value
        a[0]= new int[3];
        a[1] = new int[4];
        a[2] = new int[2];

        for(int i = 0 ; i<3;i++){
            for(int j =0;j< a[i].length;j++){
                a[i][j] = (int)(Math.random() * 100);
            }
        }

        for(int i = 0 ; i<3;i++){
            for(int j =0;j< a[i].length;j++){
                System.out.print(a[i][j]+ " ");
            }
            //to represent as a matrix by printing in new line
            System.out.println();
        }

        // to use an enhanced for loop which gives the same result as above and does not need to mention length
        for(int m[] : a){
            for(int n: m){
                System.out.print(n + " ");
            }
            System.out.println();
        }

    }
}
