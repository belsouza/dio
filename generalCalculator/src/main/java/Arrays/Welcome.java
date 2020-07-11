package Arrays;

public class Welcome {

    public static void main(String[] args){

        int[] foo = new int[5];
        int[] baa = {2, 3, 5, 7, 9};
        int[][] james = {{2} , {5,3,8}, {7,9,5}} ;

        for(int i = 0; i < james.length; i++){
            for(int j = 0; j < james[i].length; j++){
                System.out.println(james[i][j]);
            }
        }

    }
}
