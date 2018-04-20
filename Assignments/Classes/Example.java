import utils.*;

class Example {
    public static void main(String[] args) {
        // sentenceExample();
        // matrixTest1();
        // matrixTest2();
        // matrixTest3();
        matrixTest4();
    }

    // public static void sentenceExample() {
    //     String sentence = SentenceUtil.generateSentence();
    //     System.out.println(sentence);
    // }

    // public static void matrixTest1(){
    //     int[][] newMatrix = MatrixUtil.generateRandomMatrix(3,3);
    //     MatrixUtil.printMatrix(newMatrix);
    // }

    // public static void matrixTest2(){
    //     int[][] newMatrix = MatrixUtil.generateRandomMatrix(4,4,1234);
    //     MatrixUtil.printMatrix(newMatrix);
    // }

    // public static void matrixTest3(){
    //     int[][] newMatrix = MatrixUtil.generateRandomMatrix(4,4,1234);
    //     int[][] reverseMatrix = MatrixUtil.reverseMatrix(newMatrix);
    //     MatrixUtil.printMatrix(reverseMatrix);
    // }

    public static void matrixTest4(){
        int[][] newMatrix = MatrixUtil.generateRandomMatrix(10,10);
        MatrixUtil.printMatrix(newMatrix);
        System.out.print("\n \n \n");
        int[][] reverseOddRowMatrix = newMatrix;
        for(int i = 0; i < reverseOddRowMatrix.length; i++){
            int[] row = reverseOddRowMatrix[i];
            if(i % 2 == 1){
                int[]reversedArray = MatrixUtil.reverseArray(row);
                reverseOddRowMatrix[i] = reversedArray;
            } 
                if(i == reverseOddRowMatrix.length - 1){
            MatrixUtil.printMatrix(reverseOddRowMatrix);
            }
        }
    }
}
