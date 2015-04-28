import clojure.java.api.Clojure;
import clojure.lang.IFn;
import clojure.lang.LazySeq;

import java.util.Iterator;
import java.util.stream.IntStream;

/**
 * Created by tmullender on 28/04/15.
 */
public class Main {

    public static void main(String... args){
        final IFn require = Clojure.var("clojure.core", "require");
        require.invoke(Clojure.read("clojure-lib.core"));

        final IFn generate = Clojure.var("clojure-lib.core", "generate-sequence");
        final LazySeq result = (LazySeq) generate.invoke(10000);
        final Iterator iterator = result.iterator();
        IntStream.range(0, 5).forEach(
                nbr -> System.out.println(iterator.next())
        );
        System.out.println("Done");
    }
}
