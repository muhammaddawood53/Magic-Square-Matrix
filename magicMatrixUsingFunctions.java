import java.util.Scanner;

public class magicMatrix {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("----------------- CHECK THE MAGIC MATRIX ------------------");
        System.out.print("Enter Number of Row: ");
        int n=input.nextInt();
        int[][] matrix=new int[n][n];
        System.out.println("Enter the "+n*n+" values of Element. ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                matrix[i][j]=input.nextInt();
        }

        }boolean isMagic=true;


        int sum=sumOfFirstRow(n, matrix);

        isMagic = sumOfRows(n, matrix, sum) && sumOfColoumn(n, matrix, sum) && sumOfLeftDiagonal(n, matrix, sum) && sumOfRightDiagonal(n, matrix, sum);
       
        if(isMagic){
            System.out.println(" MAGIC MATRIX ");
        }else{
            System.out.println(" NOT MAGIC MATRIX !!!");
        }
    }
    
    
    
    
    // for sum of first row.
    public static int  sumOfFirstRow(int n, int[][] matrix){
        int sum=0;
        for(int i=0; i<n; i++){
            sum+=matrix[0][i];
                }        
        return sum;
    }

    //sum of all the rows.
    public static boolean sumOfRows(int n , int[][] matrix, int sum){
        int sumOfRows=0;
        for(int i=0; i<n; i++){
            sumOfRows=0;
            for(int j=0; j<n; j++){
                sumOfRows+=matrix[i][j];

            }if(sumOfRows!=sum){
                return false;
            }
        }return true;
        
    }

    // sum of coloumns.
    public static boolean sumOfColoumn(int n, int[][] matrix, int sum){
        int sumOfColoumn=0;
        for(int i=0;  i<n; i++){
            sumOfColoumn=0;
            for(int j=0; j<n; j++){
                sumOfColoumn+=matrix[j][i];
            }if(sumOfColoumn!=sum){
                return false;
            }
        }return true;
    
    }


    //for left side Diagonal.
    public static boolean sumOfLeftDiagonal(int n, int[][] matrix,  int sum){
        int sumOfLeft=0;
        for(int i=0;  i<n; i++){
            sumOfLeft+=matrix[i][i];
        }if(sumOfLeft!=sum){
                return false;
            }
        return true;
    }

    // for right side diagonal.
    public static boolean sumOfRightDiagonal(int n, int[][] matrix, int sum){
        int sumOfRight=0;
        for(int i=0;  i<n; i++){
            sumOfRight+=matrix[i][n-1-i];
        }if(sumOfRight!=sum){
                return false;
            }
        return true;
    }
    }
    
    

