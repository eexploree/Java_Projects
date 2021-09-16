package day001.exer;


public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("我在编程中国学JAVA");
        System.out.println();


        for (int i=1; i<=20; i++) {
            System.out.printf("我爱编程中国 %d 次\n", i);
        }

        System.out.printf("\n\n编程中国送我一颗小心心：");
        // 绘制一个心形图案
        float x, y;
        for (y = (float)1.5; y > -1.5; y -= 0.1) {
            for (x = (float)-1.5; x < 1.5; x += 0.05) {
                float a = x * x + y * y - 1;
                if ((a * a * a - x * x * y * y * y) <= 0.0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}