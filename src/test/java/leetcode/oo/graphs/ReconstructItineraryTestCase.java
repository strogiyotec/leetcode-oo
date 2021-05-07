package leetcode.oo.graphs;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class ReconstructItineraryTestCase {

    private ReconstructItinerary alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new ReconstructItinerary();
    }

    @Test
    public void test(){
        Assert.assertEquals(
            Arrays.asList("JFK", "NRT", "JFK", "KUL"),
            this.alg.findItinerary(
                Arrays.asList(
                    Arrays.asList("JFK", "KUL"), Arrays.asList("JFK", "NRT"), Arrays.asList("NRT", "JFK")
                )
            )
        );
        Assert.assertEquals(
            Arrays.asList("JFK", "MUC", "LHR", "SFO", "SJC"),
            this.alg.findItinerary(
                Arrays.asList(
                    Arrays.asList("MUC", "LHR"),
                    Arrays.asList("JFK", "MUC"),
                    Arrays.asList("SFO", "SJC"),
                    Arrays.asList("LHR", "SFO")
                )
            )

        );
        Assert.assertEquals(
            Arrays.asList("JFK", "ATL", "JFK", "SFO", "ATL", "SFO"),
            this.alg.findItinerary(
                Arrays.asList(
                    Arrays.asList("JFK", "SFO"),
                    Arrays.asList("SFO", "ATL"),
                    Arrays.asList("JFK", "ATL"),
                    Arrays.asList("ATL", "JFK"),
                    Arrays.asList("ATL", "SFO")
                )
            )
        );
    }
}
