public class Car extends Automobil {

    public Car(String typeAuto, String brand, String model, double engineVolume) {
        super(typeAuto, brand, model, engineVolume);
    }

    @Override
    public void startMoving () {
        System.out.println("Снимаем с ручного тормоза, заводим автомобиль, прогреваем, выжимаем сцепление, включаем 1-ю передачу, нажимаем на педаль газа, отпускаем сцепление.");
    }
    @Override
    public void finishMove () {
        System.out.println("Съезжаем с трассы, отпускаем педаль газа, переключаемся на нейтралку, жмём на тормоз, выключаем двигатель, ставим на ручной тормоз.");
    }

}
