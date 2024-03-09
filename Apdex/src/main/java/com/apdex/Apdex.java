package com.apdex;

public class Apdex {

   // s satisfatorio
   //t toleravel
   //a amostra
    public float calcularApdex(float s, float t, float a){
        return(s+(t/2))/a;

    }
}
