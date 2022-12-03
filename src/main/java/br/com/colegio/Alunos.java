package br.com.colegio;

public class Alunos {
    public static void main(String[] args) {

       Estudante[] arr;

       arr = new Estudante[5];

       arr[0] = new Estudante(1, "Mauricio");
       arr[1] = new Estudante(2, "Livia");
       arr[2] = new Estudante(3, "Maria Luiza");
       arr[3] = new Estudante(4, "Leia");
       arr[4] = new Estudante(5, "Luan");

       for (int i = 0; i < arr.length; i++)
       System.out.println("Aluno " + i + " : " + arr[i].roll_no + " " + arr[i].name);

    }

}
