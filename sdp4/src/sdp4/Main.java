package sdp4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Team team = new Team();

        Naruto naruto = new Naruto();
        Sasuke sasuke = new Sasuke();
        Sakura sakura = new Sakura();

        team.addObserver(naruto);
        team.addObserver(sasuke);
        team.addObserver(sakura);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Здравствуйте, Какаши!");
        System.out.println("Команда 7 готова к атаке Мадары!");
        System.out.println("Введите команду (attack): ");
        String command = scanner.nextLine();

        if (command.equalsIgnoreCase("attack")) {
            team.notifyAllObservers();
        } else {
            System.out.println("Неверная команда");
        }
    }
}