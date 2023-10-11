package home_work_24.bus;

public class InternationalBus extends Bus{
    private String[] countries;

    public InternationalBus(String model, int yearOfMan, int capacity, String[] countries) {
        super(model, yearOfMan, capacity);
        this.countries = countries;
    }
    public InternationalBus(String model, int yearOfMan, int capacity, String countries) {
        super(model, yearOfMan, capacity);
        this.countries = new String[0];
    }

    public String[] getCountries() {
        return countries;
    }

    public void setCountries(String[] countries) {
        this.countries = countries;
    }


    public void goToRoute (int millage) {
        System.out.println(getModel() + " отправляется по маршруту");
        start("Italy");
        super.startBus();
        // какой-то код.
        // Посещение стран, стоянка, заправка.....
        super.stopBus();
    }


    public void start(String country) {
        System.out.println("Выезжаем из страны - " + country);

    }









}
