package com.example.currencyapiexam.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "currencies")
public class Currency {
    private LocalDate date;
    private String fromCurrency;
    private String toCurrency;
    private String response;

}
