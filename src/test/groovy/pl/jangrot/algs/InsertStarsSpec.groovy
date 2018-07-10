package pl.jangrot.algs

import spock.lang.Specification

class InsertStarsSpec extends Specification {

    def "inserts starts"() {
        expect:
        InsertStars.insertPairStar(input) == output
        where:
        input     || output
        null      || null
        ""        || ""
        "cac"     || "cac"
        "cc"      || "c*c"
        "caabdde" || "ca*abd*de"
    }
}
