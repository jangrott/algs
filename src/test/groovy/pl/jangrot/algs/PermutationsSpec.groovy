package pl.jangrot.algs

import spock.lang.Specification

class PermutationsSpec extends Specification {

    def "permutations"() {
        expect:
        Permutations.permutation(str1, str2) == output
        where:
        str1    || str2    || output
        "cat"   || "act"   || true
        "hello" || "aloha" || false
    }
}
