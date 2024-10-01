
public class CadastroUsuario {
    public static void main(String[] args) throws IdadeInvalidaException {
        Usuario usuario = new Usuario();
        try {            
        	usuario.setNome(" ");
        } catch (NomeInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());            
        } 
        
        finally { System.out.println("Erro!"); 
           
        }
        
    }
}