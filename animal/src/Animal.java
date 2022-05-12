public class Animal {
    private String name;
    private boolean isDog;

    public Animal (String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    public Animal ()
    {
        this.name = "Friend";
        this.isDog = false;
    }

    public Animal (String name) {
        this.name = name;
        this.isDog = false;
    }

    public Animal (boolean isDog) {
        this.name = "Friend";
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
