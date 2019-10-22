package Tugas_Strukdat_Queve;

public class tesQueve {
    public static void main(String[] args) {
        TugasQueve a = new TugasQueve(5);
        a.add("Rozi");
        a.add("Ridho");
        a.add("Wira");
        a.add("Een");
        a.add("Yudha");
        System.out.println("");
        a.infoQueue();
        System.out.println("");
        a.remove();
        System.out.println("");
        a.infoQueue();

    }
}
