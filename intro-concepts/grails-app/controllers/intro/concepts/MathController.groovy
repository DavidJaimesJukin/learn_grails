package intro.concepts

class MathController {
    def mathService

    def add() {
        def result = [
                answer: mathService.add(params.lhs, params.rhs)
        ]

        respond result
    }
}
