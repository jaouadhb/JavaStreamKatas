package fr.reference.it;

import fr.reference.it.fr.reference.it.dto.Personne;

import java.util.*;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StreamKatas {

    /**
     * Permettant de transformer les élements d'une collections toUpperCase
     * @param collection : la liste des élements
     * @return une liste tronsformer
     */
    public static List<String> transformToUpperCase(List<String> collection) {
        return collection.stream().map(String::toUpperCase).collect(toList());
    }


    public static Collection<String> filterWithLength(List<String> collection) {
        return collection.stream().filter((String word)->word.length()<4).collect(toList());
    }

    public static List<Object> falatCollection(List<List<String>> collections) {
        return collections.stream().flatMap(Collection::stream).collect(toList());
    }

    public static Personne getOlderPerson(List<Personne> personnes) {
        return personnes.stream().max(Comparator.comparingInt(Personne::getAge)).get();
    }

    public static int sumOfNumbers(List<Integer> numbers) {
        return numbers.stream().reduce(0,Integer::sum);
    }

    public static List<String> personeUnder18(List<Personne> personnes) {
        return personnes.stream().filter(personne ->personne.getAge()<18).map(Personne::getName).collect(toList());
    }


    public static IntSummaryStatistics personeStat(List<Personne> personnes) {
        return personnes.stream().mapToInt(Personne::getAge).summaryStatistics();
    }

    public static Map<Boolean,List<Personne>> partitioningByAge(List<Personne> personnes)
    {
        return personnes.stream().collect(Collectors.partitioningBy((Personne p)->p.getAge()>18));
    }

    public static Map<String,List<Personne>> groupingByNationality(List<Personne> personnes) {
        return personnes.stream().collect(Collectors.groupingBy(Personne::getNationality));
    }

    public static String joinNames(List<Personne> personnes) {
        return personnes.stream().map(Personne::getName).collect(Collectors.joining(",","Names:","."));
    }
}
