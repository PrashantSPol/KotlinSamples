package com.polstech.kotlinsamples._0_petSample;

import java.util.List;

/**
 * Created by prashantspol on 11/9/2017.
 */

public class PetStoreJava {
    List<Pet> pets;

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    public Pet findPet(String name) {
        for (Pet pet : pets) {
            if(pet.name.equals(name)) {
                return pet;
            }
        }
        return null;
    }
}
