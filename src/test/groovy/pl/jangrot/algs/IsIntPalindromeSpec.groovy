package pl.jangrot.algs

import spock.lang.Specification

class IsIntPalindromeSpec extends Specification {

    def "checks if integer is palindrome"() {
        expect:
        IsIntPalindrome.isIntPalindrome(input) == output
        where:
        input || output
        -1    || false
        0     || true
        1221  || true
        121   || true
        123   || false
    }
}
