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
@Table(name = "tb_table")
public class RestaurantTable {
    @Id
    @Column(name = "id_table")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "nr_table")
    private Integer number;

    @Column(name = "ds_qr_code")
    private String qrCode;

    @Column(name = "fk_restaurant")
    private Long restaurant;
}
