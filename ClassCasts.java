package test;

public class ClassCasts {
    static class Building {
        @Override
        public String toString() {
            return "Building";
        }
    }
    static class House extends Building {
        @Override
        public String toString() {
            return "House";
        }
    }

    public static void main(String[] args) {
        Building b = new House();
        Class<House> houseType = House.class;
        House h = houseType.cast(b);
        h = (House)b;

        System.out.println(b);
        System.out.println(houseType);
        System.out.println(h);

    }

}
