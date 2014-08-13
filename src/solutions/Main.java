
package solutions;

public class Main {
    public static void main(String[] args) {
        ServiceObjects m = new ServiceObjects();
        String address = "5490 South Shore Ave, Chicago, IL 60615";

        System.out.println("Normalize: " + m.normalize(address));

        LatLong latlong = m.geocode(address);

        System.out.println("Geocode: " + latlong);
        System.out.println("Reverse Geocode: " + m.reverseGeocode(latlong));
    }
}
