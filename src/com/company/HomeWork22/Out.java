package com.company.HomeWork22;

public class Out {
    int nums[];

    public Out(int[] nums) {
        this.nums = nums;
    }

    void analzie() {
        Inner inner = new Inner();
        System.out.println("Минимальное занчение массива" + inner.min());
        System.out.println("Максимальноезанчение массива" + inner.max());
        System.out.println("Среднее занчение массива" + inner.avg());
    }

    class Inner {

        int min() {
            int m = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (m > nums[i]) {
                    m = nums[i];
                }

            }
            return m;
        }

        int max() {
            int m = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (m < nums[i]) {
                    m = nums[i];
                }

            }
            return m;
        }

        int avg() {
            int m = 0;
            for (int i = 0; i < nums.length; i++) {
                m += nums[i];
            }
            return m / nums.length;
        }

    }


}

class innerTest {
    public static void main(String[] args) {

        int arr[] = {2, 3, 5, 7, 17};
        Out out = new Out(arr);
        out.analzie();
    }
}
