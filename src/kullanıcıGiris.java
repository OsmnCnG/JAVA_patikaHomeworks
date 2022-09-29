import java.util.Scanner;

public class kullanıcıGiris {
    public static void main(String[] args) {

        String userName;
        String newPassword;
        Scanner keyboard = new Scanner(System.in);
        String enterpassword;

        System.out.println("Kullanıcı ID:");
        userName = keyboard.nextLine();
        System.out.println("Password:");
        enterpassword = keyboard.nextLine();

        if (enterpassword.equals("JAVA")){
            System.out.println("Başarıyla giriş yapıldı.");
        }else{

            System.out.println("Yanlış şifre girildi.\nŞifrenizi sıfırlamak ister misiniz?");
            System.out.println("1.YES\n2.NO");
            int SecimYapiniz = keyboard.nextInt();

            switch (SecimYapiniz){
                case 1:
                    System.out.println("Yeni şifrenizi giriniz:");
                    newPassword = keyboard.next();
                    if (newPassword.equals("JAVA"))
                        System.out.println("Yeni şifreniz bir önceki şifreniz ile aynı olamaz!");
                    else{
                        System.out.println("Şifre başarıyla oluşturuldu.");
                    }
                    break;
                case 2:
                    break;
                default:
                    break;


            }


        }










    }
}