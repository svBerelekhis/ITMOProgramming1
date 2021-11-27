import java.util.Random;
/** Основной класс программы */
public class Lab1 {
    public static void main(String[] args){
        /** создаю массивы и рандом */
        int[] a = new int[14];
        double[] x = new double[13];
        double[][] aa = new double[14][13];
        Random rand = new Random();
        double diff = 19;
        /** Записываю в массив a числа от 17 до 4*/
        for (int i = 0; i < 14; i++){
            a[i] = 17 - i;
        }
        /** Записываю в массив x рандомные числа от -9 до 10*/
        for (int i = 0; i < 13; i++){
            x[i] = -9.0 + rand.nextFloat()*diff;
        }
        /** Записываю в массив aa числа по заданию */
        for (int i = 0; i < 14; i++){
            for (int j = 0; j < 13; j++){
                if (a[i] == 5) {
                    aa[i][j] = 0.5*(0.5 + Math.pow((2/(0.25 - x[j])), Math.sin(x[j]) * (1 + Math.exp(x[j]))));
                } else if (a[i] == 4 || a[i] == 6 || a[i] == 9 || a[i] == 11 || a[i] == 12 || a[i] == 16 || a[i] == 17) {
                    aa[i][j] = Math.pow(Math.pow(Math.log(Math.abs(x[j])), 1.0/3), 1.0/3);
                } else
                {
                    double step = Math.asin(1/Math.pow(Math.exp(1), Math.pow(Math.sin(Math.log((Math.pow(Math.sin(x[j]), 2)))), 2)))/Math.PI;
                    aa[i][j] = Math.pow(Math.asin(Math.exp(-Math.abs(x[j])))/0.5, step);
                }
            }
        }
        /** Вывод */
        for (int i = 0; i < 14; i++){
            for (int j = 0; j < 13; j++){
                System.out.printf("%7.3f ", aa[i][j]);
            }
            System.out.println();
        }
    }
}