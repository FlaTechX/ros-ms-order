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
@Table(name = "tb_category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_category")
    private Long id;

    @Column(name = "nm_category")
    private String name;

    @Column(name = "ds_category")
    private String description;

    @Column(name = "nr_category")
    private Integer order;
}
