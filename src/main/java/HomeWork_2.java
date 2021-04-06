package lesson2;

public class HomeWork_2 {
    public static void main(String[] args) {
        System.out.println(isSumBetween(8,15));
        printSign(10);
        System.out.println(negative(9));
        printWordNTimes(3);
    }
    /*
    1. Написать метод, принимающий на вход два целых числа и проверяющий,
    что их сумма лежит в пределах от 10 до 20 (включительно),
    если да – вернуть true, в противном случае – false.
    */
    public static boolean isSumBetween(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) return true;
        else return false;
    }
    /*
    2. Написать метод, которому в качестве параметра передается целое число,
    метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    Замечание: ноль считаем положительным числом.
    */
    public static void printSign(int value) {
        if (value >= 0){
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
    /*
    3. Написать метод, которому в качестве параметра передается целое число.
    Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    */
    public static boolean negative(int a) {
        if (a > 0) return true;
        else return false;
    }
    /*
    4. Написать метод, которому в качестве аргументов передается строка и число,
    метод должен отпечатать в консоль указанную строку, указанное количество раз;
    */
    public static void printWordNTimes(int n) {
        for (int i = 0; i < n; i++){
            System.out.println(n);
        }
    }
}
