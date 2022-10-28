public class Main {
    public static void main(String[] args) {

        System.out.println("Домашнее задание ООП4 Автогонки ********************************************************");
        System.out.println();

        Automobil[] auto = new Automobil[12];

        auto [0] = new Car ("Car", "Audi", "A8 50L", 4.1);
        auto [1] = new Car ("Car", "BMW", "Z05", 3.5);
        auto [2] = new Car ("Car", "Hyundai", "i70L", 3.7);
        auto [3] = new Car ("Car", "Kia", "Sport", 4.0);
        auto [4] = new Truck ("Truck", "КаМАЗ", "К850", 10.5);
        auto [5] = new Truck ("Truck", "МАЗ>", "A650", 10.5);
        auto [6] = new Truck ("Truck", "КрАЗ", "М1020", 12);
        auto [7] = new Truck ("Truck", "ГАЗ", "1301", 8.5);
        auto [8] = new Bus ("Bus", "НефАЗ", "Н456", 8.5);
        auto [9] = new Bus ("Bus", "ПАЗ", "П587", 9);
        auto [10] = new Bus ("Bus", "ЛиАЗ", "Л110", 10);
        auto [11] = new Bus ("Bus", "ГАЗ", "Б1500", 9.5);

        Automobil.printAuto(auto);
    }
}