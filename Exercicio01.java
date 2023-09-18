import javax.swing.JOptionPane;
public class Exercicio01 {
    static String str="";
    static char caracter;
    static int posicao=0;
    static int reptido=0;
    public static void main(String[] args){
        str= JOptionPane.showInputDialog("Digite a String que deseja obter as informações: ");
        primeiraposicao(posicao, caracter);
        JOptionPane.showMessageDialog(null,"A primeira posição é: "+posicao);

        charreptido(str, reptido);
        if(reptido==0){
            JOptionPane.showMessageDialog(null, "Houve caracteres repitidos");
        }else if(reptido==1){
            JOptionPane.showMessageDialog(null, "Não há caracteres repitidos");

        }

        
    }
    public static int primeiraposicao(int posicao, char caracter){
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==caracter){
                return posicao=i+1;
            }
        }
        return posicao=-1;
    }
    public static int charreptido(String str, int reptido){
        char comp;
        int rep=0;
        for(int i=0; i<str.length(); i++){
            comp=str.charAt(i);
            for(int j=0; j<str.length(); j++){
                if(comp==str.charAt(j)){
                    rep+=1;
                    if(rep>=2){
                        return reptido=0;
                    }
                }
            }
        }
        return reptido=1;
    }
}
