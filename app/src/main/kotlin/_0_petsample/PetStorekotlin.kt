package _0_petsample

import com.polstech.kotlinsamples._0_petSample.Pet

/**
 * Created by prashantspol on 11/9/2017.
 */
class PetStorekotlin(var pets:List<PetKotlin>) {
    fun findPet(name : String) : PetKotlin? {
        return pets.firstOrNull { pet -> pet.name == name };
    }
}