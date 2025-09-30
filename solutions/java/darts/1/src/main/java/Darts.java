class Darts {
    int score(double xOfDart, double yOfDart) {
        //x^2+y^2=r^2
        //r=sqrt(x^2+y^2)
        double radius = Math.sqrt(Math.pow(xOfDart,2)+Math.pow(yOfDart,2));
        if(radius<=1){return 10;}
        else if(radius<=5){return 5;}
        else if(radius<=10) {return 1;}
        else{return 0;}
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
}
