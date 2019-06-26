package br.ufal.aracomp.lp3;

public class Item {
    private String name;
    private float grades;

    public Item(String name, float grades) {
        setName(name);
        setGrades(grades);
    }

    public float getGrades() {
        return this.grades;
    }

    public void setGrades(float grades) {
        this.grades = grades;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}