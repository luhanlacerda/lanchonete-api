package pos.fiap.lanchonete.adapter.out.mongo.entities;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import pos.fiap.lanchonete.domain.enums.StatusPedidoEnum;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@Document("pedido")
public class PedidoEntity {

    @Id
    private String numeroPedido;
    private String cpfCliente;
    private Double valorTotal;
    private List<ProdutoEntity> itens;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataAtualizacao;
    private StatusPedidoEnum statusPedido;
}
