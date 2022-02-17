public class Main {
    public static void main(String[] args) {

        int ticket = 1111; //стоимость билета
        int mileFor = 20; //за сколько рублей дается 1 миля

        int bonus = ticket / mileFor; //вычисляем бонус за каждые 20 рублей

        System.out.println("Вам начислено " + bonus + " миль!"); //выводим бонусные мили
    }
}
