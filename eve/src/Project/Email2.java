package Project;
import java.util.Properties;


import javax.mail.*;  
import javax.mail.internet.*;  
public class Email2 {
	public static void main(String[] args)throws Exception {
		
	System.out.println("Email started to sent");
	
	  final String user="dummmy131@gmail.com";
	  final String password="dummydummy@123";  
	    
	 String to="mdirsath13@gmail.com";
	  
	   //Properties for accessing smtp server  
	   Properties props = new Properties();  
	   props.put("mail.smtp.host","smtp.gmail.com");  
	   props.put("mail.smtp.auth", "true"); 
	   props.put("mail.smtp.port", "587");
	   props.put("mail.smtp.starttls.enable", "true");
	    
	   //Get the session object   
	   Session session = Session.getDefaultInstance(props, new Authenticator() { 
		   @Override
	       protected PasswordAuthentication getPasswordAuthentication() {  
	         return new PasswordAuthentication(user,password);  
	      }  
	    });  
	  
	   //Compose the message  
	    try {  
	     MimeMessage message = new MimeMessage(session);  
	     message.setFrom(new InternetAddress(user));  
	     message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
	     message.setSubject("Programming");  
	     message.setText("Hi im going to send mail");  
	       
	    //send the message  
	     Transport.send(message);  
	  
	     System.out.println("Mail sended successfully...");  
	   
	   } catch(Exception e) {
	   	 e.printStackTrace();
	     }
	   
	  
}
}
