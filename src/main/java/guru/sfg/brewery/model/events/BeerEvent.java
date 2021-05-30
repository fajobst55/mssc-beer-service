package guru.sfg.brewery.model.events;


import guru.sfg.brewery.model.BeerDto;
import lombok.*;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BeerEvent implements Serializable {

    static final long serialVersionUID = 7534116684480527094L;

    private BeerDto beerDto;

}
