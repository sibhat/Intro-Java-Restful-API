package com.lambda.country;

import java.util.concurrent.atomic.AtomicLong;

public class Country
{
    private static AtomicLong atomicLong = new AtomicLong();
    private final long id;
    private String name;
    private long population;
    private long mass;
    private float medianAge;

    public Country(String name, long population, long mass, float medianAge) {
        id = atomicLong.decrementAndGet();
        this.name = name;
        this.population = population;
        this.mass = mass;
        this.medianAge = medianAge;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public long getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public float getMedianAge() {
        return medianAge;
    }

    public void setMedianAge(float medianAge) {
        this.medianAge = medianAge;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", population=" + population +
                '}';
    }
}
