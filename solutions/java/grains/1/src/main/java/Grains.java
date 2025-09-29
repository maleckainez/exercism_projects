import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) {
        if (square < 1 || square > 64) {
        throw new IllegalArgumentException("square must be between 1 and 64");
    }
        return BigInteger.TWO.pow(square-1);
    }
    BigInteger grainsOnBoard() {
        BigInteger totalGrain = new BigInteger("0");
        for(int square = 1; square<65; square++){
            totalGrain = totalGrain.add(grainsOnSquare(square));
        };
        return totalGrain;
    }

}
