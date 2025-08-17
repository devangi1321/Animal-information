package Sounds;

public class Sounds {
    //class of main animal
private String name;
private String habitat;
private int legs;
private boolean tail;
private boolean trunk;
private String color;
private String sound;
//name,habitat,legs,tail,trunk,color,sound

//constructor
    public Sounds(String name, String habitat, int legs, boolean tail, boolean trunk, String color, String sound) {
        this.name = name;
        this.habitat = habitat;
        this.legs = legs;
        this.tail = tail;
        this.trunk = trunk;
        this.color = color;
        this.sound = sound;
    }

//getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public boolean isTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    public boolean isTrunk() {
        return trunk;
    }

    public void setTrunk(boolean trunk) {
        this.trunk = trunk;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
