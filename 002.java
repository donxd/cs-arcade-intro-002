int centuryFromYear(int year) {
    int s = year%100;
    int c = year/100;
    
    if ( s != 0 ){
        c++;
    }
    
    System.out.println("centuryFromYear(year) = "+c);
    
    return c;
}
