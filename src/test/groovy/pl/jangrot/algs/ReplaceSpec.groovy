package pl.jangrot.algs

import spock.lang.Specification

class ReplaceSpec extends Specification {

    def "replaces spaces"() {
        expect:
        Replace.replace(input, replacement) == output
        where:
        input   || replacement || output
        ""      || "abc"       || ""
        null    || "a"         || null
        "abc"   || "a"         || "abc"
        "a b c" || "zy"        || "azybzyc"
    }
}
