package models;

public class InformacionEstudiante {

    private String nombre;
    private String apellido;
    private String email;
    private String genero;
    private String celular;
    private String cumpleano;
    private String asignatura;
    private String hobbies;
    private String imagen;
    private String direccion;
    private String estado;
    private String ciudad;

    public InformacionEstudiante(String nombre, String apellido, String email, String genero, String celular, String cumpleano,
                                 String asignatura, String hobbies, String imagen, String direccion, String estado, String ciudad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.genero = genero;
        this.celular = celular;
        this.cumpleano = cumpleano;
        this.asignatura = asignatura;
        this.hobbies = hobbies;
        this.imagen = imagen;
        this.direccion = direccion;
        this.estado = estado;
        this.ciudad = ciudad;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCumpleano() {
        return cumpleano;
    }

    public void setCumpleano(String cumpleano) {
        this.cumpleano = cumpleano;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }


}
