
public class SpiralMatrix {
    public static void printSM(int matrix[][]){
        int startRow=0;
        int startCol=0;
        int endCol = matrix[0].length-1;
        int endRow= matrix[1].length -1;
        while(startRow <= endRow && startCol<=endCol){
            // i-> row , j->coloumn
            //print top elements
            for(int j=startCol ; j<=endCol; j++){
                System.out.print(matrix[startRow][j]+ " ");
            }
            //print right elements
            for(int i=startRow+1 ; i<=endRow; i++){
                System.out.print(matrix[i][endCol]+ " ");
            }
            //print bottom elements
            for(int j=endCol-1 ;j>=startCol ; j--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+ " ");
            }
            //print left elements
            for(int i=endRow-1;i>=startRow+1 ; i--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+ " ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }
    public static void main(String[] args) {
        // for even matrix
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printSM(matrix);
        // for odd matrix
        System.out.println();
        int matrixodd[][] ={{1,2,3},{4,5,6},{7,8,9}};
        printSM(matrixodd);
    }
}
