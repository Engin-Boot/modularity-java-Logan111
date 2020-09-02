package colorcoder;

public class Testers 
{
    static void Printmanual_by_StrConcat()
    {
        int total_entries  = ColorPair.numberOfMajorColors * ColorPair.numberOfMinorColors;
        String manual_string = "";
        for(int pair_num = 1; pair_num <= total_entries; pair_num++)
        {
            ColorPair paircolor =  Methods.GetColorFromPairNumber(pair_num);
            manual_string = manual_string + pair_num + " - " + paircolor.getMajor() + " , " + paircolor.getMinor() + "\n";
            
        }
         System.out.println(manual_string);
    }
    
    static void testNumberToPair(int pairNumber,MajorColor expectedMajor,MinorColor expectedMinor)
    {
        ColorPair colorPair = Methods.GetColorFromPairNumber(pairNumber);
        System.out.println("Got pair " + colorPair.ToString());
        assert(colorPair.getMajor() == expectedMajor);
        assert(colorPair.getMinor() == expectedMinor);
    }

    static void testPairToNumber(MajorColor major,MinorColor minor,int expectedPairNumber)
    {
        int pairNumber = Methods.GetPairNumberFromColor(major, minor);
        System.out.println("Got pair number " + pairNumber);
        assert(pairNumber == expectedPairNumber);
    }
    
}
