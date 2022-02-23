public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int ticket = 1111; //стоимость билета
        int bonus = service.calculate(ticket);

        System.out.println("Вам начислено " + bonus + " миль!"); //выводим бонусные мили
    }
}
