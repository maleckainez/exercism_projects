class RaindropConverter {

    String convert(int number) {
        String response="";
        boolean dT = number%3==0;
        boolean dF = number%5==0;
        boolean dS = number%7==0;
        if(!dT&&!dF&&!dS){response = Integer.toString(number);}
        if(dT){response+="Pling";}
        if(dF){response+="Plang";}
        if(dS){response+="Plong";}
        return response;
    }

}
