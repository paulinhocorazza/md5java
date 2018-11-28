import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner option = new Scanner(System.in);
//
//        MessageDigest sha256  = MessageDigest.getInstance("SHA-256");
//        MessageDigest sha1 = MessageDigest.getInstance("SHA-1");
//        md5.update(s.getBytes(), 0,s.length());
//        System.out.println("MD5: " + new BigInteger(1, md5.digest()).toString(16));

        int opcao;

        do {
            System.out.println("\n\n### Sistema de hash ###");
            System.out.println("\n\n  Selecione um tipo de cripotografia ");
            System.out.println("\n                  =========================");
            System.out.println("                  |     1 - md5        |");
            System.out.println("                  |     2 - sha256     |");
            System.out.println("                  |     3 - sha1       |");
            System.out.println("                  |     0 - Sair          |");
            System.out.println("                  =========================\n");

            opcao = option.nextInt();

            switch (opcao) {
                case 1:
                    hashTomd5();
                    break;
                case 2:
//                    hashTosha1();
                    break;
                case 3:
//                    hashTosha256();
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        } while (opcao != 0);




    }
    public static void hashTomd5() throws NoSuchAlgorithmException {


       Scanner textHash = new Scanner(System.in);
       String text = textHash.toString();

        System.out.println();

        MessageDigest md5 = MessageDigest.getInstance("MD5");
        md5.update(text.getBytes(), 0,text.length());
        System.out.println("MD5 do texto digitado é: " +  text + new BigInteger(1, md5.digest()).toString(16));




    }
}
