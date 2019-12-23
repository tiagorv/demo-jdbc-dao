package application;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Department obj = new Department(1, "Artigos Esportivos");
		Seller vendedor = new Seller(21, "Tiago Valério", "tiagorv@teste.com.br", new Date(sdf.parse("12/01/1981").getTime()), 2130.44, obj);
		System.out.println(vendedor);
	}

}
