package com.company.abstractClasses.properties;

public class propertyDemo {
    public static void main(String[] args) {
        PropertyCollection collection = new PropertyCollection();
        for (int i = 0; i < 1000; i++){
            collection.addProperty(new House("Oundle", 5,100_000, 2, Type.SEMIDETACHED));
            collection.addProperty(new House("Manchester", 5,10_000, 2, Type.TERRACED));
        }
        for (int i = 0; i < 100; i++) {
            collection.addProperty(new House("London", 2,1_000_000, 3, Type.DETACHED));
            collection.addProperty(new Bungalow("Peterborough",4,50_000, Type.SEMIDETACHED));
            collection.addProperty(new Flat("Budapest",50_000,3,10));
        }
        for (int i = 0; i < 20; i++) {
            collection.addProperty(new Maisonette("Milan",500_000, 8, 10, 3));
            collection.addProperty(new Bungalow("Northampton",4,50_000, Type.DETACHED));
            collection.addProperty(new Bungalow("Exeter",4,50_000, Type.TERRACED));
        }
        System.out.println("Number of houses: " + collection.getHouses().size());
        assert collection.getHouses().size() == 2240;

        System.out.println("Number of bungalows: " + collection.getBungalows().size());
        assert collection.getBungalows().size() == 140;

        System.out.println("Number of flats: " + collection.getFlats().size());
        assert collection.getFlats().size() == 120;

        System.out.println("Number of maisonettes: " + collection.getMaisonettes().size());
        assert collection.getMaisonettes().size() == 20;

        System.out.println("Number of terraced houses: " + collection.getTerracedHouses().size());
        assert collection.getTerracedHouses().size() == 1020;
    }
}
