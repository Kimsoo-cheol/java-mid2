package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV0 {
    public static void main(String[] args) {
        DogHospiital dogHospiital = new DogHospiital();
        CatHospiital catHospiital = new CatHospiital();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        dogHospiital.set(dog);
        dogHospiital.checkup();

        catHospiital.set(cat);
        catHospiital.checkup();

//        dogHospiital.set(cat); 다른 파일 입력: 컴파일 오류

        // 문제2: 개 타입 반환
        dogHospiital.set(dog);
        Dog biggerDog = dogHospiital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}
