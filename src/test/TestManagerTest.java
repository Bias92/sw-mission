package student;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
 class TestManagerTest {
	
        private static TestManager manager;
        
        @BeforeAll
        static void setUp() {
        	manager = new TestManager();
        }
      //test
  }
