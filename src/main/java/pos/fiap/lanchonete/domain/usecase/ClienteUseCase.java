package pos.fiap.lanchonete.domain.usecase;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pos.fiap.lanchonete.domain.model.DadosCliente;
import pos.fiap.lanchonete.domain.model.entity.mapper.ClienteMapper;
import pos.fiap.lanchonete.domain.port.ClienteUseCasePort;

@Service
@RequiredArgsConstructor
public class ClienteUseCase implements ClienteUseCasePort {
    private final ClienteMapper clienteMapper;

    @Override
    public DadosCliente cadastrar(DadosCliente dadosCliente) {
        var cliente = clienteMapper.fromDadosCliente(dadosCliente);
        return clienteMapper.toDadosCliente(cliente);
    }
}