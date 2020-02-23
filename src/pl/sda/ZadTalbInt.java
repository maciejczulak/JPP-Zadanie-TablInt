package pl.sda;

public class ZadTalbInt {
    int table[];
    public static int findMax(int[] table) {
        int max = table[0];
        for (int i = 1; i < table.length; i++) {
            if (table[i] > max) {max=table[i];}}
            return max; }

    public static int findMin(int[] table) {
        int min = table[0];
        for (int i = 1; i < table.length; i++) {
            if (table[i] < min) {min=table[i];}}
        return min; }

    public static void main(String[] args) {
        int[] tableInt = {4, 67, 1, 21, 3, 8, 47, 92, 5};
        System.out.println(findMax(tableInt));
        System.out.println(findMin(tableInt));
    }}










