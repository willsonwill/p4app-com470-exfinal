/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.com470.p4app.service;

import com.com470.p4app.model.MinimoMaximo;
import java.util.Arrays;
import java.util.List;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author WILL
 */
public class BuscarMinimoMaximoTest {
    
    public BuscarMinimoMaximoTest() {
    }
    
    private BuscarMinimoMaximo utils = new BuscarMinimoMaximo();
    
    
    @Test
    public void testBuscaMinimoMaximoUno() {
        List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7,8,9);
        MinimoMaximo resultado = new MinimoMaximo(1, 9);
        
        assertThat(utils.buscaMinimoMaximo(lista), Matchers.is(resultado));
        assertThat(utils.buscaMinimoMaximo(lista), Matchers.equalTo(resultado));
        assertThat(utils.buscaMinimoMaximo(lista), Matchers.equalToObject(resultado));
        assertThat(utils.buscaMinimoMaximo(lista), Matchers.notNullValue());
        
    }
    @Test
    public void testBuscaMinimoMaximoDos() {
        List<Integer> lista = Arrays.asList(1,-1,3,4,5,6,7,9,9);
        MinimoMaximo resultado = new MinimoMaximo(-1, 9);
        
        assertThat(utils.buscaMinimoMaximo(lista), Matchers.is(resultado));
        assertThat(utils.buscaMinimoMaximo(lista), Matchers.equalTo(resultado));
        assertThat(utils.buscaMinimoMaximo(lista), Matchers.equalToObject(resultado));
        assertThat(utils.buscaMinimoMaximo(lista), Matchers.notNullValue());
    }
    
    @Test
    public void testBuscaMinimoMaximoTres() {
        List<Integer> lista = Arrays.asList(1,-1,3,4,5,6,7,8,9,0);
        MinimoMaximo resultado = new MinimoMaximo(-1, 9);
        
        assertThat(utils.buscaMinimoMaximo(lista), Matchers.is(resultado));
        assertThat(utils.buscaMinimoMaximo(lista), Matchers.equalTo(resultado));
        assertThat(utils.buscaMinimoMaximo(lista), Matchers.equalToObject(resultado));
        assertThat(utils.buscaMinimoMaximo(lista), Matchers.notNullValue());
    }

    
}
