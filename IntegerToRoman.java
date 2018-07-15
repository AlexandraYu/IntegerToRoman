public class IntegerToRoman{
     public static String convertIntToRoman(int number) {
         int count=0;
         StringBuilder stringBuilder = new StringBuilder (); 
         count = howManyDigit(number); 
         switch (count) {
             case 4:
                 for(int i=0; i<number/1000; i++) {
                     stringBuilder.append("M"); 
                 }
                 number = number % 1000;
             case 3:
                 if(number/100==4) stringBuilder.append("CD");
                 else if (number/100==9) stringBuilder.append("CM"); 
                 else if (number/100==5) stringBuilder.append("D"); 
                 else if (number/100>5) {
                     stringBuilder.append("D");
                     for (int i=0; i<(number/100-5); i++) {
                         stringBuilder.append("C");
                     }
                 }
                 else if(number/100<5) {
                     for (int i=0; i<(number/100); i++) {
                         stringBuilder.append("C");
                     }
                 }
                 number = number % 100; 
             case 2:
                 if(number/10==4) stringBuilder.append("XL");
                 else if (number/10==9) stringBuilder.append("XC"); 
                 else if (number/10==5) stringBuilder.append("L"); 
                 else if (number/10>5) {
                     stringBuilder.append("L");
                     for (int i=0; i<(number/10-5); i++) {
                         stringBuilder.append("X");
                     }
                 }
                 else if(number/10<5) {
                     for (int i=0; i<(number/10); i++) {
                         stringBuilder.append("X");
                     }
                 }
                 number = number % 10;
             case 1:
                 if(number==4) stringBuilder.append("IV");
                 else if (number==9) stringBuilder.append("IX"); 
                 else if (number==5) stringBuilder.append("V"); 
                 else if (number>5) {
                     stringBuilder.append("V");
                     for (int i=0; i<number-5; i++) {
                         stringBuilder.append("I");
                     }
                 }
                 else if(number<5) {
                     for (int i=0; i<number; i++) {
                         stringBuilder.append("I");
                     }
                 }
         }
         String finalString = stringBuilder.toString();
         return finalString;
     }
     private static int howManyDigit(int input) {
         int digit = 0; 
         while (input!=0) {
             input = input /10; 
             digit++;
         }
         return digit; 
     }
     public static void main(String []args){
        String myString; 
        myString = convertIntToRoman(1896);
        System.out.print("What's the answer? "+myString+"\n"); 
     }
}