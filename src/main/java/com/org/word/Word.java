package com.org.word;

public class Word {
    // 1 * driveway 차고 진입로
    private int num;
    private int level;
    private String name;
    private String meaning;
    Word(){}
    public Word(int num, int level, String name, String meaning) {
        this.num = num;
        this.level = level;
        this.name = name;
        this.meaning = meaning;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }
}
