public class CargoShip extends Ship{
    private int cargoTonnage;
    public CargoShip(String name, String year, int cargoTonnage) {
        super(name, year);
        this.cargoTonnage = cargoTonnage;
    }
    public int getCargoTonnage(){
        return cargoTonnage;
    }
    public void setCargoTonnage(int cargoTonnage){
        this.cargoTonnage = cargoTonnage;
    }
    @Override public void print(){
        System.out.println(getName()+":"+getYear()+", tons:"+getCargoTonnage());
    }
}
