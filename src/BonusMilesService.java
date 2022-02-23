public class BonusMilesService {
    public int calculate(int ticket) {
        int mileFor = 20;              //за сколько рублей дается 1 миля
        int bonus = ticket / mileFor; //вычисляем бонус за каждые 20 рублей
        return bonus;                //возвращаем бонус
    }
}
