public class P01_RectangleOf10x10Stars {
//    public static void main(String[] args) {
//        String text = "";
//        for (int j = 0; j < 10; j++) {
//            text += "*";
//        }
//        for (int i = 0; i < 10; i++) {
//            System.out.println(text);
//        }

//        for (int rows = 0; rows < 10; rows++) {
//            for (int cols = 0; cols < 10; cols++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

    public static String repeatStr(String text, int count) {
        String output = "";
        for (int i = 0; i < count; i++) {
            output += text;
        }
        return output;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(repeatStr("*", 10));
        }
    }
}

