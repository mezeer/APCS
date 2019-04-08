public String altCase(String text)
{
    
    char[] charArr = new char[text.length()];
    
    String newString = "";
    
    for(int i = 0; i < text.length(); i++) {
        charArr[i] = text.charAt(i);
        
        if(i % 2 ==0){ 
            newString += Character.toUpperCase(charArr[i]); 
        }
        
        else if(i % 3 == 0 || i % 1 == 0) {
            newString += Character.toLowerCase(charArr[i]); 
        }
     }
    
    return newString;
}
