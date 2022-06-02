package codewars.fundamentals;

import org.junit.jupiter.api.Test;
import org.springframework.jmx.export.naming.IdentityNamingStrategy;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FilterListTest {

    @Test
    public void examples() {
        assertEquals(List.of(1, 2), FilterList.filterList(List.of(1, 2, "a", "b")), "For input: [1, 2, \"a\", \"b\"]");
        assertEquals(List.of(1, 0, 15), FilterList.filterList(List.of(1, "a", "b", 0, 15)), "For input: [1, \"a\", \"b\", 0, 15]");
        assertEquals(List.of(1, 2, 123), FilterList.filterList(List.of(1, 2, "aasf", "1", "123", 123)), "For input: [1, 2, \"aasf\", \"1\", \"123\", 123]");
    }

    @Test
    public void firstSimpleTest() {
        // given
        List<Object> myList = List.of(5, 6, 8, 11, "d", "dd", "F", "This is the long version of a string.");
        // when
        List<Object> myFilteredList = FilterList.filterList(myList);
        // then
        assertEquals(List.of(5, 6, 8, 11), myFilteredList);
    }
}