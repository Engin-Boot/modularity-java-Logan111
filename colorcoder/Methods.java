package colorcoder;

public class Methods {  
    
   public static ColorPair GetColorFromPairNumber(int pairNumber)
   {
	        int zeroBasedPairNumber = pairNumber - 1;
	        MajorColor majorColor;
        majorColor = (MajorColor)fromIndex(MajorColor.values(), zeroBasedPairNumber / ColorPair.numberOfMinorColors);
	        MinorColor minorColor;
        minorColor = (MinorColor)fromIndex(MinorColor.values(), zeroBasedPairNumber % ColorPair.numberOfMinorColors);
	        return new ColorPair(majorColor, minorColor);
	    }
    
    public static int GetPairNumberFromColor(MajorColor major, MinorColor minor)
    {
        return major.getIndex() * ColorPair.numberOfMinorColors + minor.getIndex() + 1;
    }
    
     public static IColor fromIndex(Object[] colors, int index) {
	        for(Object obj: colors) {
	        	IColor color = (IColor)obj;
	            if(color.getIndex() == index) {
	                return color;
	            }
	        }
	        return null;
	    }

}
