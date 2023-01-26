package APCSA.Abstractpets;

public abstract class Pet {
    private String name;
    private Pet(){}
    protected Pet(String name) {
        this.name = name;
    }

    public abstract String speak();

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
