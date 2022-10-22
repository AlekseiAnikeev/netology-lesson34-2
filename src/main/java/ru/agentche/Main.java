package ru.agentche;

/**
 * @author Aleksey Anikeev aka AgentChe
 * Date of creation: 22.10.2022
 */
public class Main {
    public static void main(String[] args) {
        BinOps binOps = new BinOps();
        String a = "10110", b = "10110";
        System.out.println("Сумма " + a + " и " + b);
        String c = binOps.sum(a, b);
        System.out.println("Ответ в двоичной = " + c);
        System.out.println("Ответ в десятичной = " + Integer.parseInt(c, 2));

        System.out.println();
        System.out.println();

        System.out.println("Умножение " + a + " на " + b);
        c = binOps.mult(a, b);
        System.out.println("Ответ в двоичной = " + c);
        System.out.println("Ответ в десятичной = " + Integer.parseInt(c, 2));
    }
}
