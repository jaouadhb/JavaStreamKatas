package fr.reference.it;

import fr.reference.it.fr.reference.it.dto.Personne;
import org.junit.Before;
import org.junit.Test;
import static  java.util.Arrays.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

public class PersoneStats {
    private  List<Personne> personnes;

    @Before
    public void init(){
        Personne p1 = new Personne("Jaouad Hba",24,"Morocco");
        Personne p2 = new Personne("Will Smith",12,"Morocco");
        Personne p3 = new Personne("David",17,"France");
        personnes = asList(p1,p2,p3);
    }
    @Test
    public void personeAvrgAgeTest()
    {
        assertEquals((double)(24+12+17)/3,(double)StreamKatas.personeStat(personnes).getAverage(),0);
    }

    @Test
    public void personeMaxAgeTest()
    {
        assertEquals(24,StreamKatas.personeStat(personnes).getMax());
    }
    @Test
    public void personeMinAgeTest()
    {
        assertEquals(12,StreamKatas.personeStat(personnes).getMin());
    }
    @Test
    public void personeSumAgeTest()
    {
        assertEquals(12+17+24,StreamKatas.personeStat(personnes).getSum());
    }

    @Test
    public void personePartitioningByAge()
    {
        List<Personne> under18 = asList(personnes.get(1),personnes.get(2));
        List<Personne> adults = asList(personnes.get(0));
        assertTrue(StreamKatas.partitioningByAge(personnes).get(true).containsAll(adults));
        assertTrue(StreamKatas.partitioningByAge(personnes).get(false).containsAll(under18));
    }

    @Test
    public void groupingPersoneByNationality()
    {
        List<Personne> morocco = asList(personnes.get(1),personnes.get(0));
        assertTrue(StreamKatas.groupingByNationality(personnes).get("Morocco").containsAll(morocco));
    }
    @Test
    public void joinNames()
    {
        assertEquals("Names:Jaouad Hba,Will Smith,David.",StreamKatas.joinNames(personnes));
    }
}
