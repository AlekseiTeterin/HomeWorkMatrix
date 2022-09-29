import java.util.Random;
import java.util.Scanner;

public class Matrix {


    int rows = 0;
    int columns = 0;
    int [][] matrixArray;

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    Matrix(int r, int c){
        rows = r;
        columns = c;
        matrixArray = new int[rows][columns];
    }

    public void AddValuesFromKeyboard(){
        int curValue = 0;

        for (int i =0; i < rows; i++){
            for(int j = 0; j < columns; j++)
            {
                while(curValue == 0){

                    Scanner scanner = new Scanner(System.in);

                    System.out.print("Введите целое число: ");
                    if (scanner.hasNextInt()) {
                        curValue = scanner.nextInt();
                    } else {
                        System.out.println("Вы ввели не целое число, повторите попытку");
                    }
                }
                matrixArray[i][j] = curValue;
                curValue = 0;
            }
        }

    }
    public void AddRandomValues(){
        Random random = new Random();
        for (int i =0; i < rows; i++){
            for(int j = 0; j < columns; j++)
            {
                matrixArray[i][j] = random.nextInt(101) + 1;
            }
        }
    }

    public void ShowMatrix(){
        System.out.println();

        for (int i =0; i < rows; i++){
            for(int j = 0; j < columns; j++)
            {
                System.out.print(matrixArray[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public int MaxElement(){
        int max = matrixArray[0][0];
        for (int i =0; i < rows; i++){
            for(int j = 0; j < columns; j++)
            {
                if(matrixArray[i][j] > max){
                    max = matrixArray[i][j];
                }
            }
        }
        return max;
    }

    public int MinElement(){
        int min = matrixArray[0][0];
        for (int i =0; i < rows; i++){
            for(int j = 0; j < columns; j++)
            {
                if(matrixArray[i][j] < min){
                    min = matrixArray[i][j];
                }
            }
        }
        return min;
    }

    public void AverageValue(){
        int sum = 0;
        for (int i =0; i < rows; i++){
            for(int j = 0; j < columns; j++)
            {
                sum = sum + matrixArray[i][j];
            }
        }
        System.out.println("average value = " + sum/(rows*columns));
    }

}
