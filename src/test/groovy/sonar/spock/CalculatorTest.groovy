package sonar.spock

import spock.lang.Specification

class CalculatorTest extends Specification {

    def 'validate addition'() {
        def calculator = new Calculator()

        expect:
        sum == calculator.add(num1, num2)

        where:
        num1 | num2 | sum
        1    | 2    | 3
        10   | 20   | 30
    }
}
