package Tugas_Strukdat_Stack;

public class tesStack {
    public static void main(String[] args) {
        TugasStack s = new TugasStack(10);
        s.push("Mobil");
        s.push("Sepeda");
        s.push("Sepeda Motor");
        s.pop();
        s.pop();
        System.out.println("");
        s.infoStack();
    }
}

