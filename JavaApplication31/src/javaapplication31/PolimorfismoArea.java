/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication31;

/**
 *
 * @author Luís Fernando
 */
public class PolimorfismoArea {
    float area (float ladoQuadrado){
        System.out.println("Area do quadrado:");
        return (ladoQuadrado*ladoQuadrado);
    }
    float area (float altura,float largura){
        System.out.println("Area do retângulo:");
        return (altura*largura);
    }

    
}
