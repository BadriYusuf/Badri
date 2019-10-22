package Tugas_Strukdat_Queve;

public class TugasQueve {
    private int tail;
    private int head;
    private int size;
    private String data[];

    public TugasQueve(int kapasitas) {
        tail = -1;
        head = -1;
        size = kapasitas;
        data = new String[size];
    }

    public boolean isEmpty() {
        return head == -1;
    }

    public boolean isFull() {
        return tail >= size - 1;
    }

    public void add(String input) {
        if (isEmpty()) {
            data[++head] = input;
            tail++;

        } else {
            if (isFull()) {
                System.out.println(" Antrian pembelian KFC ");
            } else {
                data[++tail] = input;
            }
        }
        System.out.println(input + " Antri membeli KFC ");
}

    public void remove() {
        if (isEmpty()) {
            System.out.println("pelanggan kosong");
        } else {
            String temp = data[head];
            for (int i = 0; i < tail; i++) {
                data[i] = data[i + 1];
            }
            tail--;
            System.out.println(temp + " Membeli KFC ");
        }
    }

    public void infoQueue() {
        System.out.println("pelanggan selanjutnya");
        for (int i = 0; i <= tail; i++) {
            System.out.println(i + ")" + data[i]);
        }
    }
}
