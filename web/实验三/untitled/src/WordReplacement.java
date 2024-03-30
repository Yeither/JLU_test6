import java.util.Scanner;

public class WordReplacement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一段文本：");
        String text = scanner.nextLine();
        System.out.print("请输入要查找和替换的单词1：");
        String word1 = scanner.next();
        System.out.print("请输入要替换成的单词2：");
        String word2 = scanner.next();
        String replacedText = replaceWord(text, word1, word2);
        if (replacedText != null) {
            System.out.println("替换后的文本为：" + replacedText);
        } else {
            System.out.println("在文本中单词1不存在。");
        }
        scanner.close();
    }
    public static String replaceWord(String text, String word1, String word2) {
        if (text.contains(word1)) {
            return text.replaceAll(word1, word2);
        } else {
            return null;
        }
    }
}
