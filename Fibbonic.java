package Day6problems;

public class Fibbonic {
    public static void main(String[] args) {
        int num = 10;
        int s = 0;
        int k = 1;
        int r = 1;

        for (int i = 0; i <= num; i++) {
            r = s + k;
            s = k;
            k = r;


        }
    }
}
