package pl.kczk.przepisy.web.przepisycoresb.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RecipeToIngredient {

    @Id
    @GeneratedValue
    private Long id;
    @OneToOne
    private Ingredient ingredient;
    private Long amount;
}
