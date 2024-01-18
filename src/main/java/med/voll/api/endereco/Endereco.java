package med.voll.api.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode ( of = "id")
public class Endereco {
    private String logradoro ;
    private String bairro ;
    private String cep ;
    private String cidade ;
    private String uf ;
    private String numero;
    private  String complemento ;

}