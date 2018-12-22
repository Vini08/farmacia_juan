/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_impresion;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Vinicio
 */
public class printnow {
     
   

  public static boolean printCard(final String bill ) throws IOException{
final PrinterJob job = PrinterJob.getPrinterJob();
  final BufferedImage img=ImageIO.read(new File("C:\\Users\\Vinicio\\Pictures\\logofa.jpeg"));
    ImageIcon icon=new ImageIcon(img);
Printable contentToPrint = new Printable(){
   @Override
   public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
      graphics.drawImage(img, 76, 0, img.getWidth(), img.getHeight(), null);
        
    String[] billz = bill.split(";");
        int y = 60;  
    Graphics2D title = (Graphics2D) graphics;
    title.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
    title.setFont(new Font("Monospaced", Font.BOLD, 10));
   graphics.drawString(billz[0], 5, y);
     y = y + 15;   
        //draw each String in a separate line
    Graphics2D g2d = (Graphics2D) graphics;
    g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
    g2d.setFont(new Font("Monospaced", Font.PLAIN, 10));
        for (int i = 1; i < billz.length; i++) {
            graphics.drawString(billz[i], 5, y);
            y = y + 15;
        }
       if (pageIndex >0){return NO_SUCH_PAGE;} //Only one page    
return PAGE_EXISTS;
   }
}; 

PageFormat pageFormat = new PageFormat();
    pageFormat.setOrientation(PageFormat.PORTRAIT);
      Paper pPaper = pageFormat.getPaper();

   pPaper.setImageableArea(0, 0, pPaper.getWidth() , pPaper.getHeight() -2);
   pageFormat.setPaper(pPaper);

   job.setPrintable(contentToPrint, pageFormat);

    try {
      job.print();

  } catch (PrinterException e) {
    System.err.println(e.getMessage());
  }
    return true;
}
  
  
}
