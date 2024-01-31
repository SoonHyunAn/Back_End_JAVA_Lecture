package Exam2;

public class Exam1번 {
    public static void main(String[] args) {
        // 1. 1에서 100까지 3의 배수의 합을 구하세요.
        int sum1 = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) sum1 += i;
        }
        System.out.println(sum1);
        // 2. 1에서 20까지 홀수 제곱 합을 구하세요.
        int sum2 = 0;
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 1) sum2 += i * i;
        }
        System.out.println(sum2);


        // 4. 3)에서 만든 메소드를 이용하여 2에서부터 100까지 소수의 합을 구하세요.
        int sum3 = 0;
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                sum3 += i;
            }
        }
        System.out.println(sum3);
    }

    // 3. 어떤 수가 소수인가를 판단하는 메소드 Boolean isPrime(int num);을 만드세요
    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
