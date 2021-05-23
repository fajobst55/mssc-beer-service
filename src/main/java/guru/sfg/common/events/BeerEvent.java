package guru.sfg.common.events;


import guru.springframework.msscbeerservice.web.model.BeerDto;
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
