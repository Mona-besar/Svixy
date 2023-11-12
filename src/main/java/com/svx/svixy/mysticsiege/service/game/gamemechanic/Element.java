package com.svx.svixy.mysticsiege.service.game.gamemechanic;

import java.util.HashMap;
import java.util.Map;

public class Element {
    // Defined variables
    public static final String FIRE = "fireElement";
    public static final String WATER = "waterElement";
    public static final String WIND = "windElement";
    public static final String EARTH = "earthElement";
    public static final String DARK = "darkElement";
    public static final String LIGHT = "lightElement";
    public static final String VOID = "noElement";


    // Element affinity: follows the element affinity diagram in documentation
    public static final Map<String, Map<String, Double>> AFFINITY_MAP = new HashMap<>();
    static {
        Map<String, Double> fireAffinity = new HashMap<>();
        fireAffinity.put(WATER, 0.8);
        fireAffinity.put(DARK, 0.8);
        fireAffinity.put(LIGHT, 0.8);
        fireAffinity.put(WIND, 1.2);
        fireAffinity.put(VOID, 1.2);
        AFFINITY_MAP.put(FIRE, fireAffinity);

        Map<String, Double> windAffinity = new HashMap<>();
        windAffinity.put(FIRE, 0.8);
        windAffinity.put(DARK, 0.8);
        windAffinity.put(LIGHT, 0.8);
        windAffinity.put(EARTH, 1.2);
        windAffinity.put(VOID, 1.2);
        AFFINITY_MAP.put(WIND, windAffinity);

        Map<String, Double> earthAffinity = new HashMap<>();
        earthAffinity.put(WIND, 0.8);
        earthAffinity.put(DARK, 0.8);
        earthAffinity.put(LIGHT, 0.8);
        earthAffinity.put(WATER, 1.2);
        earthAffinity.put(VOID, 1.2);
        AFFINITY_MAP.put(EARTH, earthAffinity);

        Map<String, Double> waterAffinity = new HashMap<>();
        waterAffinity.put(EARTH, 0.8);
        waterAffinity.put(DARK, 0.8);
        waterAffinity.put(LIGHT, 0.8);
        waterAffinity.put(FIRE, 1.2);
        waterAffinity.put(VOID, 1.2);
        AFFINITY_MAP.put(WATER, waterAffinity);

        Map<String, Double> lightDarkAffinity = new HashMap<>();
        lightDarkAffinity.put(FIRE, 1.2);
        lightDarkAffinity.put(WIND, 1.2);
        lightDarkAffinity.put(EARTH, 1.2);
        lightDarkAffinity.put(WATER, 1.2);
        lightDarkAffinity.put(VOID, 1.2);
        AFFINITY_MAP.put(LIGHT, lightDarkAffinity);
        AFFINITY_MAP.put(DARK, lightDarkAffinity);
    }
}
