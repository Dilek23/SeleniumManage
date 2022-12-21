package Day1_SeleniumMaven;

import org.junit.*;

public class C02_JunitAnnotations {
    public static void main(String[] args) {
        /*
        Test1->
        Test2->
        Test3->
        Test4->geliştirme asamasıında bu yundeb rapora dahil olmasın
        her testimizden önce ve sonra calıuşması gereken kod blogumuz mevcut
        tum testlerin öncesinde ve sonrasında calışması gereken methodlarımıız mevcut
//        1. @Test -> Marks a method as a TEST CASE.
//        2. @Before : Runs before EACH @Test annotation.
//        3. @After : Runs after EACH @Test annotation.
//        4. @BeforeClass : Runs before each class only once.
//        5. @AfterClass : Runs after each class only once.
//        6. @Ignore : Skipping a test case.


         */
    }
        @Test
        public void test01() {
            System.out.println("1.test yapiliyor...");



        }
    @Test
    public void test02() {
        System.out.println("2.test yapiliyor...");


    }
    @Test
    public void test03() {

        System.out.println("3.test yapiliyor...");

    }
    @Test
    @Ignore
        public void test04() {


            System.out.println("4.test gelistirme asamasında...");
        }
        @Before
      public void beforeEach(){
          System.out.println("Method öncesi kod blogu calıştı...");
      }
      @After

    public void afterEach(){
        System.out.println("Method sonrası kod blogu calıştı...");
    }
    @BeforeClass// classın öncesindeki çalışacak objeye
    public  static void beforeAll(){
        System.out.println("Method öncesindeki kod blogu calıştı...");
    }
    @AfterClass
    public static void afterAll(){
        System.out.println("Method sonrasındaki kod blogu calıştı...");
    }

}
