package com.ros.ms_order.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_product")
    private Long id;

    @Column(name = "nm_product")
    private String name;

    @Column(name = "ds_product")
    private String description;

    @Column(name = "nr_order")
    private Integer order;

    @Column(name = "fk_image")
    private Long image;

    @ManyToOne
    @JoinColumn(name = "fk_category")
    private Category category;

    @Column(name = "fk_restaurant")
    private Long restaurant;
}
