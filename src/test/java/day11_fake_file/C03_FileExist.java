package day11_fake_file;

import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C03_FileExist {

    @Test
    public void test01(){


        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("user.desktop"));

        //masa ustundekini tect dosyasinin varligini test edelim
        //"C:\Users\havva\OneDrive\Masaüstü\text.txt"

        String dosyaYolu=System.getProperty("user.home")+ "\\Desktop\\text.txt";
        System.out.println(dosyaYolu);

        /*
    Bilgisayarimizdaki bir dosyanin varligini test etmek icin once o dosyaya ulasmamiz gerekir
    javada dosyaya erisim icin dosya yoluna yani path e ihtiyac vardir
    Her bilgisayarin kullanici adi farkli olacagindan masa ustu
    dosya yoluda birbirinden farkli olacaktir
    testlerimizin tum bilgisayarlarda calismasi icin
    dosya yolunu DINAMIK yapmak zorundayiz
       */

    //bunun icin her bilgisayarin birbirinden farkli olan yolunu bulmak icin
        String farkliKisim=System.getProperty("user.home");

    //herkesin bilgisayarinda ortak olan kisim ise
        String ortakKisim="\\Desktop\\text.txt";

        String masaUstuDosyaYolu=farkliKisim+ortakKisim;
        System.out.println(Files.exists(Paths.get(masaUstuDosyaYolu)));

    }
}
