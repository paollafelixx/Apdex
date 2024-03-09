package com.apdex;

import org.junit.*;

public class ApdexTest {

    @Test
    public void validarApdexExcelente(){
        //arrange
        Apdex apdex = new Apdex();

        //act
        float score = apdex.calcularApdex(1000, 0, 1000);

        //assert
        Assert.assertEquals(1, score, 0.001);
    }

    @Test
    public void validarApdexBom(){
        //arrange
        Apdex apdex = new Apdex();

        //act
        float score = apdex.calcularApdex(870, 40, 1000);

        //assert
        Assert.assertEquals(0.93, score, 0.001);
    }

    @Test
    public void validarApdexRazoavel(){
        //arrange
        Apdex apdex = new Apdex();

        //act
        float score = apdex.calcularApdex(770, 60, 1000);

        //assert
        Assert.assertEquals(0.84, score, 0.001);
    }

    @Test
    public void validarApdexRuim(){
        //arrange
        Apdex apdex = new Apdex();

        //act
        float score = apdex.calcularApdex(590, 0, 1000);

        //assert
        Assert.assertEquals(0.69, score, 0.001);
    }

    @Test
    public void validarApdexInaceitavel(){
        //arrange
        Apdex apdex = new Apdex();

        //act
        float score = apdex.calcularApdex(230, 460, 1000);

        //assert
        Assert.assertEquals(0.49, score, 0.001);
    }
}
