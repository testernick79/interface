package com.nickfonseca.L09PracticeHandsOn;

public class Animal {
    // properties
    private String name;
    private float length;
    private float height;
    private float weight;
    private Boolean isGrassFeed;

    // builder constructor
    public Animal(AnimalBuilder builder) {
        this.name = builder.name;
        this.length = builder.length;
        this.height = builder.height;
        this.weight = builder.weight;
        this.isGrassFeed = builder.isGrassFed;
    }

    // getters
    public String getName() { return name; }
    public float getLength() { return length; }
    public float getHeight() { return height; }
    public float getWeight() { return weight; }
    public Boolean getIsGrassFeed() { return isGrassFeed; }

    // `AnimalBuilder` class
    public static class AnimalBuilder {
        // ...required
        private String name;
        private float length;
        private float height;
        private float weight;
        // ...optional
        private Boolean isGrassFed;

        // constructor with required properties
        public AnimalBuilder(String name, float length, float height, float weight) {
            this.name = name;
            this.length = length;
            this.height = height;
            this.weight = weight;
            isGrassFed = false;
        }

        // setters for optional properties
        public AnimalBuilder setIsGrassFed(Boolean isGrassFed) {
            this.isGrassFed = isGrassFed;
            return this;
        }

        // build method
        public Animal build() {
            return new Animal(this);
        }
    }
}
