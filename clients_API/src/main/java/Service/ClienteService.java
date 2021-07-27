package Service;

import jdk.internal.jline.internal.Log;
import model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ClienteRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;


    public List<Cliente>findAll(){
        List<Cliente> listaClientes = (List<Cliente>) repository.findAll();
        return listaClientes;
    }

    public Optional<Cliente> findById(Long id){
        return repository.findById(id);
    }

    public void save(Cliente cliente){
        if(cliente.equals(null)){
            Log.info("Cliente nulo");
        } else {
            repository.save(cliente);
            Log.info("Cliente salvo com sucesso!" + "nome:" + cliente.getNome());
        }
    }

    public void deleteById(Long id){
        if(id != null || id != 0 ) {
            repository.deleteById(id);
            Log.info("Cliente deletado com sucesso!");
        } else {
            Log.info("Id inválido! ");
        }
    }

    public Object update(Cliente cliente) {
       return repository.save(cliente);
    }
}
