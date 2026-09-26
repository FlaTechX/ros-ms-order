package com.ros.ms_order.domain.model;

import com.ros.ms_order.domain.enums.StatusEnum;
import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_variant")
public class Variant {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_variant")
    private Long id;

    @Column(name = "nm_variant")
    private  String name;

    @Column(name = "nr_price", precision = 10, scale = 2)
    private BigDecimal price;

    @Column(name = "tp_status")
    private StatusEnum status;

    @ManyToOne
    @JoinColumn(name = "fk_product")
    private Product product;
}
