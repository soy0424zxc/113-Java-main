public abstract class Airplane implements Flyer {
    private String name;
    
    public Airplane(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
//    @Override
//    public void fly() {
//        System.out.printf("飛機 %s 在飛%n", name);
//    }
}