import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.*;

public class JTestProgram {

    @BeforeEach
    void  before_each(){
        System.out.println("Before each");
    }

    @AfterEach
    void after_each(){
        System.out.println("After each");
    }

    @BeforeAll
    static void before_all(){
        System.out.println("Before ALL");
    }

    @AfterAll
    static void after_all(){
        System.out.println("After ALL");
    }

    @Test
    void test_1(){
        //Assertions.ass(true);

    }

    @Test
    void test_2(){
        fail("Ohhhh no!");
    }
}
