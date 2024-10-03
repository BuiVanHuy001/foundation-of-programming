package _02_Data_Structures_And_Algorithms._04_Recursion.baitap;

public class bai_4 {
    static int[] stepAmount = new int[46];

    private static int climbStairs(int n) {
        stepAmount[1] = 1;
        stepAmount[2] = 2;

        return calcStep(n);
    }

    private static int calcStep(int n) {
        if (stepAmount[n] == 0)
            stepAmount[n] = calcStep(n - 1) + calcStep(n - 2);

        return stepAmount[n];
    }
}
