package com.soap.client;

import java.rmi.RemoteException;

import com.soap.negocio.CadastraService;
import com.soap.negocio.CadastraServiceProxy;
import com.soap.negocio.Cliente;

public class ClienteMain {

	public static void main(String[] args) {
		CadastraService cadastra = new CadastraServiceProxy();
		try {
			Cliente cliente = cadastra.cadastrar("Wander Torres", 26);
			System.out.println("Cliente cadastrado: " +cliente.getNome()+" de "+cliente.getIdade()+" anos");
		} catch (RemoteException e) {
			System.out.println("Erro!");
			e.printStackTrace();
		}

	}

}
