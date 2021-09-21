package com.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.Instant;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {
    @Id
    @GeneratedValue
    private Long id;
    private String label;
    private String manufacturer;
    private double price;
    private double length;
    private double width;
    private double height;
    private double weight;
    private String color;
    private String category;
    @JsonProperty("manufacturing_date")
    private Instant manufacturingDate;
    @JsonProperty("is_expired")
    private Boolean isExpired;
}
