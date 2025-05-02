package prac13.task3;

import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;

    public Address(String address) {
        splitAd(address);
        add(address);
    }


    private void splitAd(String address) {
        String[] parts = address.split(",");

        if (parts.length >= 6) {
            country = parts[0].trim();
            region = parts[1].trim();
            city = parts[2].trim();
            street = parts[3].trim();
            house = parts[4].trim();
            building = parts.length > 5 ? parts[5].trim() : null;
            apartment = parts.length > 6 ? parts[6].trim() : null;
        }
    }

    private void add(String address) {
        StringTokenizer tokenizer = new StringTokenizer(address, ",.;");

        if (tokenizer.countTokens() >= 6) {
            country = tokenizer.nextToken().trim();
            region = tokenizer.nextToken().trim();
            city = tokenizer.nextToken().trim();
            street = tokenizer.nextToken().trim();
            house = tokenizer.nextToken().trim();
            building = tokenizer.hasMoreTokens() ? tokenizer.nextToken().trim() : null;
            apartment = tokenizer.hasMoreTokens() ? tokenizer.nextToken().trim() : null;
        }
    }


    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", building='" + building + '\'' +
                ", apartment='" + apartment + '\'' +
                '}';
    }
}