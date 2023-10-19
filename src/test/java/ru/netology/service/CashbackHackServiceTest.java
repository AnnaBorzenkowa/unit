package ru.netology.service;


import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @org.testng.annotations.Test
    public void shouldNotTellAddToAmount(){
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void shouldTellAddToAmount(){
        CashbackHackService service = new CashbackHackService();

        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }



}