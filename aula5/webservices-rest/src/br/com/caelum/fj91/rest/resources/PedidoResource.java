package br.com.caelum.fj91.rest.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;

import br.com.caelum.fj91.rest.db.Repositorio;
import br.com.caelum.fj91.rest.model.Endereco;
import br.com.caelum.fj91.rest.model.Pedido;
import br.com.caelum.fj91.rest.model.Pedido.Status;

@Path("/pedido/{id}")
public class PedidoResource {

	@GET
	@Produces("application/xml")
	public Pedido getPedido(@PathParam("id") String id) {
		Pedido pedido = Repositorio.pedidos.get(id);
		if (pedido == null) {
			throw new WebApplicationException(404); // se nao foi encontrado, devolve 404
		}
		return pedido;
	}

	@PUT
	@Consumes("application/xml")
	public void putPedido(@PathParam("id") String id, Pedido pedido) {
		Repositorio.pedidos.put(id, pedido);
	}

	@GET
	@Path("/refresh")
	@Produces("application/xml")
	public Pedido refresh(@PathParam("id") String id) {
		return getPedido(id);
	}

	@PUT
	@Path("/atualizar")
	@Consumes("application/xml")
	public void atualizar(@PathParam("id") String id, Pedido p) {
		putPedido(id, p);
	}

	@POST
	@Path("/pagar")
	@Consumes("text/plain")
	public void pagar(@PathParam("id") String id, @QueryParam("numeroCartao") String numeroCartao) {
		System.out.println("Pagando o pedido com o cartao: " + numeroCartao);
		
		getPedido(id).setStatus(Status.PAGO);
	}

	@PUT
	@Path("/enviar")
	@Produces("application/xml")
	@Consumes("application/xml")
	public Pedido enviar(@PathParam("id") String id, Endereco enderecoEnvio) {
		Pedido pedido = getPedido(id);
		pedido.setEnderecoEnvio(enderecoEnvio);
		pedido.setStatus(Status.ENVIADO);
		return pedido;
	}

	@POST
	@Path("/cancelar")
	@Consumes("text/plain")
	public void cancelar(@PathParam("id") String id, @QueryParam("observacao") String observacao) {
		Pedido pedido = getPedido(id);
		pedido.setObservacao(observacao);
		pedido.setStatus(Status.CANCELADO);
	}

}
