import static org.junit.Assert.assertEquals;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    @Before
    public void createList() {
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest() {
        int listSize = list.getCount();
        list.addCity(new City("Halifax", "NS"));

        // The new list should be equal to the size of the list before + 1.
        // This is to test if that adding function actually worked.
        assertEquals(listSize+1, list.getCount());
    }

    @Test
    public void hasCityTest(){
       assertEquals(true, list.hasCity("Calgary", "AB"));
    }
}
