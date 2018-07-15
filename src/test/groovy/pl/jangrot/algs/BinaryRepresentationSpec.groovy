package pl.jangrot.algs

import spock.lang.Specification

class BinaryRepresentationSpec extends Specification {

    def "computes binary"() {
        expect:
        BinaryRepresentation.computeBinary(input) == output
        where:
        input || output
        6     || "110"
        5     || "101"
        0     || "0"
        1     || "1"
    }
}
