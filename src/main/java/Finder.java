public class Finder {
    public static Integer findMax(int[] intArray) {
        if (intArray == null) {
            return null;
        }
        int Max = intArray[0];
        for (int i=1; i<intArray.length; i++) {
            if (intArray[i] > Max) {
                Max =intArray[i];
            }
        }
      return Max;
    }

    public static Integer findMin(int[] intArray) {
        if (intArray == null) {
            return null;
        }
        int Min = intArray[0];
        for (int i=1; i<intArray.length; i++) {
            if (intArray[i] > Min) {
                Min =intArray[i];
            }
        }
        return Min;
    }
}