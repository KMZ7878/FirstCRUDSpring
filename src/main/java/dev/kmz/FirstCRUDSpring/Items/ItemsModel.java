package dev.kmz.FirstCRUDSpring.Items;

import dev.kmz.FirstCRUDSpring.Customer.CustomersModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_items")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private float value;
    private int quantity;

    //One item can be for many customers
    @OneToMany(mappedBy = "items")
    private List<CustomersModel> customers;
}

