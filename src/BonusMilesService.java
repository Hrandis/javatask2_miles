public class BonusMilesService {
    public int calculate(int ticket) {
        int mileFor = 20;              //за сколько рублей дается 1 миля
        return ticket / mileFor;         //возвращаем бонус
    }
}
