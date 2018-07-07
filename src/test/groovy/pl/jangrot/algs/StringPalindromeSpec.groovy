package pl.jangrot.algs

import spock.lang.Specification

class StringPalindromeSpec extends Specification {

    def "checks if string is palindrome"() {
        expect:
        StringPalindrome.isStringPalindrome(input) == output
        where:
        input      || output
        null       || true
        ""         || true
        "aba"      || true
        "abc"      || false
        "race car" || false
        "ab ba"    || true
    }
}
