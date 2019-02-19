package com.playground.dummyservice

import com.playground.dummyservice.data.RandomTestData
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

/**
 * Integration Tests for app instance Service.
 *
 * @POST to /api/appInstances
 */
class SumTests extends Specification {

    @Shared
    def firstNumber

    @Shared
    def secondNumber

    @Shared
    def sum

    @Shared
    def randomData = new RandomTestData()

    @Unroll
    def "Positive - Add two numbers : secondNumber = [#inputSecondNumber]"() {
        given: "Two positive integers"
            firstNumber = randomData.positiveInteger
            secondNumber = inputSecondNumber
        when: "The numbers are summed"
            sum = firstNumber + secondNumber
        then: "Sum should be positive"
            sum > 0
        and: "Should be more than -1"
            sum > -1
        where: "Second Number values"
            inputSecondNumber << [55, 99, 101, 0]
    }

    @Unroll
    def "Negative - Add two numbers with negative values: firstNumber = [#inputFirstNumber] secondNumber = [#inputSecondNumber]"() {
        given: "Two positive integers"
            firstNumber = inputFirstNumber
            secondNumber = inputSecondNumber
        when: "The numbers are summed"
            sum = firstNumber + secondNumber
        then: "Sum should be positive"
            Exception ex = thrown()
        where: "Second Number values"
            inputFirstNumber           | inputSecondNumber | thirdNumber
            randomData.positiveInteger | null              | 1
            randomData.positiveInteger | ""                | 1

    }
}
