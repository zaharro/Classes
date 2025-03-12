abstract class Animals {
    static int numberOfAnimals = 0;
    public String name;

    public void Swims() {
    };

    public void Runs() {
    };

    public Animals(String name) {
        this.name = name;
        numberOfAnimals++;
    }
}

class Cat extends Animals {
    private static final int CATRUN = 200;

    public Cat(String name) {
        super(name);
        this.name = name;
    }

    public void Swims(int length) {
        System.out.println(name + " - кот, а коты не умеют плавать!");
    }

    public void Runs(int length) {
        System.out.println(name + " пробежал " + Math.min(length, CATRUN) + " метров");
    }
}

class Dog extends Animals {
    private static final int DOGRUN = 500;
    private static final int DOGSWIM = 10;

    public Dog(String name) {
        super(name);
        this.name = name;
    }

    public void Swims(int length) {
        System.out.println(name + " проплыл " + Math.min(length, DOGSWIM) + " метров");
    }

    public void Runs(int length) {
        System.out.println(name + " пробежал " + Math.min(length, DOGRUN) + " метров");
    }

}