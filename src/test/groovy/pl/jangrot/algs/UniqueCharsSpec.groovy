package pl.jangrot.algs

import spock.lang.Specification

class UniqueCharsSpec extends Specification {

    def "checks if all chars are unique"() {
        expect:
        UniqueChars.areAllCharactersUnique(input) == output
        where:
        input  || output
        null   || true
        ""     || true
        "abc"  || true
        "abca" || false
    }
}
