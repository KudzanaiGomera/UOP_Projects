package example;

public class Example {

    public static void main(String[] args) {
        int N = 5;
        int D = 4;
        int A = 0;
        calcValue(N);
        System.out.println(N);
    }

    static void calcValue(int N) {
        int D;
        for (D = 0; D < 5; D++) {
            N++;
        }
    }

}
