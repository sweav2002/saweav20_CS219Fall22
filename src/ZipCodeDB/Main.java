package ZipCodeDB;

public class Main {
    public static void main(String[] args) {
        Zipcode z1 = new Zipcode("13617", "NY", "Canton",
                75.16, 44.59, 11781);
        //System.out.println(z1);


        Zipcode z2 = new Zipcode("13668", "NY", "Norwood",
                74.99, 44.93, 4305);
        //System.out.println(z2);

        Database db = new Database();

        //System.out.println(db.findByZip("13617"));
        //System.out.println(db.findByZip("hello"));

        //System.out.println(db.search("13617"));
        //System.out.println(db.search("13668"));

        WeatherObservation wob = db.search("13617"). getWeatherData();
        System.out.println(wob);

        return;
    }
}
