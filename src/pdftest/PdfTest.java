/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdftest;

import java.io.IOException;
import org.apache.pdfbox.exceptions.COSVisitorException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

/**
 *
 * @author alexander
 */
public class PdfTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, COSVisitorException {
        System.out.println("Greate Simple PDF file with blank page");
        
        String fileName = "EmptyPDF.pdf";
        
        try{
        PDDocument doc = new PDDocument();
        
        doc.addPage(new PDPage());
        doc.save(fileName);
        doc.close();
        System.out.println("Your file created in: " + System.getProperty("user.dir"));
        
               
        } catch(IOException | COSVisitorException e){
        System.out.println(e.getMessage());
        
        }
    }
    
}
