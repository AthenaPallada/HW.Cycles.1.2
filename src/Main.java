public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        for(int i = 1904; i <= 2096; i = i + 4) {
            if(i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                System.out.println(i + " - год является високосным");
            }
        }
        // Задание 2
        System.out.println("Задание 2");
        for(int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();
        // Задание 3
        System.out.println("Задание 3");
        for(int i = 1; i <= 512; i = i * 2) {
            System.out.print(i + " ");
        }
        
    }
}