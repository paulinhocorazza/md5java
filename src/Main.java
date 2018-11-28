import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws Exception {

        Scanner option = new Scanner(System.in);
        int opcao;


        System.out.println("\n\n### Sistema de hash - Trabalho de analise de algoritmos ###");
        System.out.println("\n\n  Selecione um tipo de criptografia ");
        System.out.println("\n                  =========================");
        System.out.println("                  |     1 - md5          |");
        System.out.println("                  |     2 - sha1         |");
        System.out.println("                  |     3 - sha256       |");
        System.out.println("                  |     0 - Sair         |");
        System.out.println("                  =========================\n");

        opcao = option.nextInt();

        switch (opcao) {
            case 1:
                hashTomd5();
                break;
            case 2:
                hashToSha1();
                break;
            case 3:
                hashToSha256();
                break;
            default:
                System.out.println("Opção Inválida!");
                break;
        }



    }
    public static void hashTomd5() throws NoSuchAlgorithmException {

        String text = null;
        Scanner input = new Scanner(System.in);


        System.out.println("digite o texto a ser convertido:");


        text = input.nextLine();

        System.out.println(text);



        MessageDigest md5 = MessageDigest.getInstance("MD5");
        System.out.println("Convertendo......");
        System.out.println("Convertendo.............");
        System.out.println("Convertendo...................");
        md5.update(text.getBytes(), 0, text.length());
        System.out.println("MD5 do texto  " + text + "e o md5 " +  new BigInteger(1, md5.digest()).toString(16));


    }

    public static void hashToSha1() throws NoSuchAlgorithmException{

        String text = "";
        String sha1 = null;
        Scanner input = new Scanner(System.in);

        System.out.println("digite o texto a ser convertido:");


        text = input.nextLine();
        sha1 = text;

        try {

            System.out.println("Convertendo......");
            System.out.println("Convertendo.............");
            System.out.println("Convertendo...................");

            MessageDigest digest = MessageDigest.getInstance("SHA-1");
            digest.reset();
            digest.update(text.getBytes("utf8"));
            sha1 = String.format("%040x", new BigInteger(1, digest.digest()));
        } catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("SHA1 do texto " + text + "é " + sha1);

    }

    public static void hashToSha256() throws NoSuchAlgorithmException{


        String text = "";
        String sha256 = null;
        Scanner input = new Scanner(System.in);

        System.out.println("digite o texto a ser convertido:");


        text = input.nextLine();
        sha256 = text;

        try{

            System.out.println("Convertendo......");
            System.out.println("Convertendo.............");
            System.out.println("Convertendo...................");

            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            digest.reset();
            digest.update(text.getBytes("utf8"));
            sha256 = String.format("%040x", new BigInteger(1, digest.digest()));


        }
        catch (Exception e){

            e.printStackTrace();
        }

        System.out.println("SHA256 do texto " + text + "é " + sha256);


    }
}
