package dev.kmz.FirstCRUDSpring;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_items_register")
public class ItemsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    float value;
    int quantity;

    public ItemsModel(String name, float value, int quantity) {
        this.name = name;
        this.value = value;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
