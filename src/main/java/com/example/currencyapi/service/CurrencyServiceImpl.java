package com.example.currencyapiexam.service;

import com.example.currencyapiexam.dto.RequestDTO;
import com.example.currencyapiexam.dto.request.CurrencyRequest;
import com.example.currencyapiexam.model.Currency;

import java.time.LocalDate;
import java.util.List;

public class CurrencyServiceImpl implements CurrencyService {
    @Override
    public List<Currency> getAll() {
        return null;
    }

    @Override
    public RequestDTO currencyExchange(LocalDate date, CurrencyRequest request) {
        return null;
    }
}
