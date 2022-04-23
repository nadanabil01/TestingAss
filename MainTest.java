package com.company;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    public void system_in_Equilibrium(){
        Main equilibrium = new Main();
        int test [][]= {{4,2,1},{5,6,8},{-9,-8,-9}};
        assertEquals("Yes",equilibrium.Is_it_Equilibrium(3,test));

    }

    @Test
    public void system_in_Equilibrium2(){
        Main equilibrium = new Main();
        int test [][]= {{4,2,1},{5,6,8},{-9,-8,-9}};
        assertEquals("NO",equilibrium.Is_it_Equilibrium(3,test));

    }
    @Test
    public void system_in_Equilibrium4(){
        Main equilibrium = new Main();
        int test [][]= {{4,2,600},{45,665,875},{-964,875,-997}};
        assertEquals("Forces out of Range",equilibrium.Is_it_Equilibrium(3,test));

    }


}