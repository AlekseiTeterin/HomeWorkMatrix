public class Main {
    public static void main(String[] args) {
        Matrix m = new Matrix(3, 3);
        m.AddRandomValues();
        //m.AddValuesFromKeyboard();
        m.ShowMatrix();

        System.out.println("maximal element in matrix " + m.MaxElement());
        System.out.println("minimal element in matrix " + m.MinElement());

        m.AverageValue();

        Matrix m1 = new Matrix(3, 3);
        m1.AddRandomValues();
        m1.ShowMatrix();

        Matrix Sum = sumMatrix(m, m1);
        System.out.print("Sum of matrix: ");
        Sum.ShowMatrix();
    }

    public static Matrix sumMatrix(Matrix A, Matrix B){

        if((A.rows == B.rows) && (A.columns == B.columns)){
            Matrix C = new Matrix(A.rows, A.columns);
            for (int i =0; i < A.rows; i++){
                for(int j = 0; j < A.columns; j++)
                {
                    C.matrixArray[i][j] = A.matrixArray[i][j] + B.matrixArray[i][j];
                }
            }
            return C;
        }
        else{
            Matrix C = new Matrix(1, 1);
            C.matrixArray[0][0] = -999999;
            return C;
        }
    }
}
