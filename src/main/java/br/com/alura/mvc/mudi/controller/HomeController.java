package br.com.alura.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Notebook Lenovo Ideapad 3i Intel Celeron-N4020 4GB 128GB SSD Tela 15,6\" Windows 11 - Prata");
		pedido.setUrlImagem("https://images-americanas.b2w.io/produtos/01/00/img/4199005/9/4199005932_1SZ.jpg");
		pedido.setUrlProduto("https://www.americanas.com.br/produto/4199005924");
		pedido.setDescricao("Alta performance com o Notebook Lenovo Ideapad.\r\n"
				+ "\r\n"
				+ "O Notebook Lenovo Ideapad 3i é perfeito para o seu dia a dia.\r\n"
				+ "\r\n"
				+ "Completo, conta com tela ultrafina de 15.6” para que você possa aproveitar o melhor, seja para o trabalho ou diversão. Conta ainda com bateria de ótima duração e webcam para você fazer as suas videochamadas.\r\n"
				+ "\r\n"
				+ "Além disso, possui processador Intel Celeron N4020 que garante ótimo desempenho até mesmo para os usuários que necessitam passar mais tempo com o aparelho.\r\n"
				+ "\r\n"
				+ "Você merece ter um notebook com alta performance para as suas tarefas do dia a dia, e com toda a qualidade Lenovo.");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);;
		return "home";
	}
}
