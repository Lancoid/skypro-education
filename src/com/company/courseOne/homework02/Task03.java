package com.company.courseOne.homework02;

/*
 * За весом спортсмена следит не только сам спортсмен, но и его тренер.
 * Он достигается и поддерживается упорными тренировками и сбалансированным питанием.
 *
 * Вот один из рецептов завтрака перед тренировкой, который получил наш спортсмен для поддержания формы:
 * – Бананы – 5 штук (1 банан - 80 грамм); --------- 400гр
 * – Молоко – 200 мл (100 мл = 105 грамм); --------- 210гр
 * – Мороженое пломбир – 2 брикета по 100 грамм; --- 200гр
 * – Яйца сырые – 4 яйца (1 яйцо - 70 грамм). ------ 280гр
 * Смешать всё в блендере и готово.
 *
 * Подсчитайте вес (количество грамм) такого спорт-завтрака, а затем переведите его в килограммы.
 * Результат напечатайте в консоль.
 */
public class Task03 {
    public static void main(String[] args) {
        int bananaTotalVolume = 5;
        int bananaDimension = 1;
        int oneBananaDimensionWeight = 80;

        int milkTotalVolume = 200;
        int milkDimension = 100;
        int oneMilkDimensionWeight = 105;

        int iceCreamTotalVolume = 2;
        int iceCreamDimension = 1;
        int oneIceCreamDimensionWeight = 100;

        int eggTotalVolume = 4;
        int eggDimension = 1;
        int oneEggDimensionWeight = 70;

        int bananaTotalWeight = getWight(bananaTotalVolume, bananaDimension, oneBananaDimensionWeight);
        int milkTotalWeight = getWight(milkTotalVolume, milkDimension, oneMilkDimensionWeight);
        int iceCreamTotalWeight = getWight(iceCreamTotalVolume, iceCreamDimension, oneIceCreamDimensionWeight);
        int eggTotalWeight = getWight(eggTotalVolume, eggDimension, oneEggDimensionWeight);

        float totalWeight = bananaTotalWeight + milkTotalWeight + iceCreamTotalWeight + eggTotalWeight;

        System.out.println("Вес спорт-завтрака - " + totalWeight / 1000 + " кг.");
    }

    private static int getWight(int totalVolume, int dimension, int oneDimensionWeight) {
        return (totalVolume / dimension) * oneDimensionWeight;
    }
}
