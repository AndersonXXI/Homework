package L3;

public class Text {
    public static void main(String[] args) {
        String text = "Це приклад тексту на українській мові. Він містить кілька речень. Ми розіб'ємо його на два рівних підрядки.";

        String[] sentences = text.split("\\.");

        int length = sentences.length;
        int midpoint = length / 2;

        System.out.println("Перший підрядок:");
        for (int i = 0; i < midpoint; i++) {
            System.out.println(sentences[i].trim());
        }

        System.out.println("\nДругий підрядок:");
        for (int i = midpoint; i < length; i++) {
            System.out.println(sentences[i].trim());
        }
    }
}
