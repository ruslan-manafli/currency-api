package com.example.currencyapiexam.controller;

import com.example.currencyapiexam.dto.request.CurrencyRequest;
import com.example.currencyapiexam.dto.response.CurrencyResponse;
import com.example.currencyapiexam.service.CurrencyService;
import com.example.currencyapiexam.service.CurrencyServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/currency")
public class CurrencyController {
    private final CurrencyService currencyService;

}
@PostMapping
public ResponseEntity<CurrencyResponse> currencyExchange(
        @RequestParam(value="date", required = false)
        @DateTimeFormat(pattern = "YYYY-MM-DD") LocalDate date,
        @RequestBody CurrencyRequest request){

    currencyService.


    return CurrencyResponse;
}


}
