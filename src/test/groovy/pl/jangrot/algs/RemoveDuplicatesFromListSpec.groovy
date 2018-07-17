package pl.jangrot.algs

import spock.lang.Specification

class RemoveDuplicatesFromListSpec extends Specification {

    def "removes duplicates"() {
        expect:
        RemoveDuplicatesFromList.removeDuplicates(input) == output
        where:
        input                                        || output
        ["Hi", "Hello", "Hey", "Hi", "Hello", "Hey"] || ["Hello", "Hey", "Hi"]
    }
}
