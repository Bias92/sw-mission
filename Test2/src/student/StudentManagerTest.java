package student;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
  class StudentManagerTest {
        private static StudentManager manager;
        @BeforeAll
        static void setUp() {
                  manager = new StudentManager();
        }
        @Test
        @Order(1)
        void addStudentTest() {
                  manager.addStudent("김재");
                  assertTrue(manager.hasStudent("김재"));
        }
        @Test
        @Order(2)
        void removeStudentTest() {
                  manager.removeStudent("김재");
                  assertFalse(manager.hasStudent("김재"));
        }
        @Test
        @Order(3)
        void addDuplicateStudentThrowsException() {
                  manager.addStudent("김");
                  assertThrows(IllegalArgumentException.class, () -> {
                                manager.addStudent("김");
                  });
        }
        @Test
        @Order(4)
        void removeMissingStudentThrowsException() {
                  assertThrows(IllegalArgumentException.class, () -> {
                                manager.removeStudent("4분반");
                  });
        }
  }
