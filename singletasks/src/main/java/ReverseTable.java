import java.util.Arrays;

public class ReverseTable {

    public void reverse(int[] tab) {

        int a = 0;
        for (int i = 0; i < tab.length / 2; i++) {
            int temp = tab[i];
            tab[i] = tab[tab.length - i - 1];
            tab[tab.length - i - 1] = temp;
        }

    }

    public static void main(String[] args) {
        int[] tab = new int[]{4, 52, 1, 7, 4, 3};
        ReverseTable reverseTable = new ReverseTable();
        reverseTable.reverse(tab);

        System.out.println(Arrays.toString(tab));

    }

}
