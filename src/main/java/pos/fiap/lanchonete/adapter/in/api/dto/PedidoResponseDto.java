package pos.fiap.lanchonete.adapter.in.api.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import pos.fiap.lanchonete.domain.model.DadosProduto;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Getter
@Builder
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PedidoResponseDto implements Serializable {

    @Serial
    private static final long serialVersionUID = -5675009956810195511L;
    private String cpfCliente;
    private String numeroPedido;
    private List<DadosProduto> itens;
    private Double valorTotal;
    private String mensagemPedido;
}
