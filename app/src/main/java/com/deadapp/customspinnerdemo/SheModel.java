package com.deadapp.customspinnerdemo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by luizkawai on 21/07/17.
 */

class SheModel implements Serializable {


    private int id;
    private String name;
    private ArrayList<SheHobbiesModel> sheHobbiesModels;

    public SheModel() {
    }

    public SheModel(int id, String name, ArrayList<SheHobbiesModel> sheHobbiesModels) {
        this.id = id;
        this.name = name;
        this.sheHobbiesModels = sheHobbiesModels;
    }

    static ArrayList<SheModel> getMockData() {

        ArrayList<SheModel> sheModels = new ArrayList<>();

        sheModels.add(new SheModel(1, "Geraldine", SheHobbiesModel.getHerHobbies()));
        sheModels.add(new SheModel(2, "Josselyn", SheHobbiesModel.getHerHobbies()));
        sheModels.add(new SheModel(3, "Mariel", SheHobbiesModel.getHerHobbies()));
        sheModels.add(new SheModel(4, "Agnela", SheHobbiesModel.getHerHobbies()));
        sheModels.add(new SheModel(5, "Antonella", SheHobbiesModel.getHerHobbies()));
        sheModels.add(new SheModel(6, "Sandra", SheHobbiesModel.getHerHobbies()));
        sheModels.add(new SheModel(7, "Katiuska", SheHobbiesModel.getHerHobbies()));

        return sheModels;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<SheHobbiesModel> getSheHobbiesModels() {
        return sheHobbiesModels;
    }

    public void setSheHobbiesModels(ArrayList<SheHobbiesModel> sheHobbiesModels) {
        this.sheHobbiesModels = sheHobbiesModels;
    }
}
