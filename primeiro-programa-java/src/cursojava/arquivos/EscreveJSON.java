package cursojava.arquivos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class EscreveJSON {

	public static void main(String[] args) throws IOException {


		Usuario usuario1 = new Usuario();
		usuario1.setCpf("13502004684");
		usuario1.setLogin("alisson");
		usuario1.setSenha("Adcv9386");
		usuario1.setNome("Alisson Deives");
		
		Usuario usuario2 = new Usuario();
		usuario2.setCpf("14461521621");
		usuario2.setLogin("rafaela");
		usuario2.setSenha("03011978");
		usuario2.setNome("Rafaela Restier");
		
		Usuario usuario3 = new Usuario();
		usuario3.setCpf("72943777668");
		usuario3.setLogin("nivaldo");
		usuario3.setSenha("061294");
		usuario3.setNome("Nivaldo Francisco");
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		usuarios.add(usuario3);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String jsonUser = gson.toJson(usuarios);
		
		System.out.println(jsonUser);
		
		FileWriter fileWriter = new FileWriter("C:\\Users\\Alisson\\Documents\\GitHub\\primeiro-projeto-java\\primeiro-programa-java\\src\\cursojava\\arquivos\\filsejson.json");
		
		fileWriter.write(jsonUser);
		fileWriter.flush();
		fileWriter.close();
		
		
	}

}
