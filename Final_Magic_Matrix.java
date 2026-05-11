import java.util.Scanner;
public class Final_Magic_Matrix {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("We make the Square matrix so please enter number of row or coloumn: ");
        int row=input.nextInt();

        int[][] matrix=new int[row][row];

        //Store the Elements in matrix.
        System.out.println("Enter the "+row*row+" Elements: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<row; j++){
                matrix[i][j]=input.nextInt();
            }   
        }
        
        boolean ismagic=false;

        //check the sum of first row and then compare all the sum to it.
        int targetedSum=0;
        for(int j=0; j<row; j++){
            targetedSum+=matrix[0][j];
        }

        // check the sum of the rows.
        int rowSum;
        for(int i=0; i<row; i++){
            rowSum=0;
            for(int j=0; j<row; j++){
                rowSum+=matrix[i][j];
            }
            if(targetedSum==rowSum) ismagic=true;
            else break;
                
                
            
        }
        //check for the coloumn.
        for(int i=0; i<row; i++){
            int colSum=0;
            for(int j=0; j<row; j++){
                if(targetedSum==colSum) ismagic=true;
                else break;
               
            }
        }
        //Now Check for the Diagonal.
        for(int i=0; i<row; i++){
            int diagSum=0;
            diagSum+=matrix[i][i];
            if(targetedSum==diagSum) ismagic=true;
            else break;
            
        }

        //Now print the Answer if true print magic matrix otherwise not magic..
        if(ismagic=true) System.out.println("MAGIC MATRIX");
        else System.out.println("NOT MAGIC MATRIX !!!"); 


        


    
    
    
    
    
    
    }
}
