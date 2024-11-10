<<<<<<< HEAD
/*
1. Create one superclass HillStations and three subclasses Manali, Mussoorie, Gulmarg. Subclasses extend the superclass and override its location() and famousFor() method. i.call the location() and famousFor() method by the Parent class’, i.e. Hillstations class. As it refers to the base class object and the base class method overrides the superclass method; the base class method is invoked at runtime. ii.call the location() and famousFor() method by the all subclass’,and print accordingly.
 */
public class ques1 {
    public static void main(String[] args) {
        HillStations A = new HillStations();
        HillStations M = new Manali();
        HillStations Mu = new Mussoorie();
        HillStations G = new Gulmarg();

        A.location();
        A.famousFor();

        M.location();
        M.famousFor();

        Mu.location();
        Mu.famousFor();

        G.location();
        G.famousFor();
    }
}

class HillStations {
    void location() {
        System.out.println("Location is:");
    }

    void famousFor() {
        System.out.println("Famous for:");
    }
}

class Manali extends HillStations {
    @Override
    void location() {
        System.out.println("Manali is in Himachal Pradesh.");
    }

    @Override
    void famousFor() {
        System.out.println("It is famous for Hadimba Temple and adventure sports.");
    }
}

class Mussoorie extends HillStations {
    @Override
    void location() {
        System.out.println("Mussoorie is in Uttarakhand.");
    }

    @Override
    void famousFor() {
        System.out.println("It is famous for educational institutions.");
    }
}

class Gulmarg extends HillStations {
    @Override
    void location() {
        System.out.println("Gulmarg is in Jammu and Kashmir.");
    }

    @Override
    void famousFor() {
        System.out.println("It is famous for skiing.");
    }
}
=======
/*
1. Create one superclass HillStations and three subclasses Manali, Mussoorie, Gulmarg. Subclasses extend the superclass and override its location() and famousFor() method. i.call the location() and famousFor() method by the Parent class’, i.e. Hillstations class. As it refers to the base class object and the base class method overrides the superclass method; the base class method is invoked at runtime. ii.call the location() and famousFor() method by the all subclass’,and print accordingly.
 */
public class ques1 {
    public static void main(String[] args) {
        HillStations A = new HillStations();
        HillStations M = new Manali();
        HillStations Mu = new Mussoorie();
        HillStations G = new Gulmarg();

        A.location();
        A.famousFor();

        M.location();
        M.famousFor();

        Mu.location();
        Mu.famousFor();

        G.location();
        G.famousFor();
    }
}

class HillStations {
    void location() {
        System.out.println("Location is:");
    }

    void famousFor() {
        System.out.println("Famous for:");
    }
}

class Manali extends HillStations {
    @Override
    void location() {
        System.out.println("Manali is in Himachal Pradesh.");
    }

    @Override
    void famousFor() {
        System.out.println("It is famous for Hadimba Temple and adventure sports.");
    }
}

class Mussoorie extends HillStations {
    @Override
    void location() {
        System.out.println("Mussoorie is in Uttarakhand.");
    }

    @Override
    void famousFor() {
        System.out.println("It is famous for educational institutions.");
    }
}

class Gulmarg extends HillStations {
    @Override
    void location() {
        System.out.println("Gulmarg is in Jammu and Kashmir.");
    }

    @Override
    void famousFor() {
        System.out.println("It is famous for skiing.");
    }
}
>>>>>>> d5fa77123764c975fd733818b5f9fbfcee1af006
