public class Main {

    public static void main(String[] args) {

        Autor autor1 = new Autor("J. R. R. Tolkien", " Africa do Sul");

        System.out.println("\n" + autor1.nome + autor1.nacionalidade);

        Autor autor2 = new Autor("C. S. Lewis" , " Reino Unido");
        
        System.out.println("\n" + autor2.nome + autor2.nacionalidade);

        Aluno aluno = new Aluno("Ismael"," 110");
        
        System.out.println("\n" + aluno.nome + aluno.codigo);

        Professor professor = new Professor("Efrain"," 010");

        System.out.println("\n" + professor.nome + professor.codigo);

        Livro livro1 = new Livro("O Senhor dos Aneis ",autor1);
        livro1.emprestadoPor = aluno;
        
        System.out.println("\n" + livro1.nome + autor1.nome);
        System.out.println("\nEmprestado por: "+livro1.emprestadoPor.nome);

        Livro livro2 = new Livro("\n" + "As Cronicas de Narnia ",autor2);
        livro2.emprestadoPor = professor;

        System.out.println(livro2.nome + autor2.nome);
        System.out.println("\n" + "Emprestado por: "+livro2.emprestadoPor.nome);
    }
}