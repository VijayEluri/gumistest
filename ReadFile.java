import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile extends JFrame{
    public static void main(String[] args){

        new ReadFile();

    }

    public static Color[][] loadImageToArray(){
        try{
            //file has to be in the same dir as the file
            PpmImageReader pir = new PpmImageReader(System.getProperty("user.dir")+"\\snow.ppm");

            //read the header
            System.out.println("Magic number: "+pir.readNextWord());//read the magic number
            int width = Integer.parseInt(pir.readNextWord());
            int height = Integer.parseInt(pir.readNextWord());
            pir.readNextWord();//skip the maximum value for each color


            //read the image data into an array of Color
            Color[][] imageArray = new Color[height][width];

            for(int i = 0; i<height; i++){
                for(int j = 0; j<width; j++){
                    int r = Integer.parseInt(pir.readNextWord());
                    int g = Integer.parseInt(pir.readNextWord());
                    int b = Integer.parseInt(pir.readNextWord());

                    imageArray[i][j] = new Color(r,g,b);
                }
            }

            pir.close();

            return imageArray;

        }catch(IOException ex){
            System.out.println(ex);
        }

        return null;

    }

    Color[][] arrayOfColor;

    public ReadFile(){
        arrayOfColor = loadImageToArray();
        setSize(arrayOfColor[0].length+50, arrayOfColor.length*2+100);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

        int offsetX = 35;
        int offsetY = 35;

        for(int i = 0; i<arrayOfColor.length; i++){
            for(int j = 0; j<arrayOfColor[i].length; j++){
                g2d.setColor(arrayOfColor[i][j]);
                g2d.drawLine(offsetX+j,offsetY+i,offsetX+j,offsetY+i);
                g2d.drawLine(offsetX+j,offsetY+arrayOfColor.length*2-i-1,offsetX+j,offsetY+arrayOfColor.length*2-i-1);
            }
        }
    }
}

class PpmImageReader extends FileReader{

    public PpmImageReader(String dir) throws IOException{

        super(dir);

    }

    public String readNextWord(){
        String str = "";
        int wrt;

        //returns an empty string only when this.read() returns -1, 32 means space in ascii - code ignores all chars at or below
        try{
            while(((wrt = this.read()) != -1) && (wrt>32 || str.isEmpty())){

                //conditional code below prints the comments - if a # is encountered, prints chars until it encounters newline
                if(wrt == 35){
                    System.out.print((char) wrt);
                    while(((char)wrt != '\n') && wrt != -1){
                        wrt = this.read();
                        System.out.print((char)wrt);
                    }
                }

                if(wrt>32){
                    str = str + (char) wrt;
                }
            }
        }catch(IOException ex){
            System.out.println(ex);
        }

        return str;
    }
}