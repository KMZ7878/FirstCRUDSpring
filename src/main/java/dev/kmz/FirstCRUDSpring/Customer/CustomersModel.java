package dev.kmz.FirstCRUDSpring.Customer;

import dev.kmz.FirstCRUDSpring.Items.ItemsModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_customers")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class CustomersModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    //One customer can have many items
    @OneToMany
    @JoinColumn(name = "item_id")
    private ItemsModel items;
}
