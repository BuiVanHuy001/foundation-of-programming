package _02_Data_Structures_And_Algorithms._04_Recursion.baitap;

public class bai_2 {

    public static int LCM(int a, int b, int lcm) {
        if (lcm % a != 0 || lcm % b != 0)
            lcm++;
        else
            return lcm;
        return LCM(a, b, lcm);
    }

    public static int GCD(int a, int b, int gcd) {
        if (a % gcd != 0 || b % gcd != 0) {
            gcd--;
        } else {
            return gcd;
        }
        return GCD(a, b, gcd);
    }

    public static void main(String[] args) {
        System.out.println("Bội chung nhỏ nhất là: " + LCM(12, 18, 18)); //expected 36
        System.out.println("Ước chung lớn nhất là: " + GCD(12, 18, 12)); //expected 6
    }
}
