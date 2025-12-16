package com.example.calculator.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@WebMvcTest(CalculatorController.class)
public class CalculatorControllerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    void messageWelcome() throws Exception {
        RequestBuilder request = get("/calculator/welcome");
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals("Bem vindo à CALCULATOR API REST.", result.getResponse().getContentAsString());
    }

    @Test
    void addNumbers() throws Exception {
        MvcResult result = mvc.perform(get("/calculator/addNumbers?number1=2&number2=3")).andReturn();
        assertEquals("5.0", result.getResponse().getContentAsString());
    }

    @Test
    void subNumbers() throws Exception {
        MvcResult result = mvc.perform(get("/calculator/subNumbers?number1=5&number2=2")).andReturn();
        assertEquals("3.0", result.getResponse().getContentAsString());
    }

    @Test
    void divideNumbers() throws Exception {
        MvcResult result = mvc.perform(get("/calculator/divideNumbers?number1=6&number2=2")).andReturn();
        assertEquals("3.0", result.getResponse().getContentAsString());
    }

    @Test
    void factorial() throws Exception {
        MvcResult result = mvc.perform(get("/calculator/factorial?factorial=5")).andReturn();
        assertEquals("120", result.getResponse().getContentAsString());
    }

    @Test
    void calculeDayBetweenDate() throws Exception {
        MvcResult result = mvc.perform(get("/calculator/calculeDayBetweenDate?localDate1=2020-03-15&localDate2=2020-03-29")).andReturn();
        assertEquals("14", result.getResponse().getContentAsString());
    }

    @Test
    void integerToBinary() throws Exception {
        MvcResult result = mvc.perform(get("/calculator/integerToBinary?number1=5")).andReturn();
        assertEquals("101", result.getResponse().getContentAsString());
    }

    @Test
    void integerToHexadecimal() throws Exception {
        MvcResult result = mvc.perform(get("/calculator/integerToHexadecimal?number1=10")).andReturn();
        assertEquals("A", result.getResponse().getContentAsString());
    }
}
