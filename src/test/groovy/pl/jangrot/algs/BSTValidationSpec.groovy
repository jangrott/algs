package pl.jangrot.algs

import spock.lang.Specification

import static pl.jangrot.algs.TreeNodeUtils.toTreeNode

class BSTValidationSpec extends Specification {

    def "validates BST"() {
        expect:
        BSTValidation.validateBST(input) == output
        where:
        input                            || output
        toTreeNode([20, 15, 30, 14, 18]) || true
        toTreeNode([20, 30, 15, 14, 18]) || false
        toTreeNode([20, 15, 40, 10, 30]) || false
    }
}
