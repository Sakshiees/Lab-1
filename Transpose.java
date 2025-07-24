
public class Transpose
{
    
    public static void main(String[] args)
    {
        int[][] matrix=
        {
            {2,3,4},{6,7,8},{1,2,3}
        };
        int[][] transpose= new int[3][3];
        printMatrix(matrix);

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                transpose[i][j]=matrix[i][j];
        }


    }
    
    printMatrix(transpose);
    
}
public static void printMatrix(int[][] matrix)

{
    System.out.println("Transposed matrix : ");
    for(int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
}
}