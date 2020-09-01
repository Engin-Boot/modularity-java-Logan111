package colorcoder;

public class Methods {
    
    
    public final static String MajorColorNames[] = {"White", "Red", "Black", "Yellow", "Violet"};
    public final static int numberOfMajorColors = MajorColorNames.length;
    
    public final static String MinorColorNames[] = {"Blue", "Orange", "Green", "Brown", "Slate"}; 
    public final static int numberOfMinorColors = MinorColorNames.length;
    
    static ColorPair GetColorFromPairNumber(int pairNumber)
    {
        int zeroBasedPairNumber = pairNumber - 1;
        MajorColor majorColor = MajorColor.fromIndex(zeroBasedPairNumber / numberOfMinorColors);
        MinorColor minorColor = MinorColor.fromIndex(zeroBasedPairNumber % numberOfMinorColors);
        return new ColorPair(majorColor, minorColor);
    }
    
    static int GetPairNumberFromColor(MajorColor major, MinorColor minor)
    {
        return major.getIndex() * numberOfMinorColors + minor.getIndex() + 1;
    }

}
