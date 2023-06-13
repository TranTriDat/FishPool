/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.SOAFishPond.api;

import com.example.SOAFishPond.Fish;
import com.example.SOAFishPond.FishPool;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FishAPIController {

    @GetMapping("/api/fishes")
    public List<Fish> getFishes() {
        return FishPool.fishes;
    }

    @PostMapping("/api/fish")
    public void addFish(@RequestBody Fish fish) {
        List<Fish> fishes = getFishes();
        fishes.add(fish);
    }

    @PutMapping("/api/fish")
    public void updateFish(@RequestBody Fish fish) {
        List<Fish> fishes = getFishes();
        for (Fish a : fishes) {
            if (a.getName().equals(fish.getName())) {
                a.setHeadColor(fish.getHeadColor());
                a.setBodyColor(fish.getBodyColor());
            }
        }
    }

    @DeleteMapping("/api/fish/name/{name}")
    public void removeFish(@PathVariable String name) {
        List<Fish> fishes = getFishes();
        for (Fish a : fishes) {
            if (name.equals(a.getName())) {
                fishes.remove(a);
            }
        }
    }
}
