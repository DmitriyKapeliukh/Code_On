package intro;

/**
 * Created by Dmytro_Kapeliukh on 3/26/2016.
 */
public class PhraseOMatic {
    public static void main (String[] arg) {
        String[] worldListOne = {"круглосуточный", "механизм", "трех-звезый", "3000-футовый", "опа-опа-опапа", "взаимный",
        "общий выиграш", "фронтэнд", "бэкэнд", "на основе вэб-технологий", "проникающий", "умный", "метод критического пути",
        "динамичный"};
        String[] worldListTwo = {"уполномоченый", "логистика", "трудный", "чистый продукт", "ориентированый", "центральный",
        "респределенный", "фирменый", "нестандартный ум", "фрактальные числа", "сетевой", "вэб-аналитика", "сфокусированый",
        "общий", "совместный"};
        String[] worldListThree = {"процесс", "пункт разгрузки", "выход из положения", "тип структуры", "талант", "подход",
         "уровень кода", "портал", "период времени", "обзор", "образец", "пункт следования"};

                int oneLength = worldListOne.length;
                int twoLength = worldListTwo.length;
                int threeLength = worldListThree.length;
                int rand1 = (int) (Math.random() * oneLength);
                int rand2 = (int) (Math.random() * twoLength);
                int rand3 = (int) (Math.random() * threeLength);

        String phrase = worldListOne[rand1] + " " +
                worldListTwo[rand2] + " " + worldListThree[rand3];

        System.out.println("Все, что нам нужно, - это " + phrase);
    }
}
