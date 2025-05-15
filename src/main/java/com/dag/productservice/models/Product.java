package com.dag.productservice.models;

import java.util.UUID;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "products")
public class Product extends V0 {
    @Column
    @NonNull
    String name;
    @Column
    private String title;
    @Column
    private String description;
    @Column
    private String image;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, fetch = FetchType.LAZY)
    @JoinColumn(name = "price_id")
    private Price price;

    // @Override
    // public String toString() {
    //     return "Product [title=" + title + ", description=" + description + ", image=" + image + ", category="
    //             + category + ", Id=" + Id + ", price=" + price + "]";
    // }
}
