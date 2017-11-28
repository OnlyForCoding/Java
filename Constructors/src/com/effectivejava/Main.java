package com.effectivejava;

/**
 * Created by jitendra on 26/11/17.
 */
public class Main {

    public static void main(String[] args) {

        NutritionFacts coco = new NutritionFacts.Builder(234,56)
                .calories(123).carbohydrate(231).fat(32).sodium(45).builder();

        System.out.println("colories = "+coco.getCalories());
        System.out.println("carbohydrate = "+coco.getCarbohydrate());
        System.out.println("fat = "+coco.getFat());
        System.out.println("servings = "+coco.getServings());

    }
}
