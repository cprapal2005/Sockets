import java.io.*;
import java.net.*;

public class ejemplo1Servidor {

	public static void main(String[] args) throws IOException {
		
		ServerSocket servidor = new ServerSocket(6000);
		Socket clienteConectado = null;
		System.out.println("Esperando al cliente....");
		clienteConectado = servidor.accept();
		InputStream entrada = clienteConectado.getInputStream();
		DataInputStream flujoEntrada = new DataInputStream(entrada);
		System.out.println("Recibiendo del Cliente: \n" + flujoEntrada.readUTF());
		OutputStream salida = clienteConectado.getOutputStream();
		DataOutputStream flujoSalida = new DataOutputStream(salida);
		flujoSalida.writeUTF("Saludos al cliente del servidor de Christian");
		entrada.close();
		flujoEntrada.close();
		salida.close ();
		flujoSalida.close ();
		clienteConectado.close();
		servidor.close();
		
	}

}
