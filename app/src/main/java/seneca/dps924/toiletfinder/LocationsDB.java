package seneca.dps924.toiletfinder;

        import java.util.ArrayList;

        import android.util.Log;

        import com.google.android.gms.maps.model.LatLng;

public class LocationsDB {

    public LatLng name;
    public String title;
    public String snippet;
    public String price;

    public LocationsDB(LatLng n, String t, String s, String p) {
        name = n;
        title = t;
        snippet = s;
        price = p;
    }

    public static void main(String[] args) {

        System.out.println("Testing LocationsDB Main");

        ArrayList<LocationsDB> myDB = createDB();

        for(int i = 0; i < myDB.size(); i++) {
            System.out.println("-----");
            System.out.println(myDB.get(i).name.toString());
            System.out.println(myDB.get(i).title);
            System.out.println(myDB.get(i).snippet);
            System.out.println(myDB.get(i).price);
        }
    }

    public static ArrayList<LocationsDB> createDB() {
        ArrayList<LocationsDB> newDB = new ArrayList<LocationsDB>();

        newDB.add(new LocationsDB( new LatLng(43.658236, -79.381894),
                "McDonald's",
                "356 Yonge St, Toronto, ON M5B 1S5",
                "Free"
        ));
        newDB.add(new LocationsDB( new LatLng(43.650569, -79.387938),
                "Starbucks",
                "180 Queen Street West Suite 102.3A, Toronto, ON M5V 3X3",
                "Paying Customer"
        ));
        newDB.add(new LocationsDB( new LatLng(43.655423, -79.380507),
                "Popeyes",
                "273 Yonge St, Toronto, ON M5B 1N8",
                "Paying Customer"
        ));
        newDB.add(new LocationsDB( new LatLng(43.652428, -79.379205),
                "Starbucks",
                "1 Queen Street East, Toronto, ON M5C 2W5",
                "Paying Customer"
        ));
        newDB.add(new LocationsDB( new LatLng(43.659567, -79.382297),
                "Starbucks",
                "407 Yonge St, Toronto, ON M5B",
                "Paying Customer"
        ));
        newDB.add(new LocationsDB( new LatLng(43.653915, -79.377671),
                "Second Cup",
                "30 Bond St, Toronto, ON M5B 1W8",
                "Paying Customer"
        ));
        newDB.add(new LocationsDB( new LatLng(43.656126, -79.383426),
                "Atrium On Bay",
                "595 Bay St, Toronto, ON M5G 2C2",
                "Free"
        ));
        newDB.add(new LocationsDB( new LatLng(43.670706062, -79.385879814),
                "Bloor-Yonge Subway Station",
                "Toronto, ON M4W 1J7, Canada",
                "Free; Within TTC Subway"
        ));
        newDB.add(new LocationsDB( new LatLng(43.653611, -79.380060),
                "Toronto Eaton Centre",
                "220 Yonge St, Toronto, ON M5B 2H1",
                "Free"
        ));
        newDB.add(new LocationsDB( new LatLng(43.656565, -79.379732),
                "Tim Horton's",
                "26 Dundas St E, Toronto, ON M5B 2L6",
                "Free"
        ));

        return newDB;
    }

} // end LocationsDB class

