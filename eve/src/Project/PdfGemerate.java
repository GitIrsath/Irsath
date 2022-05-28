package Project;
import com.itextpdf.text.Document;

import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.*;
import com.itextpdf.text.Phrase;

public class PdfGemerate {
      public static void main(String[] args) {
          try {		
    	  String file_name="D:\\generated pdf";
	      Document document=new Document();
	      
	      PdfWriter.getInstance(document, new FileOutputStream(file_name));
	      
	      document.open();
	      
	      Paragraph para=new Paragraph("Names of the student and their annual marks in percentage");
	      
	      document.add(para);
	    
	      
	      PdfPTable table=new PdfPTable(3);
	      table.setSpacingBefore(10);
	      table.setSpacingAfter(0);
	      PdfPCell c1=new PdfPCell(new Phrase("John"));
	      table.addCell(c1); 
	      
	      c1=new PdfPCell(new Phrase("Meera"));
	      table.addCell(c1);
	      
	      c1=new PdfPCell(new Phrase("Ravi"));
	      table.addCell(c1);
	     table.setHeaderRows(1);
	      
	      table.addCell("88%");
	      table.addCell("91%");
	      table.addCell("67%");
	     
	     
	 
	      document.add(table);
	     
	      document.close();
	      
	      System.out.println("Wooo! Pdf Generated");
	   
          }catch(Exception e) {		
			e.printStackTrace();
		}
      }
}
 