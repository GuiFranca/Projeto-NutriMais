package beans;

import beans.Anamnese;
import beans.Antropometria;
import beans.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-19T15:22:09")
@StaticMetamodel(Paciente.class)
public class Paciente_ { 

    public static volatile SingularAttribute<Paciente, Integer> idPaciente;
    public static volatile CollectionAttribute<Paciente, Anamnese> anamneseCollection;
    public static volatile SingularAttribute<Paciente, Integer> dataDeNascimento;
    public static volatile CollectionAttribute<Paciente, Usuario> usuarioCollection;
    public static volatile SingularAttribute<Paciente, String> indicacao;
    public static volatile SingularAttribute<Paciente, String> convMedico;
    public static volatile SingularAttribute<Paciente, String> sexo;
    public static volatile SingularAttribute<Paciente, String> cart;
    public static volatile SingularAttribute<Paciente, String> motivo;
    public static volatile SingularAttribute<Paciente, String> estadocivil;
    public static volatile SingularAttribute<Paciente, String> bairro;
    public static volatile SingularAttribute<Paciente, String> cidade;
    public static volatile SingularAttribute<Paciente, String> etnia;
    public static volatile SingularAttribute<Paciente, String> cep;
    public static volatile SingularAttribute<Paciente, String> medico;
    public static volatile SingularAttribute<Paciente, String> email;
    public static volatile SingularAttribute<Paciente, String> telefone;
    public static volatile SingularAttribute<Paciente, String> profissao;
    public static volatile SingularAttribute<Paciente, String> nome;
    public static volatile CollectionAttribute<Paciente, Antropometria> antropometriaCollection;
    public static volatile SingularAttribute<Paciente, String> endereco;
    public static volatile SingularAttribute<Paciente, String> hospital;

}