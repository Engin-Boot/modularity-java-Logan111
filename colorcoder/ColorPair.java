package colorcoder;
import  colorcoder.MajorColor;
import  colorcoder.MinorColor;

 class ColorPair {
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
            String colorPairStr = Methods.MajorColorNames[majorColor.getIndex()];
            colorPairStr += " ";
            colorPairStr += Methods.MinorColorNames[minorColor.getIndex()];
            return colorPairStr;
        }
    };
