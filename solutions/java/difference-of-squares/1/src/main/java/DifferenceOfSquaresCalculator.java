class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int sum = (input*(input+1))>>1;
        return sum*sum;
    }

    int computeSumOfSquaresTo(int n) {
        return (n*(n+1)*(n*2+1))/6;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input)-computeSumOfSquaresTo(input);
    }

}
