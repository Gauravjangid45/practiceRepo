

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
        String str = "sdfj3kfj34erdjfl987sdf";
        Integer length=0;
        Integer maxlength = 0;
        String maxresult="";
        String result="";
        char a[] = str.toCharArray();
        System.out.println(a);
        
        // String str1 = "7";
        // System.out.println(str1.getClass().getSimpleName()); 
        
        for(char c:a){
           
            if(c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9'||c=='0'){
                length++;
                result+=c;
                maxlength = Math.max(length,maxlength);
                maxresult = result.length()>maxresult.length() ? result : maxresult;
            }
            else{
                length=0;
                result="";
            }
            
        }
        System.out.println(maxlength);
        System.out.println(maxresult);
    }
}
