package javacore.Aintroducaoclasse.test;

import javacore.Aintroducaoclasse.domino.Professor;
//Alta Coesão em um codigo é execelente!
public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Dev-Dojo";
        professor.idade = 23;
        professor.sexo = 'm';

        System.out.println("====Lista Profesores=====" + "\nNome: "+professor.nome + "\nIdade: " +professor.idade+ "\nSexo: "+ professor.sexo );
    }
}
