/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.SOAFishPond;

import java.util.ArrayList;
import java.util.List;

public class FishPool {
    public static List<Fish> fishes=new ArrayList<>();
    static{
        fishes.addAll(List.of(new Fish("GaGaLaLa", "red", "blue"), new Fish("Bill", "blue", "blue"), new Fish("Pikachu", "yellow", "yellow")));
    }
}
