
package motor3d;


public class Matrix {
   final int columns;
   final int rows;
   final double[][] data;
   
   public Matrix (int columns, int rows){
       this.columns = columns;
       this.rows = rows;
       this.data= new double[rows][columns];
   }
   
   public Matrix (double [][] data){
       this.data=data;
       this.columns=data[0].length;
       this.rows=data.length; 
   }
   
   public Matrix (double [] data){ //Para que se usa un constructor double [] otro con [][]? 
       this.columns = 1 ;
       this.rows= data.length;
       this.data= new double [rows][columns];
       for (int i=0; i<rows; i++ ){
        this.data[i]=new double[]{data[i]};
       }
      //Que metodo se lee al final cuando llamo al Constructor "Matrix"???
    }

    public static Matrix add(Matrix matrix1, Matrix matrix2){
        if (matrix1.columns != matrix2.columns || matrix1.rows != matrix2.rows ){
            throw new IllegalArgumentException("Matrices must have same dimensions for addition");    
        }
    double[][] resultData = new double[matrix1.rows][matrix1.columns];
    for (int i = 0; i < matrix1.rows; i++){
        for (int j = 0; j < matrix1.columns; j++){
            resultData [i][j]= matrix1.data[i][j] + matrix1.data [i][j];
        }
        }
        return new Matrix(resultData); //por que debe tener New al retornar la matriz?
    }
    
    public static Matrix multiply(Matrix matrix1, Matrix matrix2){
        if (matrix1.rows != matrix2.columns){
            throw new IllegalArgumentException("Number of columns in the first matrix must be equal to the number of rows in the second matrix for multiplication");
        }
        double[][] ResultData = new double [matrix1.rows][matrix2.columns];
        for (int i=0; i< matrix1.rows ;i++){
            for (int j=0; j<matrix2.columns;j++){
                for (int k=0; k< matrix1.columns;k++){
                 ResultData[i][j] +=  matrix1.data[i][k]* matrix2.data[k][j];
                }
            }
        }
        return new Matrix(ResultData);
    }
    
    public Matrix getColumn (int columnindex){
        if (columnindex < 0 || columnindex >= columns){
            throw new IllegalArgumentException ("Invalid Column Index!.");
        }
        double[] column = new double [rows];
        for (int i = 0; i < rows; i++){
            column [i] = data [i][columnindex];
        }
        return new Matrix(column);
    }
    
    public ...
}