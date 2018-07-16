package pl.jangrot.algs

import spock.lang.Specification

class AnagramsSpec extends Specification {

    def "checks if anagram"() {
        expect:
        Anagrams.isAnagram(str1, str2) == output
        where:
        str1  || str2  || output
        "abc" || "cab" || true
        "bc"  || "bd"  || false
    }
}
