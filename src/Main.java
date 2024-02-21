//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int amount = 20_000; // стоимость билета
        int mile = 20; // количество рублей для одной бонусной мили
        int bonus = amount/mile;

        System.out.println(bonus); // количество бонусных миль

    }
}