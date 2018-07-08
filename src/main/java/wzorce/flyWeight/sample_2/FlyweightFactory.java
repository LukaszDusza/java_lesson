package wzorce.flyWeight.sample_2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

//Tworzymy klasę FlyweightFactory, w której będzie cała logika omawianego wzorca.
// W metodzie createRelation sprawdzamy, czy obiekt o podanym opisie już istnieje.
// Jeśli nie, to tworzymy ten obiekt i wyświetlamy komunikat użytkownikowi.
// W przeciwnym wypadku pobieramy obiekt z tym parametrem z HashMapy.

public class FlyweightFactory {
    private Map<String, Relation> relations = Collections.synchronizedMap(new HashMap());

    public synchronized Relation createRelation(String description){
        Relation relation = relations.get(description);
        if(relation == null) {
            relation = new Relation(description);
            relations.put(description, relation);
            System.out.println("Creating new relation: " + relation.getDescription());
        }
        return relation;
    }
}
