package com.deadapp.customspinnerdemo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by luizkawai on 21/07/17.
 */

public class SheHobbiesModel implements Serializable {
    private int id;
    private String name;

    public SheHobbiesModel() {
    }

    public SheHobbiesModel(int id, String name) {
        this.id = id;
        this.name = name;
    }

    static ArrayList<SheHobbiesModel> getHerHobbies() {
        ArrayList<SheHobbiesModel> sheHobbiesModels = new ArrayList<>();
        sheHobbiesModels.add(new SheHobbiesModel(1, "Cantar"));
        sheHobbiesModels.add(new SheHobbiesModel(2, "Bailar"));
        sheHobbiesModels.add(new SheHobbiesModel(3, "Viajar"));
        sheHobbiesModels.add(new SheHobbiesModel(4, "Coquetear"));

        return sheHobbiesModels;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
