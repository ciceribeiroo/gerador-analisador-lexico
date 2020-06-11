package analisadorlexico;

import java.io.*;
public class AnalisadorLexico {

    public static void main(String[] args) throws IOException{
        InputStream inputStream = new FileInputStream("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\AnalisadorLexico\\src\\analisadorlexico\\ALGUMA.txt");
        InputStreamReader isr = new InputStreamReader(inputStream);
        BufferedReader programa = new BufferedReader(isr);
        
        Lexico lexico = new Lexico();
        lexico.setInput(programa);
        
        try{
            Token t = null;
            while((t = lexico.nextToken())!= null){
                System.out.println(t.toString());
            }
        }
        catch(LexicalError e){
            System.err.println(e.getMessage());
        }
        
    }
    
}
