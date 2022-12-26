abstract class shape {
    abstract void numberOfSide();
}

class triangle extends shape {
    void numberOfSide() {
        System.out.println("size is 3");
    }
}

class rectangle extends shape {
    void numberOfSide() {
        System.out.println("size is 4");
    }
}

class hexagon extends shape {
    void numberOfSide() {
        System.out.println("size is 6");
    }
}

class AbstractClass {
    public static void main(String[] args) {

        triangle tri = new triangle();
        rectangle rect = new rectangle();
        hexagon hexa = new hexagon();

        shape s; // reference to shape

        s = rect; // rectangle
        s.numberOfSide();

        s = tri; // triangle
        s.numberOfSide();

        s = hexa; // hexagon
        s.numberOfSide();
    }

}