package com.example.fastsoccer.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "price_yard")
@Entity
public class PriceYard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "startTime")
    private String startTime;
    @Column(name = "endTime")
    private String endTime;
    @Column(name = "price")
    private String price;
    @ManyToOne
    @JoinColumn(name = "yard_id") // thông qua khóa ngoại
    @JsonIgnore
    private Yard yardId;
}
