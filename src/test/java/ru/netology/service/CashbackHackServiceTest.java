package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void ShoutNotTellAddToAmount(){
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }
    @org.junit.Test
    public void ShoutTellAddToAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }

}