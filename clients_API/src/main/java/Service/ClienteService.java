package Service;

import DTO.ClienteDto;
import model.Cliente;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ClienteRepository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;
    
    @Autowired
    private Logger log;


    public List<ClienteDto>findAll(){
        List<Cliente> listaClientes = (List<Cliente>) repository.findAll();
        List<ClienteDto> clientesDto = new ArrayList<>();
        for(Cliente c : listaClientes){
            ClienteDto cliDto = new ClienteDto();
            cliDto.parseClienteDto(c);
            cliDto.setIdade(getIdade(c.getDataNascto()));
            clientesDto.add(cliDto);
        }
        return clientesDto;
    }

    public ClienteDto findById(Long id){
        Cliente cliente = new Cliente();
        cliente.parseClienteOptional(repository.findById(id));
        ClienteDto cliDto = new ClienteDto();
        cliDto.parseClienteDto(cliente);
        cliDto.setIdade(getIdade(cliente.getDataNascto()));
        return cliDto;
    }

    public ClienteDto save(Cliente cliente){
        ClienteDto cliDto = new ClienteDto();
        if(cliente.equals(null)){
            log.info("Cliente nulo");
            return new ClienteDto();
        } else {
            repository.save(cliente);
            log.info("Cliente salvo com sucesso!" + "nome:" + cliente.getNome());
            Optional<Cliente> cli = repository.findById(cliente.getId());
            if(cli!=null){
                cliDto.parseClienteDto(cliente);
                cliDto.setIdade(getIdade(cliente.getDataNascto()));
            }
        }
        return cliDto;
    }

    public void deleteById(Long id){
        if(id != null || id != 0 ) {
            repository.deleteById(id);
            log.info("Cliente deletado com sucesso!");
        } else {
            log.info("Id inválido! ");
        }
    }

    public ClienteDto update(Cliente cliente) {
        ClienteDto cliDto = new ClienteDto();
       repository.save(cliente);
       log.info("Update realizado com sucesso!");
        Optional<Cliente> cli = repository.findById(cliente.getId());
        if(cli!=null){
            cliDto.parseClienteDto(cliente);
            cliDto.setIdade(getIdade(cliente.getDataNascto()));
        }
        return cliDto;
    }

    public int getIdade(Date data) {
        Calendar cData = Calendar.getInstance();
        Calendar cHoje= Calendar.getInstance();
        cData.setTime(data);
        cData.set(Calendar.YEAR, cHoje.get(Calendar.YEAR));
        int idade = cData.after(cHoje) ? -1 : 0;
        cData.setTime(data);
        idade += cHoje.get(Calendar.YEAR) - cData.get(Calendar.YEAR);
        return idade;
    }


}
