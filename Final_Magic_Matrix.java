import java.util.Scanner;
public class Final_Magic_Matrix {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("\n------------ CHECK THE MATIX IS MAGIC MATRIX ---------------\n");
        System.out.print("Enter the Number of Row or Coloumn: ");
        int n=input.nextInt();

        int[][] matrix=new int[n][n];

        System.out.println("Enter the "+n*n+" elements values: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                matrix[i][j]=input.nextInt();
            }}
        boolean isMagic=true;
            
        // Now take the sum of first row and compare the it with others to check the magic matrix condition.
        int FirstRowSum=0;
        for(int j=0; j<n;j++){
            FirstRowSum+=matrix[0][j];
        }
        

        //Check rows.
        int sumOfRow=0;
        for(int i=0; i<n; i++){
            sumOfRow=0;
            for(int j=0; j<n; j++){
                sumOfRow+=matrix[i][j];
            }
            if(FirstRowSum!=sumOfRow){
                isMagic=false;
                break;
            }
        }


        //Check coloumn.
        int sumOfCol=0;
        for(int i=0; i<n; i++){
            sumOfCol=0;
            for(int j=0; j<n; j++){
                sumOfCol+=matrix[j][i];
            }
            if(sumOfCol!=FirstRowSum){
                isMagic=false;
                break;
                }
        }


        //Check Left Diognal.
        int sumOfLDia=0;
        for(int i=0; i<n; i++){
            sumOfLDia+=matrix[i][i];
        }
        if(sumOfLDia!=FirstRowSum){
            isMagic=false;
        }
        
        //Now Check Right Diagonal.
        int sumOfRDia=0;
        for(int i=0; i<n; i++){
            sumOfRDia+=matrix[i][n-1-i];
        }
        if(sumOfRDia!=FirstRowSum){
            isMagic=false;
        }
        

        //Now print the final Answer. 
        if(isMagic){
        System.out.println("\n------ MAGIC SQUARE MATRIX :) --------");
        }else{
            System.out.println("\n------ NOT MAGIC SQUARE MATRIX !!! --------");
        }
}
}
