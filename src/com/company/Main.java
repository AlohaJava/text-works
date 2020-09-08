package com.company;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    Path path = Paths.get("текст.txt");
    List<String> words = Utils.getWords(path);
    System.out.println("Всего слов:" + words.size());
    System.out.println("Уникальных слов:" + Utils.countUniqueWords(words));
    System.out.println("Статистика по словам:\n"+Utils.getWordsStat(words));
    System.out.println("Уникальные слова в сортированном порядке:\n"+Utils.sortingTask(words));
    // Метод рабочий, но большой вывод Читает с конца файл
    // Utils.readFileFromBack(path);

    //Читаем N строку файла N>=1
    System.out.println(Utils.getNLine(path, 1));
    System.out.println(Utils.getNLine(path, 2));
    System.out.println(Utils.getNLine(path, 3));
    System.out.println(Utils.getNLine(path, 5));

    //Задание на итератор
    List<String> data = new ArrayList<String>();
    data.add("1");
    data.add("2");
    data.add("3");
    ReversedIter<String> reversedList = new ReversedIter<String>(data);
    for(String s : reversedList){
      System.out.println(s);
    }

  }
}
