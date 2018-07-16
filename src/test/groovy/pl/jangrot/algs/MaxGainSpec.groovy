package pl.jangrot.algs

import spock.lang.Specification

class MaxGainSpec extends Specification {

    def "gets maximum gain"() {
        expect:
        MaxGain.maxGain(input) == output
        where:
        input                         || output
        [0, 50, 10, 100, 30] as int[] || 100
        [100, 40, 20, 10] as int[]    || 0
    }
}
