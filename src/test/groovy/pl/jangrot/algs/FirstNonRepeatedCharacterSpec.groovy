package pl.jangrot.algs

import spock.lang.Specification

class FirstNonRepeatedCharacterSpec extends Specification {

    def "finds first non repeated character"() {
        expect:
        FirstNonRepeatedCharacter.firstNonRepeatedCharacter(input) == output
        where:
        input        || output
        null         || null
        "abc"        || 'a'
        "abac"       || 'b'
        "abcabc"     || null
        "xcvbxcfzcv" || 'b'
        "v"          || 'v'
    }
}
