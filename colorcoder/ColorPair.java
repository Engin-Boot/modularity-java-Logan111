package colorcoder;
 class ColorPair {
     
    public final static String MajorColorNames[] = {"White", "Red", "Black", "Yellow", "Violet"};
    public final static int numberOfMajorColors = MajorColorNames.length;
    
    public final static String MinorColorNames[] = {"Blue", "Orange", "Green", "Brown", "Slate"}; 
    public final static int numberOfMinorColors = MinorColorNames.length;
     
        private MajorColor majorColor;
        private MinorColor minorColor;
        
        public ColorPair(MajorColor major, MinorColor minor)
        {
            majorColor = major;
            minorColor = minor;
        }
        public MajorColor getMajor() {
            return majorColor;
        }
        public MinorColor getMinor() {
            return minorColor;
        }
        String ToString() {
            String colorPairStr = MajorColorNames[majorColor.getIndex()];
            colorPairStr += " ";
            colorPairStr += MinorColorNames[minorColor.getIndex()];
            return colorPairStr;
        }
    };
