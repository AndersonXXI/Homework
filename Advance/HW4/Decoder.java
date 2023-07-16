package L4.HW;

public class Decoder {
        public static void main(String[] args) {
            String inputText = "У країні на березі річки живе маленький хлопчик. " +
                    "Він любить гратися у дворі біля будинку. " +
                    "Разом із своїми друзями вони розіграли цікаву гру на подвір'ї. " +
                    "Діти бігають через поле, підскакують на скакалці, граються у футбол і ховаються за деревами. " +
                    "В цей час, біля річки, на старому мосту, сидить бабуся зі своїм котом. " +
                    "Бабуся годує кота з маленькою мискою. " +
                    "Він стоїть біля неї та вимовляє вельми лагідні слова.";
            String decodedText = decodeText(inputText);
            System.out.println("Дешифрований текст: " + decodedText);
        }

        public static String decodeText(String text) {
            return text.replaceAll("\\b[УуНнВвЗзІіПпАаБбЗзСсНнКкУуПпРрОоВвБб]\\b", "Java");
        }
}
