
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona
    {
    //atributos
    private String codigo,nombre,mail;
    
    //constructor
    
    public Persona(){
        
    }
    
    public Persona(String codigo,String nombre,String mail){
    
        this.codigo = codigo;
        this.nombre = nombre;
        this.mail = mail;
    }

    //Start GetterSetterExtension Source Code

    /**GET Method Propertie codigo*/
    public String getCodigo(){
        return this.codigo;
    }//end method getCodigo

    /**SET Method Propertie codigo*/
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }//end method setCodigo

    /**GET Method Propertie nombre*/
    public String getNombre(){
        return this.nombre;
    }//end method getNombre

    /**SET Method Propertie nombre*/
    public void setNombre(String nombre){
        this.nombre = nombre;
    }//end method setNombre

    /**GET Method Propertie mail*/
    public String getMail(){
        return this.mail;
    }//end method getMail

    /**SET Method Propertie mail*/
    public void setMail(String mail){
        this.mail = mail;
    }//end method setMail

    //End GetterSetterExtension Source Code


    }