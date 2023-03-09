package ProjetoYoutubeCursoemVideo;

public class ProjetoYoutubeCursoemVideo {
    public static void main(String[] args) {
        Video video[] = new Video[3];
        video[0] = new Video("Aula 1 de POO");
        video[1] = new Video("Aula 2 de PHP");
        video[2] = new Video("Aula 3 de HTML5");
        
        Gafanhoto gafanhoto[] = new Gafanhoto[5];
        gafanhoto[0] = new Gafanhoto("Jubileu", 22, "M", "Juba");
        gafanhoto[1] = new Gafanhoto("Marcia", 20, "F", "McMarcia");
        gafanhoto[2] = new Gafanhoto("Ana Julia", 22, "F", "Aninha");
        gafanhoto[3] = new Gafanhoto("Marcos", 23, "M", "MarcosBR");
        gafanhoto[4] = new Gafanhoto("Paulo", 25, "M", "BlackX");
        
        Visualizacao visualizacao1 = new Visualizacao(gafanhoto[0], video[1]);
        System.out.println(visualizacao1.toString());
        
        /*System.out.println("-------------------------------------------------");
        System.out.println(video[0].toString());
        System.out.println("-------------------------------------------------");
        System.out.println(gafanhoto[0].toString());
        System.out.println(gafanhoto[1].toString());
        System.out.println(gafanhoto[2].toString());
        System.out.println(gafanhoto[3].toString());
        System.out.println(gafanhoto[4].toString());
        System.out.println("--------------------------------------------------");
        */
        
    }
}
