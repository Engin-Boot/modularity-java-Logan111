package colorcoder;
public class Main {
   
    public static void main(String[] args) {
        System.out.println("We print a manul for your refernce");
        Testers.Printmanual_by_StrConcat();
        
        Testers.testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
        Testers.testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);
    
        Testers.testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
        Testers.testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);
        
        
    }
}
