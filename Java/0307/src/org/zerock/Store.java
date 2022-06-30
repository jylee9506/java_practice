package org.zerock;

public class Store {

    int sno;
    String name;
    double lat;
    double lng;


    public Store(int sno, String name, double lat, double lng) {
        this.sno = sno;
        this.name = name;
        this.lat = lat;
        this.lng = lng;
    }

    @Override
    public String toString() {
        return "Store{" +
                "sno=" + sno +
                ", name='" + name + '\'' +
                ", lat=" + lat +
                ", lng=" + lng +
                '}';
    }
}
