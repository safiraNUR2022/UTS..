import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

            List<mahasiswa> mahasiswaList = new ArrayList<>();
            mahasiswaList.add(new mahasiswa(2255201, "Mareta Nur Maemunah", "TIFRM22C", 181122));
            mahasiswaList.add(new mahasiswa(2255202, "Mega", "TIFRM22B", 181122));
            mahasiswaList.add(new mahasiswa(2255203, "Vira Nur Rizqa Martalegawa", "TIFK22A", 181122));
            mahasiswaList.add(new mahasiswa(2255204, "Fikry Deniansyah", "TIFK22Z", 181122));
            mahasiswaList.add(new mahasiswa(2255205, "Dian Nurdiani", "TIFRM22C", 181122));

            mahasiswaList.forEach(mahasiswa -> System.out.println(mahasiswa.toString()));
            System.out.println("Panjang Data Mahasiswa -> " + mahasiswaList.size());
            mahasiswaList.remove(0);

            mahasiswaList.forEach(mahasiswa -> System.out.println(mahasiswa.toString()));
            System.out.println("Panjang Data Mahasiswa -> " + mahasiswaList.size());
        }

    }