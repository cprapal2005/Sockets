import java.io.*;
import java.net.*;

public class ejemplo1Cliente {

	public static void main(String[] args) throws IOException {
		
		Socket cliente = new Socket("localhost", 6000);
		DataOutputStream flujoSalida = new DataOutputStream(cliente.getOutputStream());
		DataInputStream flujoEntrada = new DataInputStream(cliente.getInputStream());
		flujoSalida.writeUTF("Saludos desde PC Christian");
		
		System.out.println("Recibiendo del Servidor: \n" + flujoEntrada.readUTF());
		flujoEntrada.close();
		flujoSalida.close();
		cliente.close();
		
	}

}
