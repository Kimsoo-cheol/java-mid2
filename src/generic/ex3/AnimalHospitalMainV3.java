package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {
    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospiital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> catHospiital = new AnimalHospitalV3<>();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        dogHospiital.set(dog);
        dogHospiital.checkup();

        catHospiital.set(cat);
        catHospiital.checkup();

//         문제1: 개 병원에 고양이 전달
//        dogHospiital.set(cat); //매개변수 체크 실패: 컴파일 오류가 발생하지 않는다.

        // 문제2: 개 타입 반환
        dogHospiital.set(dog);
//        Dog biggerDog = dogHospiital.bigger(new Dog("멍멍이2", 200));
        Dog biggerDog = dogHospiital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}
