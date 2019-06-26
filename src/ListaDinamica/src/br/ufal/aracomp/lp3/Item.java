package br.ufal.aracomp.lp3;

public class Item {
    private String name;
    private float grades;
    private Item next;

    public Item(String name, float grades) {
        setName(name);
        setGrades(grades);

        this.next = null;
    }

    @Override
    public String toString() {
        return getName() + " -==- " + getGrades();
    }

    public Item getNext() {
        return next;
    }

    public void setNext(Item next) {
        this.next = next;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGrades() {
        return grades;
    }

    public void setGrades(float grades) {
        this.grades = grades;
    }
}
