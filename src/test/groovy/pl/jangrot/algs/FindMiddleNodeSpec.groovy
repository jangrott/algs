package pl.jangrot.algs

import spock.lang.Specification

import static pl.jangrot.algs.ListNodeUtils.toListNode

class FindMiddleNodeSpec extends Specification {

    def "finds middle node"() {
        expect:
        FindMiddleNode.findMiddleNode(input) == output
        where:
        input                    || output
        null                     || null
        toListNode([1])          || toListNode([1])
        toListNode([1, 2, 3])    || toListNode([2])
        toListNode([1, 2])       || toListNode([1])
        toListNode([1, 2, 3, 4]) || toListNode([2])
    }
}
