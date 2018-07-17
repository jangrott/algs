package pl.jangrot.algs

import spock.lang.Specification

class StringCompressionSpec extends Specification {

    def "compress string"() {
        expect:
        StringCompression.compressString(input) == output
        where:
        input          || output
        "aaabbbbbcccc" || "a3b5c4"
        "aabbbbccc"    || "a2b4c3"
        "abc"          || "abc"
    }
}
