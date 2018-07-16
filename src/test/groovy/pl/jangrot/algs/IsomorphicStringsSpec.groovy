package pl.jangrot.algs

import spock.lang.Specification

class IsomorphicStringsSpec extends Specification {

    def "check if isomorphic"() {
        expect:
        IsomorphicStrings.isIsomorphic(input1, input2) == output
        where:
        input1 || input2 || output
        "css"  || "dll"  || true
        "css"  || "dle"  || false
        "abcd" || "aabb" || false
    }
}