public class Liczby {


    public static void main(String[] args) {

        int[] tab = new int[50];
        int skok = 2;
        int suma = 0;

        for (int i = 0; i < 50; i++) {
            tab[i] = skok;
            skok += 2;

            suma += tab[i];
        }


        for (int elem : tab) {
            System.out.print(elem + " ");
        }
        System.out.println();
        System.out.println("Suma wszystkich liczb jest równa: " + suma);

    }
}
