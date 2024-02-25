package hu.webler;

public class MatrixExtra {

    public static void main(String[] args) {

        // Mátrix létrehozása
        int[][] matrix = {
                {10, 20, 30}, // martrix 0. indexén áll ez a belső tömb -> azon belül elemek 0,1,2 -> elem [0][0] ez az első elem az 10
                {40, 50, 60}, // martrix 1. indexén áll ez a belső tömb -> azon belül elemek 0,1,2 -> elem [1][0] ez az első elem az 40
                {70, 80, 90} // martrix 2. indexén áll ez a belső tömb -> azon belül elemek 0,1,2 -> elem [2][0] ez az első elem az 70
        };

        // Az első elemeinek és indexeinek kiírása
        System.out.println("Az első sor elemei:");
        for (int i = 0; i < matrix[0].length; i++) {
            System.out.print("Elem értéke: " + matrix[0][i] + " ");
            System.out.print("Index: " + i + " ");
            int elem = i + 1;
            System.out.println("Elem sorszáma: " + elem);
        }
    }
}
