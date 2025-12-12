package org.fotm.graphqljavabook.api;


import java.util.List;
import org.fotm.graphqljavabook.dto.Pet;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
class PetsController {
  @QueryMapping
  List<Pet> pets() {
    return List.of(
        new Pet("Luna", "cappuccino"), new Pet("Skipper", "black"));
  }

}
