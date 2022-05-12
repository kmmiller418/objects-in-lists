public class Animal {
    private String name;
    private boolean isDog;

    public Animal (String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    public Animal () {}

    public Animal (String name) {
        this.name = name;
    }

    public Animal (boolean isDog) {
        this.isDog = isDog;
    }

    public String getName() {
        return this.name;
    }

    public boolean getIsDog() {
        return this.isDog;
    }

    public void setIsDog(boolean isDog) {
        this.isDog = isDog;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.getName() + " is a dog = " + this.getIsDog();
    }
}
