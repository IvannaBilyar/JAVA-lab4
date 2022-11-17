import lab4.Student;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import java.time.LocalDate;

import static org.testng.Assert.assertEquals;

public class StudentTest {
    @Test(dataProvider = "testNameNegativeDataProvider")
    public void testSurnamePositive(String name, String surname, LocalDate birthday){
        Student obj = new Student.Builder().setName(name).setSurname(surname).setBirthday(birthday).build();
        assertEquals(obj.getName(), name);
    }

    @DataProvider
    public Object[][] testSurnameNegativeDataProvider(){
        return new Object[][] {{"mariya", "Didukh", LocalDate.of(2003,12,10)}};
    }
}
