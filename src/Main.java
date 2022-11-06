public class Main {
    public static void main(String[] args) {

        System.out.println("Домашнее задание Работа с исключениями ********************************************************");
        System.out.println();

        Automobil audi = new Car("Car", "Audi", "A8 50L", 4.1);
        Automobil  bmw = new Car("Car", "BMW", "Z05", 3.5);
        Automobil  hyundai = new Car("Car", "Hyundai", "i70L", 3.7);
        Automobil  kia = new Car("Car", "Kia", "Sport", 4.0);
        Automobil  kamaz = new Truck("Truck", "КаМАЗ", "К850", 10.5);
        Automobil  maz = new Truck("Truck", "МАЗ", "A650", 10.5);
        Automobil  kraz = new Truck("Truck", "КрАЗ", "М1020", 12);
        Automobil  gaz = new Truck("Truck", "ГАЗ", "1301", 8.5);
        Automobil nefaz = new Bus("Bus", "НефАЗ", "Н456", 8.5);
        Automobil paz = new Bus("Bus", "ПАЗ", "П587", 9);
        Automobil liaz = new Bus("Bus", "ЛиАЗ", "Л110", 10);
        Automobil gazon = new Bus("Bus", "ГАЗ", "Б1500", 9.5);

// Диагностика ----------------------------------------------------------------------
        audi.diagnosed();
        kraz.diagnosed();
        paz.diagnosed();

        Driver<Car> ivan = new Driver<>("Иван", "B", 10 );
        Driver<Truck> svan = new Driver<>("Сван", "C", 7 );
        Driver<Bus> semen = new Driver<>("Семён", "E", 15 );

// Проверка водительских прав --------------------------------------------------------
        ivan.checkLicense();
        svan.checkLicense();
        semen.checkLicense();

        System.out.println();
        assa(audi,bmw,hyundai,kraz,maz,paz,gazon);
    }
    public static void assa (Automobil... automobils) {
        for (Automobil el : automobils) {
            if (el.diagnosed()) {
                try {
                    throw new RuntimeException(el.getBrand() + " " + el.getModel() + " не прошла диагностику.");
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            } else
            System.out.println(el.getBrand() + " " + el.getModel() + " к гонке готова." );
        }
    }


} // class Main