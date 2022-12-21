package Day6_Dropdown_SeleniumWaits;

import com.github.javafaker.Faker;
import org.junit.Test;

public class C01_Faker {
//https://demo.guru99.com/test/newtours/register.php
// Faker degerler uretmek için Faker clasından bir obje uretir ve var olan metotları kullanırız.
// test aşamasında kullanılmak üzere bize random isim yada tlf adres gibi
    @Test
    public void fakerExample(){
        Faker faker=new Faker();
        System.out.println(faker.name().firstName());// bize random bir isim verir
        System.out.println(faker.address().fullAddress());

    }
}
