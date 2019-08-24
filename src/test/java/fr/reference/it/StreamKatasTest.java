package fr.reference.it;

import fr.reference.it.fr.reference.it.dto.Personne;
import org.junit.Test;

import static java.util.Arrays.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class StreamKatasTest {

    @Test
    public void toUpperCaseTest()
    {
        List<String> collection = asList("My","Name","is","Jaouad");
        List<String> expected   = asList("MY","NAME","IS","JAOUAD");
        assertTrue(StreamKatas.transformToUpperCase(collection).containsAll(expected));
    }

    @Test
    public void filterLengthTest()
    {
        List<String> collection = asList("My","Name","is","Jaouad");
        List<String> expected   = asList("My","is");
        assertTrue(StreamKatas.filterWithLength(collection).containsAll(expected));
    }
    @Test
    public void flatCollectionTest()
    {
        List<List<String>> collections = asList(asList("my","name","is"),asList("jaouad","hba"));
        List<String> expected = asList("my","name","is","jaouad","hba");
        assertTrue(StreamKatas.falatCollection(collections).containsAll(expected));
    }

    @Test
    public void maxAgePersonne()
    {
        Personne p1 = new Personne("Jaouad Hba",24 );
        Personne p2 = new Personne("Will Smith",45);
        Personne p3 = new Personne("David",35);
        List<Personne> personnes =  asList(p1,p2,p3);
        assertEquals(p2,StreamKatas.getOlderPerson(personnes));
    }

    @Test
    public void SumOfNumbers()
    {
        List<Integer> numbers = Arrays.asList(1,2,3,4);
        int expected = 10;
        assertEquals(expected,StreamKatas.sumOfNumbers(numbers));
    }


    @Test
    public void personeWithAgeUnder18()
    {
        Personne p1 = new Personne("Jaouad Hba",24);
        Personne p2 = new Personne("Will Smith",12 );
        Personne p3 = new Personne("David",17 );
        List<Personne> personnes =  asList(p1,p2,p3);
        List<String> expectedNames = Arrays.asList("David","Will Smith");
        assertTrue(StreamKatas.personeUnder18(personnes).containsAll(expectedNames));
    }


}
