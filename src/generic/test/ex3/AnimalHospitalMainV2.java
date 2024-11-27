package generic.test.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV2 {
    public static void main(String[] args) {
        AnimalHospitalV2<Dog> dogHospiital = new AnimalHospitalV2();
        AnimalHospitalV2<Cat> catHospiital = new AnimalHospitalV2();
        AnimalHospitalV2<Integer> integerHospiital = new AnimalHospitalV2();
        AnimalHospitalV2<Object> objectHospiital = new AnimalHospitalV2();

    }
}
