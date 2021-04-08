public class TriangleClassifier {
    public static String triangles(int triangleedgest, int triangleedgend, int triangleedgerd) {
        String messageTriangle = "";
        boolean equalOne = triangleedgest == triangleedgend;
        boolean equalTwo = triangleedgest == triangleedgerd;
        boolean equalThree = triangleedgend == triangleedgerd;
        boolean bigZeroTriOne = triangleedgest > 0;
        boolean bigZeroTriTwo = triangleedgend > 0;
        boolean bigZeroTriThree = triangleedgerd > 0;
        if (equalOne && equalTwo && equalThree && bigZeroTriOne && bigZeroTriTwo && bigZeroTriThree) {
            messageTriangle = "Tam giác đều";
        } else {
            boolean notEqualOne = triangleedgest != triangleedgerd;
            boolean notEqualTwo = triangleedgend != triangleedgerd;
            if (equalOne && notEqualOne && notEqualTwo && bigZeroTriOne && bigZeroTriTwo && bigZeroTriThree) {
                messageTriangle = "Tam giác cân";
            } else {
                boolean notEqualThree = triangleedgest != triangleedgend;
                boolean notEqualFour = triangleedgerd != triangleedgend;
                if (equalTwo && notEqualThree && notEqualFour && bigZeroTriOne && bigZeroTriTwo && bigZeroTriThree) {
                    messageTriangle = "Tam giác cân";
                } else {
                    boolean notEqualFive = triangleedgend != triangleedgest;
                    boolean notEqualSix = triangleedgerd != triangleedgest;
                    if (equalThree && notEqualFive && notEqualSix && bigZeroTriOne && bigZeroTriTwo && bigZeroTriThree) {
                        messageTriangle = "Tam giác cân";
                    }  else {
                        boolean bigTriOne = triangleedgest > 2 * triangleedgend;
                        boolean bigTriTwo = triangleedgest > 2 * triangleedgerd;
                        boolean bigTriThree = triangleedgend > 2 * triangleedgest;
                        boolean bigTriFour = triangleedgend > 2 * triangleedgerd;
                        boolean bigTriFive = triangleedgerd > 2 * triangleedgest;
                        boolean bigTriSix = triangleedgerd > 2 * triangleedgend;
                        if ((bigTriOne && bigTriTwo) || (bigTriThree && bigTriFour) || (bigTriFive && bigTriSix)) {
                            messageTriangle = "Không phải là tam giác";
                        } else {
                            boolean smallTriOne = triangleedgest < 0;
                            boolean smallTriTwo = triangleedgend < 0;
                            boolean smallTriThree = triangleedgerd < 0;
                            if (smallTriOne || smallTriTwo || smallTriThree) {
                                messageTriangle = "Không phải là tam giác";
                            } else {
                                boolean equalTriOne = triangleedgest == 0;
                                boolean equalTriTwo = triangleedgend == 0;
                                boolean equalTriThree = triangleedgerd == 0;
                                if (equalTriOne || equalTriTwo || equalTriThree) {
                                    messageTriangle = "Không phải là tam giác";
                                } else if (notEqualThree && notEqualOne && notEqualTwo) {
                                    messageTriangle = "Tam giác thường";
                                }
                            }
                        }
                    }
                }
            }
        }
        return messageTriangle;
    }
}
