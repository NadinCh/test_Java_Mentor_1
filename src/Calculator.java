import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение в формате: число_математический символ(+ - * /)_число \n" +
                           "Диапазон чисел от 0 до 10. Пример ввода: \n" +
                            "1 + 10\n" +
                            "II + III");
        String[] arrayStr = scanner.nextLine().split(" ");
        int a = 0;
        int b = 0;
        char operation = arrayStr[1].charAt(0);

        try{
        String[] romanNum = {"X", "IX", "VIII", "VII", "VI", "V", "IV", "III", "II", "I"};
        boolean check1 = false, check2 = false;

        for (int i = 0; i < romanNum.length; i++) {
            if (romanNum[i].equals(arrayStr[0])) {
                check1 = true;
            }
        }
        for (int i = 0; i < romanNum.length; i++) {
            if (romanNum[i].equals(arrayStr[2])) {
                check2 = true;
            }
        }
        if (check1 && check2) {
            a = RomanToArabic.romanToArabic(arrayStr[0]);
            b = RomanToArabic.romanToArabic(arrayStr[2]);
            System.out.println("Результат операции: " + (ArabToRoman.arabToRoman(OperationCalc.calc(a, b, operation))));

        } else {
            a = Integer.parseInt(arrayStr[0]);
            b = Integer.parseInt(arrayStr[2]);
            System.out.println("Результат операции: " + OperationCalc.calc(a, b, operation));

        }
        if ((a > 10 || a < 0) || (b > 10 || b < 0)) {
            throw new IllegalArgumentException();
        }
        } catch (RuntimeException e) {
            throw new IllegalArgumentException("Неверный формат данных. Введите выражение еще раз соблюдая формат ввода!");
        }
        System.out.println("Вы вышли из калькулятора.");
    }
}