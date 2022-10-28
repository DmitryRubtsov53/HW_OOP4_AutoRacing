public class Bus extends Automobil {

    public Bus(String typeAuto, String brand, String model, double engineVolume) {
        super(typeAuto, brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Снимаем с ручного тормоза, заводим автобус, прогреваем, выжимаем сцепление, включаем 1-ю передачу, нажимаем на педаль газа, отпускаем сцепление.");
    }

    @Override
    public void finishMove() {
        System.out.println("Съезжаем с трассы, отпускаем педаль газа, переключаемся на нейтралку, жмём на тормоз, выключаем двигатель автобуса, ставим на ручной тормоз.");
    }

}

