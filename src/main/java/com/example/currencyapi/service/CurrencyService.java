package com.example.currencyapiexam.service;

import com.example.currencyapiexam.dto.RequestDTO;
import com.example.currencyapiexam.dto.request.CurrencyRequest;
import com.example.currencyapiexam.model.Currency;

import java.time.LocalDate;
import java.util.List;

public interface CurrencyService {
    List<Currency> getAll();
    RequestDTO currencyExchange(LocalDate date, CurrencyRequest request);


}
