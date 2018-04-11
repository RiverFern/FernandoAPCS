class twoDarrays {
    public static void main(String[] args) {
    
        //Example - Contents of a 3x3 array of zeros
        //[0,0,0]
        //[0,0,0]
        //[0,0,0]

        // int[][] arr1 = new int[3][3];
        // for(int i = 0; i < arr1.length; i++) {
        //     for(int j = 0; j < arr1[i].length; j++) {
        //         arr1[i][j] = (i * 2) * (j * 2);
        //     }
            //[0,0,0]
            //[0,4,8]
            //[0,8,16]
        // }
        // int[][] arr2 = new int[3][3];
        // for(int i = 0; i < arr2.length; i++) {
        //     for(int j = 0; j < arr2[i].length; j++) {
        //         arr2[i][j] = arr1[i][j] * arr1[i][j];
        //         System.out.print(arr2[i][j] + ", ");                
        //     }
            //[0,0,0]
            //[0,16,64]
            //[0,64,256]
        // }
        // int[][] arr3 = new int[5][5];
        // int num = 1;
        // for(int i = 0; i < arr3.length; i++) {
        //     for(int j = 0; j < arr3[i].length; j++) {
        //         arr3[i][j] = num; 
        //         num *= 2;
        //         //System.out.print(arr3[i][j] + ", ");

        //     }
            //[1,2,4,8,16]
            //[32,64,128,256,512]
            //[1024,2048,4096,8192]
            //[]
            //[]
        
        // }
        // int[][] arr4 = new int[4][4];
        // int num1 = 1;
        // for(int i = 0; i < arr4.length; i++) {
        //     for(int j = 0; j < arr4[i].length; j++) {
        //         arr4[i][j] = num1;
        //         num1 *= 3;
        //         //System.out.print(arr4[i][j] + ", ");
        //     }
        // }
        
        // int[][] arr5 = new int[5][5];
        // System.out.println();
        // for(int i = 0; i < arr5.length; i++) {
        //     for(int j = 0; j < arr5[i].length; j++) {
        //         arr5[i][j] = (i * (-5)) - (j + 1);
        //         System.out.print(arr5[i][j] + ", ");
        //     }
        // }

        int[][] mat = new int [3][3];
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                mat[i][j] = (i * 3) + (j + 1);
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        reverseMatrix(mat);
   }
  
    public static int[][] reverseMatrix(int[][] mat){
        int[][] result = mat;
        for(int i = 0; i < mat.length; i++){
            int[] row = mat[i];
            System.out.println(row[i]);
            for(int j = 0; j < mat[i].length; j++){
            }
        }
        return result;
    }
}
