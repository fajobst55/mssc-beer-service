package guru.springframework.msscbeerservice.services.inventory;

import guru.springframework.msscbeerservice.bootstrap.BeerLoader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@Disabled
@SpringBootTest
public class BeerInventoryServiceRestTemplateImpl {

    @MockBean
    BeerInventoryService beerInventoryService;

    @BeforeEach
    void setUp() {

    }
    @Test
    void getOnhandInventory() {
 //       Integer qoh = beerInventoryService.getOnhandInventory(BeerLoader.BEER_1_UUID);

 //       System.out.println("Quantity on Hand : "+qoh);

    }
}
