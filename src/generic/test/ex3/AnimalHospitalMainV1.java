package generic.test.ex3;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {
        AnimalHospitalV1 dogHospiital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospiital = new AnimalHospitalV1();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        dogHospiital.set(dog);
        dogHospiital.checkup();

        catHospiital.set(cat);
        catHospiital.checkup();

//         문제1: 개 병원에 고양이 전달
        dogHospiital.set(cat); //매개변수 체크 실패: 컴파일 오류가 발생하지 않는다.

        // 문제2: 개 타입 반환
        dogHospiital.set(dog);
        dogHospiital.set(cat);
//        Dog biggerDog = dogHospiital.bigger(new Dog("멍멍이2", 200));
        Dog biggerDog = (Dog) dogHospiital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}
