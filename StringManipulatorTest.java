public class StringManipulatorTest {
    public static void main(String[] args){
        StringManipulator manipulator = new StringManipulator();
        String str = manipulator.trimAndConcat("    Hello     ","     World    ");
        System.out.println(str);

        StringManipulator manipulator2 = new StringManipulator();
        char letter = 'o';
        Integer a = manipulator2.getIndexOrNull("Coding", letter);
        Integer b = manipulator2.getIndexOrNull("Hello World", letter);
        Integer c = manipulator2.getIndexOrNull("Hi", letter);
        System.out.println(a); // 1
        System.out.println(b); // 4
        System.out.println(c); // null

        StringManipulator manipulator3 = new StringManipulator();
        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer v = manipulator3.getIndexOrNull(word, subString);
        Integer y = manipulator3.getIndexOrNull(word, notSubString);
        System.out.println(v); // 2
        System.out.println(y); // null

        StringManipulator manipulator4 = new StringManipulator();
        String word1 = manipulator4.concatSubstring("Hello", 1, 2, "world");
        System.out.println(word1); // eworld
            }
}