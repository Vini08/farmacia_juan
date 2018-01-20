/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gtelefoniastocktaking;


import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Date;
import java.util.Calendar;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author TheKiller
 */
public class pdfGaranty {
String dia,mesString, año;
int mesInt;
public String nombresCols[] = {"Producto","Marca","Modelo", "Cantidad","Defecto","Fecha"};
   

    public void createPdfTextTable( String destino, Rectangle TamanioPagina) throws DocumentException {
        Image imagen = null;
        Paragraph parrafo = new Paragraph();
        Paragraph parrafo1 = new Paragraph();
        Paragraph parrafo2 = new Paragraph();
        Paragraph parrafo3 = new Paragraph();
        Paragraph parrafo4 = new Paragraph();
        Paragraph parrafo6 = new Paragraph();
         Paragraph parrafo7 = new Paragraph();
       
        
        /*Declaramos documento como un objeto Document
         Asignamos el tamaño de hoja y los margenes */
        Document documento = new Document(TamanioPagina, 80, 80, 75, 75);
        //writer es declarado como el método utilizado para escribir en el archivo
        PdfWriter writer = null;
         PdfPTable table = new PdfPTable(3);    
         com.itextpdf.text.Font font1 = FontFactory.getFont("Tahoma", 13, Font.BOLD);
                 try {
            try {
                //Obtenemos la instancia del archivo a utilizar
                writer = PdfWriter.getInstance(documento, new FileOutputStream(destino+ ".pdf"));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(pdfGaranty.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (DocumentException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
      parrafo1.setAlignment(Paragraph.ALIGN_CENTER);
      parrafo1.add("\n"); 
      parrafo1.add("\n");
      parrafo1.add("Reporte de Garantias"); 
      parrafo1.add("\n");
      parrafo1.add("\n");
      parrafo2.setFont(font1);
      parrafo2.setAlignment(Paragraph.ALIGN_JUSTIFIED);
      parrafo2.add("\n");
       Paragraph parrafo1X = new Paragraph("14 calle 9-11 zona 3, Quetzaltenango.");
          Paragraph parrafo2X = new Paragraph("41518382 - 59266021");
         parrafo1X.setAlignment(Paragraph.ALIGN_CENTER);
         parrafo2X.setAlignment(Paragraph.ALIGN_CENTER);
          Paragraph sign = new Paragraph("");
     sign.add("Firma Recibido_______________________________");
  sign.setAlignment(Paragraph.ALIGN_CENTER);
      //parrafo.setFont(FontFactory.getFont("Sans", 12, Font.BOLD, BaseColor.BLUE));
        Calendar c = Calendar.getInstance();
        int mont=c.get(Calendar.MONTH)+1;
        String dia = Integer.toString(c.get(Calendar.DATE));
        String mes = Integer.toString(mont);
        String annio = Integer.toString(c.get(Calendar.YEAR));

      parrafo6.setAlignment(Paragraph.ALIGN_CENTER);
       parrafo7.setAlignment(Paragraph.ALIGN_CENTER);
      
      parrafo7.add("\n");
     
PdfPTable tabla = new PdfPTable(6);
tabla.setWidthPercentage(100);
 
for (int i = 0; i < 6; i++)
{
    tabla.addCell(nombresCols[i]);
}      

    try {        
           try {
            
            imagen = Image.getInstance("C:\\Users\\Usuario\\Pictures\\BarraGT.png");
            imagen.scaleAbsolute(600f, 65f);
         imagen.setAlignment(Element.ALIGN_TOP);
          imagen.setAlignment(Element.ALIGN_CENTER);
            
           } catch (BadElementException ex) {
                JOptionPane.showMessageDialog(null,ex);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null,ex);
            }
            //Abrimos el documento para edición
            documento.open();
            documento.add(imagen);
            
            documento.add(parrafo1X);
            documento.add(parrafo2X);
            documento.add(parrafo1);
            documento.add(parrafo7);
            
            documento.add(parrafo6);
            documento.add(tabla);
            documento.add(parrafo2);
            documento.add(parrafo);
            documento.add(parrafo7);
            documento.add(parrafo7);
            documento.add(sign);
            
            
        } catch (DocumentException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }

        documento.close(); //Cerramos el documento
        writer.close(); //Cerramos writer

        try {
            File path;
            path = new File(destino + ".pdf");
            Desktop.getDesktop().open(path);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }

    public File Colocar_Destino(File ruta_destino) {
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo PDF", "pdf", "PDF");
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(filter);
        int result = fileChooser.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            ruta_destino = fileChooser.getSelectedFile().getAbsoluteFile();
        }
        return ruta_destino;
    }
}
