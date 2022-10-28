import java.util.Objects;

public abstract class Automobil {
    private String brand;
    private String model;
    private double engineVolume;
    private String typeAuto;


// getters **********************************************************************************************

    public String getBrand() { return brand;
    }
    public String getModel() { return model;
    }
    public double getEngineVolume() { return engineVolume;
    }
    public String getTypeAuto() { return typeAuto;
    }
    // setters **********************************************************************************************

    public void setBrand(String brand) {
        this.brand = (brand != null && !brand.isBlank() && !brand.isEmpty()) ? brand : "default";
    }
    public void setModel(String model) {
        this.model = (model != null && !model.isBlank() && !model.isEmpty())? model : "default";
    }
    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume != 0 ? engineVolume : 10;
    }

    public void setTypeAuto(String typeAuto) {
        this.typeAuto = (typeAuto!= null && !typeAuto.isBlank() && !typeAuto.isEmpty())? typeAuto : "default";
    }
    // constructor *******************************************************************************************


    public Automobil(String typeAuto, String brand, String model, double engineVolume) {
        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);
        setTypeAuto(typeAuto);
    }

    // Methods ************************************************************************************************
    @Override
    public String toString() {
        return  this.typeAuto + ": " + this.brand + ", модель - " + this.model + ", V двигателя - " + this.engineVolume + ".";
    }
    public static void printAuto (Automobil[] auto) {
        for (Automobil el : auto) {
            System.out.println(el);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Automobil automobil = (Automobil) o;
        return Double.compare(automobil.engineVolume, engineVolume) == 0 && Objects.equals(brand, automobil.brand) && Objects.equals(model, automobil.model) && Objects.equals(typeAuto, automobil.typeAuto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, typeAuto);
    }
    public abstract void startMoving ();
    public abstract void finishMove ();


}

